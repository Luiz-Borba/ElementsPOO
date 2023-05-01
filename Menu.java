import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Acao acao = new Acao();
    Criatura terra = new Terra();
    Criatura fogo = new Fogo();
    Criatura agua = new Agua();
    Criatura ar = new Ar();
    public void status(){
        System.out.println(agua.getVelocidade());
        System.out.println(fogo.getVelocidade());
        System.out.println(terra.getVelocidade());
        System.out.println(ar.getVelocidade());
    }

    public void playGame(){
        int vida =1;

        int jogador = menuEscolhaPersonagem();

        int contadorBatalha = 0;
        int verificador = 1;
        do {
            if (jogador == 1) {
                verificador = terra.getVida();
                contadorBatalha++;
                int id = batalhaDaVez(contadorBatalha, agua, fogo, ar);
                if (id == 2) {
                  menuRodada(terra, agua);
                }
                if (id == 3) {
                   menuRodada(terra, fogo);
                }
                if (id == 4) {
                  menuRodada(terra, ar);
                }
                 vida = terra.getVida();
            }
            if (jogador == 2) {
                verificador = agua.getVida();
                contadorBatalha++;
                int id = batalhaDaVez(contadorBatalha, terra, fogo, ar);
                if (id == 1) {
                    menuRodada(agua, terra);
                }
                if (id == 3) {
                    menuRodada(agua, fogo);
                }
                if (id == 4) {
                    menuRodada(agua, ar);
                }
                vida = agua.getVida();

            }
            if (jogador == 3) {
                verificador = fogo.getVida();
                contadorBatalha++;
                int id = batalhaDaVez(contadorBatalha, terra, agua, ar);
                if (id == 2) {
                    menuRodada(fogo, agua);
                }
                if (id == 4) {
                    menuRodada(fogo, ar);
                }
                if (id == 1) {
                    menuRodada(fogo, terra);
                }
                vida = fogo.getVida();
            }

            if (jogador == 4) {
                    verificador = ar.getVida();
                    contadorBatalha++;
                    int id = batalhaDaVez(contadorBatalha, terra, fogo, agua);
                    if (id == 2) {
                        menuRodada(ar, terra);
                    }
                    if (id == 3) {
                        menuRodada(ar, fogo);
                    }
                    if (id == 1) {
                        menuRodada(ar, agua);
                    }
                vida = ar.getVida();
                }

        } while (contadorBatalha != 3 && verificador != 0||vida>0);

    }


    public int menuEscolhaPersonagem() {

        int personagem;
        System.out.println("Escolha o seu personagem");
        System.out.println("1 - StoneDev ");
        System.out.println("2 - WaveNerd ");
        System.out.println("3 - BurnCoder  ");
        System.out.println("4 - BreezeHacker ");
        personagem = Integer.parseInt(input.next());
        System.out.println("Qual o nick name ?");
        String nome = input.next();
        if (personagem ==1){
            terra.setNome(nome);
        }
        if (personagem ==2){
            agua.setNome(nome);
        }
        if (personagem ==3){
            fogo.setNome(nome);
        }
        if (personagem ==4){
            ar.setNome(nome);
        }

        return personagem;
    }
    public void  menuRodada(Criatura criaturaAtacante,Criatura criaturaDefensora) {
        int opcao;
        System.out.println("1 - Sair");
        System.out.println("2 - Atacar");
        opcao = input.nextInt();
        if (opcao == 1) {
            System.out.println("Você esta saindo do game");
            return;

        }
        if (opcao == 2) {
            int tipoAtaque;
            System.out.println("1 - Deseja efetuar um ataque Fisico?");
            System.out.println("2 - Deseja efetuar um ataque Elemental?");
            tipoAtaque = input.nextInt();
            if (tipoAtaque == 1) {
                double dano = acao.ataqueFisico(criaturaAtacante.getAtaque(), criaturaAtacante.getPoder(), criaturaDefensora.getDefesa());
                if (dano > 0) {

                    System.out.println("vida atual da Criatura " +criaturaDefensora.getNome()+" " + criaturaDefensora.getVida());
                    System.out.println("A criatura "  +criaturaAtacante.getNome()+" causou o dano de : " + dano);
                    int danoCausado = (int) (criaturaDefensora.getVida() - dano);
                    criaturaDefensora.setVida(danoCausado);
                    System.out.println("vida atual da Criatura " +criaturaDefensora.getNome()+" Apos ataque é de : " + criaturaDefensora.getVida());
                    System.out.println("\n--------------------------CONTRA ATAQUE-------------------------\n");
                    System.out.println("A Criatura "+ criaturaDefensora.getNome()+ " atacou você");
                    System.out.println("a sua vida atual é de  " + criaturaAtacante.getVida());
                    double danoContraAtaque = acao.ataqueFisico(criaturaDefensora.getAtaque(), criaturaDefensora.getPoder(), criaturaAtacante.getDefesa());
                    System.out.println( criaturaDefensora.getNome() +" causou o dano de : " + danoContraAtaque);
                    int danoCausadoContraAtaque = (int) (criaturaAtacante.getVida() - danoContraAtaque);
                    criaturaAtacante.setVida(danoCausadoContraAtaque);
                    System.out.println("Sua vida após ataque é de : " + criaturaAtacante.getVida());

                }
            }
            if (tipoAtaque == 2){
                double fator = acao.calculoFatorPoder(criaturaAtacante.getId(),criaturaDefensora.getId());
                double dano = acao.ataqueElemental(criaturaAtacante.getPoder(),criaturaAtacante.getAtaque(), criaturaDefensora.getDefesa(),fator);
                if (dano > 0) {
                    System.out.println("\n---------------------------PRIMEIRO ATAQUE-------------------------------------\n");
                    System.out.println("vida atual da Criatura " +criaturaDefensora.getNome()+" " + criaturaDefensora.getVida());
                    System.out.println("A criatura "  +criaturaAtacante.getNome()+" causou o dano elemental de : " + dano);
                    int danoCausado = (int) (criaturaDefensora.getVida() - dano);
                    criaturaDefensora.setVida(danoCausado);
                    System.out.println("vida atual da Criatura " +criaturaDefensora.getNome()+" Apos ataque é de : " + criaturaDefensora.getVida());
                    System.out.println("\n---------------------------CONTRA ATAQUE--------------------------------------\n");
                    System.out.println("A Criatura "+ criaturaDefensora.getNome()+ " atacou você");
                    System.out.println("a sua vida atual é de  " + criaturaAtacante.getVida());
                    int danoContraAtaque = (int) acao.ataqueElemental(criaturaDefensora.getPoder(),criaturaDefensora.getAtaque(), criaturaAtacante.getDefesa(),fator);
                    System.out.println(criaturaDefensora.getNome()+ " causou o dano elemental de de : " + danoContraAtaque);
                    int danoCausadoContraAtaque = (int) (criaturaAtacante.getVida() - danoContraAtaque);
                    criaturaAtacante.setVida(danoCausadoContraAtaque);
                    System.out.println("A sua vida após ataque é de : " + criaturaAtacante.getVida());
                    System.out.println("vida atual da Criatura " +criaturaDefensora.getNome()+" Apos ataque é de : " + criaturaDefensora.getVida());
                    System.out.println("\n---------------------------FIM DA RODADA--------------------------------------\n");
                }
            }

        }
    }
    public int  batalhaDaVez(int contador,Criatura criatura1,Criatura criatura2,Criatura criatura3) {
        if (contador == 1) {
            int primeiraBatalha = acao.verificadorDeVelocidade(criatura1.getVelocidade(), criatura2.getVelocidade(), criatura3.getVelocidade(), 0);
            if (primeiraBatalha == criatura1.getVelocidade()) {
                return criatura1.getId();
            }
            if (primeiraBatalha == criatura2.getVelocidade()) {
                return criatura2.getId();
            }
            if (primeiraBatalha == criatura3.getVelocidade()) {
                return criatura3.getId();
            }

        }
        if (contador == 2) {
            int segundaBatalha = acao.verificadorDeVelocidade(criatura1.getVelocidade(), criatura2.getVelocidade(), criatura3.getVelocidade(), 1);
            if (segundaBatalha == agua.getVelocidade()) {
                if (segundaBatalha == criatura1.getVelocidade()) {
                    return criatura1.getId();
                }
                if (segundaBatalha == criatura2.getVelocidade()) {
                    return criatura2.getId();
                }
                if (segundaBatalha == criatura3.getVelocidade()) {
                    return criatura3.getId();
                }
            }
        }
        if (contador == 3) {
            int segundaBatalha = acao.verificadorDeVelocidade(criatura1.getVelocidade(), criatura2.getVelocidade(), criatura3.getVelocidade(), 2);
            if (segundaBatalha == agua.getVelocidade()) {
                if (segundaBatalha == criatura1.getVelocidade()) {
                    return criatura1.getId();
                }
                if (segundaBatalha == criatura2.getVelocidade()) {
                    return criatura2.getId();
                }
                if (segundaBatalha == criatura3.getVelocidade()) {
                    return criatura3.getId();
                }

            }
        }
        return contador;
    }
}
