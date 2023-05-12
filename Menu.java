//import java.util.IllegalFormatCodePointException;
//import java.util.Scanner;
////BUGS
////
//
//public class Menu {
//    Scanner input = new Scanner(System.in);
//    Acao acao = new Acao();
//    Criatura terra = new Terra();
//    Criatura fogo = new Fogo();
//    Criatura agua = new Agua();
//    Criatura ar = new Ar();
//
//    public void status() {
//        System.out.println(agua.getVelocidade());
//        System.out.println(fogo.getVelocidade());
//        System.out.println(terra.getVelocidade());
//        System.out.println(ar.getVelocidade());
//    }
//
//    public void proximaBatalha(int posicao, Criatura criatura1, Criatura criatura2, Criatura criatura3){
//        int id = acao.verificadorDeVelocidade(posicao,criatura1.getVelocidade(),criatura2.getVelocidade(),criatura3.getVelocidade());
//        switch (id){
//            case 1:
//                if (id == 2) {
//                    do {
//                        menuRodada(terra, agua);
//                    } while (terra.getVida() > 0 || agua.getVida() > 0);
//                }
//                if (id == 3) {
//                    do {
//                        menuRodada(terra, fogo);
//                    } while (terra.getVida() > 0 || fogo.getVida() > 0);
//                }
//                if (id == 4) {
//                    menuRodada(terra, ar);
//                    do {
//                        menuRodada(terra, ar);
//                    } while (terra.getVida() > 0 || ar.getVida() > 0);
//                }
//                break;
//            case 2:
//                if (id == 1) {
//                    do {
//                        menuRodada(agua, terra);
//                    } while (agua.getVida() > 0 || terra.getVida() > 0);
//                }
//                if (id == 3) {
//                    do {
//                        menuRodada(agua, fogo);
//                    } while (agua.getVida() > 0 || fogo.getVida() > 0);
//                }
//                if (id == 4) {
//                    do {
//                        menuRodada(agua, ar);
//                    } while (agua.getVida() > 0 || ar.getVida() > 0);
//
//
//                }
//                break;
//            case 3:
//                if (id == 2) {
//                    do {
//                        menuRodada(fogo, agua);
//                    } while (fogo.getVida() > 0 || agua.getVida() > 0);
//                }
//                if (id == 4) {
//
//                    do {
//                        menuRodada(fogo, ar);
//                    } while (fogo.getVida() > 0 || ar.getVida() > 0);
//                }
//                if (id == 1) {
//                    do {
//                        menuRodada(fogo, terra);
//                    } while (fogo.getVida() > 0 || terra.getVida() > 0);
//                }
//                break;
//            case 4:
//                if (id == 2) {
//                    do {
//                        menuRodada(ar, terra);
//
//                    } while (ar.getVida() > 0 || terra.getVida() > 0);
//                }
//                if (id == 3) {
//                    menuRodada(ar, fogo);
//                    do {
//                        menuRodada(ar, fogo);
//
//                    } while (ar.getVida() > 0 || fogo.getVida() > 0);
//                }
//                if (id == 1) {
//                    menuRodada(ar, agua);
//                    do {
//                        menuRodada(ar, agua);
//
//                    } while (ar.getVida() > 0 || agua.getVida() > 0);
//                }
//                break;
//        }
//    }
//
//    public void playGame() {
//
//        int jogador = menuEscolhaPersonagem();
//        int contadorBatalha = 0;
//
//        do {
//            if (jogador == 1) {
//                contadorBatalha++;
//                int id = batalhaDaVez(contadorBatalha - 1, agua, fogo, ar);
//                if (id == 2) {
//                    do {
//                        menuRodada(terra, agua);
//
//                    } while (terra.getVida() > 0 || agua.getVida() > 0);
//                    if (terra.getVida()>0&& agua.getVida()<=0){
//                        proximaBatalha(1,agua,fogo,ar);
//                    }
//
//                }
//                if (id == 3) {
//                    do {
//                        menuRodada(terra, fogo);
//                    } while (terra.getVida() > 0 || fogo.getVida() > 0);
//                    if (terra.getVida()>0&& fogo.getVida()<=0){
//                        proximaBatalha(1,agua,fogo,ar);
//                    }
//                }
//                if (id == 4) {
//                    menuRodada(terra, ar);
//                    do {
//                        menuRodada(terra, ar);
//                    } while (terra.getVida() > 0 || ar.getVida() > 0);
//                    if (terra.getVida()>0&& ar.getVida()<=0){
//                        proximaBatalha(1,agua,fogo,ar);
//                    }
//                }
//            }
//            if (jogador == 2) {
//                contadorBatalha++;
//                int id = batalhaDaVez(contadorBatalha - 1, terra, fogo, ar);
//                if (id == 1) {
//                    do {
//                        menuRodada(agua, terra);
//                    } while (agua.getVida() > 0 || terra.getVida() > 0);
//                }
//                if (id == 3) {
//                    do {
//                        menuRodada(agua, fogo);
//                    } while (agua.getVida() > 0 || fogo.getVida() > 0);
//                }
//                if (id == 4) {
//                    do {
//                        menuRodada(agua, ar);
//                    } while (agua.getVida() > 0 || ar.getVida() > 0);
//
//                }
//            }
//            if (jogador == 3) {
//                contadorBatalha++;
//                int id = batalhaDaVez(contadorBatalha - 1, terra, agua, ar);
//                if (id == 2) {
//                    do {
//                        menuRodada(fogo, agua);
//                    } while (fogo.getVida() > 0 || agua.getVida() > 0);
//                }
//                if (id == 4) {
//
//                    do {
//                        menuRodada(fogo, ar);
//                    } while (fogo.getVida() > 0 || ar.getVida() > 0);
//                }
//                if (id == 1) {
//                    do {
//                        menuRodada(fogo, terra);
//                    } while (fogo.getVida() > 0 || terra.getVida() > 0);
//                }
//
//            }
//            if (jogador == 4) {
//                contadorBatalha++;
//                int id = batalhaDaVez(contadorBatalha - 1, terra, fogo, agua);
//                if (id == 2) {
//                    do {
//                        menuRodada(ar, terra);
//
//                    } while (ar.getVida() > 0 || terra.getVida() > 0);
//                }
//                if (id == 3) {
//                    menuRodada(ar, fogo);
//                    do {
//                        menuRodada(ar, fogo);
//
//                    } while (ar.getVida() > 0 || fogo.getVida() > 0);
//                }
//                if (id == 1) {
//                    menuRodada(ar, agua);
//                    do {
//                        menuRodada(ar, agua);
//
//                    } while (ar.getVida() > 0 || agua.getVida() > 0);
//                }
//            }
//        } while (contadorBatalha != 3);
//    }
//
//    public int menuEscolhaPersonagem() {
//
//        int personagem;
//        System.out.println("Escolha o seu personagem");
//        System.out.println("1 - StoneDev ");
//        System.out.println("2 - WaveNerd ");
//        System.out.println("3 - BurnCoder  ");
//        System.out.println("4 - BreezeHacker ");
//        personagem = Integer.parseInt(input.next());
//        System.out.println("Qual o nick name ?");
//        String nome = input.next();
//        if (personagem == 1) {
//            terra.setNome(nome);
//        }
//        if (personagem == 2) {
//            agua.setNome(nome);
//        }
//        if (personagem == 3) {
//            fogo.setNome(nome);
//        }
//        if (personagem == 4) {
//            ar.setNome(nome);
//        }
//
//        return personagem;
//    }
//
//    public void menuRodada(Criatura criaturaAtacante, Criatura criaturaDefensora) {
//        if (criaturaAtacante.getVida() > 0 && criaturaDefensora.getVida() > 0) {
//            int opcao;
//            System.out.println("1 - Sair");
//            System.out.println("2 - Atacar");
//            opcao = input.nextInt();
//            if (opcao == 1) {
//                System.out.println("Você esta saindo do game");
//                System.exit(0);
//                return;
//
//            }
//            if (opcao == 2) {
//                int tipoAtaque;
//                System.out.println("1 - Deseja efetuar um ataque Fisico?");
//                System.out.println("2 - Deseja efetuar um ataque Elemental?");
//                tipoAtaque = input.nextInt();
//                int contrataAtaque = acao.geradorNumeroAleatorio(1, 2);
//                if (tipoAtaque == 1) {
//                    double fator = acao.calculoFatorPoder(criaturaAtacante.getId(), criaturaDefensora.getId());
//                    double dano = acao.ataqueFisico(criaturaAtacante.getAtaque(), criaturaAtacante.getPoder(), criaturaDefensora.getDefesa());
//                    if (dano > 0) {
//
//                        System.out.println("vida atual da sua criatura" + criaturaDefensora.getNome() + " " + criaturaDefensora.getVida());
//                        System.out.println("A criatura " + criaturaAtacante.getNome() + " causou o dano de : " + dano);
//                        int danoCausado = (int) (criaturaDefensora.getVida() - dano);
//                        criaturaDefensora.setVida(danoCausado);
//                        System.out.println("vida atual da Criatura " + criaturaDefensora.getNome() + " Apos ataque é de : " + criaturaDefensora.getVida());
//
//
//                        if (contrataAtaque == 1) {
//                            System.out.println("\n---------------------------CONTRA ATAQUE--------------------------------------\n");
//                            System.out.println("A Criatura " + criaturaDefensora.getNome() + " atacou você");
//                            System.out.println("a sua vida atual é de  " + criaturaAtacante.getVida());
//                            double danoContraAtaque = acao.ataqueFisico(criaturaDefensora.getAtaque(), criaturaDefensora.getPoder(), criaturaAtacante.getDefesa());
//                            System.out.println(criaturaDefensora.getNome() + " causou o dano de : " + danoContraAtaque);
//                            int danoCausadoContraAtaque = (int) (criaturaAtacante.getVida() - danoContraAtaque);
//                            criaturaAtacante.setVida(danoCausadoContraAtaque);
//                            System.out.println("Sua vida após ataque é de : " + criaturaAtacante.getVida());
//                            System.out.println("\n---------------------------FIM DA RODADA--------------------------------------\n");
//                        }
//                        if (contrataAtaque == 2) {
//                            System.out.println("\n---------------------------CONTRA ATAQUE--------------------------------------\n");
//                            System.out.println("A Criatura " + criaturaDefensora.getNome() + " atacou você");
//                            System.out.println("a sua vida atual é de  " + criaturaAtacante.getVida());
//                            int danoContraAtaque = (int) acao.ataqueElemental(criaturaDefensora.getPoder(), criaturaDefensora.getAtaque(), criaturaAtacante.getDefesa(), fator);
//                            System.out.println(criaturaDefensora.getNome() + " causou o dano elemental de de : " + danoContraAtaque);
//                            int danoCausadoContraAtaque = (int) (criaturaAtacante.getVida() - danoContraAtaque);
//                            criaturaAtacante.setVida(danoCausadoContraAtaque);
//                            System.out.println("A sua vida após ataque é de : " + criaturaAtacante.getVida());
//                            System.out.println("vida atual da Criatura " + criaturaDefensora.getNome() + " Apos ataque é de : " + criaturaDefensora.getVida());
//                            System.out.println("\n---------------------------FIM DA RODADA--------------------------------------\n");
//
//                        }
//
//                    }
//                }
//                if (tipoAtaque == 2) {
//                    double fator = acao.calculoFatorPoder(criaturaAtacante.getId(), criaturaDefensora.getId());
//                    double dano = acao.ataqueElemental(criaturaAtacante.getPoder(), criaturaAtacante.getAtaque(), criaturaDefensora.getDefesa(), fator);
//                    if (dano > 0) {
//                        System.out.println("\n--------------------------- ATAQUE-----------------------------------------------\n");
//                        System.out.println("vida atual da Criatura " + criaturaDefensora.getNome() + " " + criaturaDefensora.getVida());
//                        System.out.println("A criatura " + criaturaAtacante.getNome() + " causou o dano elemental de : " + dano);
//                        int danoCausado = (int) (criaturaDefensora.getVida() - dano);
//                        criaturaDefensora.setVida(danoCausado);
//                        System.out.println("vida atual da Criatura " + criaturaDefensora.getNome() + " Apos ataque é de : " + criaturaDefensora.getVida());
//                        System.out.println("\n---------------------------CONTRA ATAQUE--------------------------------------\n");
//                        System.out.println("A Criatura " + criaturaDefensora.getNome() + " atacou você");
//                        System.out.println("a sua vida atual é de  " + criaturaAtacante.getVida());
//                        double danoContraAtaque = acao.ataqueFisico(criaturaDefensora.getAtaque(), criaturaDefensora.getPoder(), criaturaAtacante.getDefesa());
//                        System.out.println(criaturaDefensora.getNome() + " causou o dano de : " + danoContraAtaque);
//                        int danoCausadoContraAtaque = (int) (criaturaAtacante.getVida() - danoContraAtaque);
//                        criaturaAtacante.setVida(danoCausadoContraAtaque);
//                        System.out.println("Sua vida após ataque é de : " + criaturaAtacante.getVida());
//                        System.out.println("\n---------------------------FIM DA RODADA--------------------------------------\n");
//                    }
//
//                }
//
//            }
//        }
//        if (criaturaAtacante.getVida() <= 0 && criaturaDefensora.getVida() > 0) {
//            System.out.println("Você perdeu");
//            System.exit(0);
//        }
//    }
//
//    public int batalhaDaVez(int contador, Criatura criatura1, Criatura criatura2, Criatura criatura3) {
//        if (contador == 1) {
//            int primeiraBatalha = acao.verificadorDeVelocidade(criatura1.getVelocidade(), criatura2.getVelocidade(), criatura3.getVelocidade(), 0);
//            if (primeiraBatalha == criatura1.getVelocidade()) {
//                return criatura1.getId();
//            }
//            if (primeiraBatalha == criatura2.getVelocidade()) {
//                return criatura2.getId();
//            }
//            if (primeiraBatalha == criatura3.getVelocidade()) {
//                return criatura3.getId();
//            }
//
//        }
//        if (contador == 2) {
//            int segundaBatalha = acao.verificadorDeVelocidade(criatura1.getVelocidade(), criatura2.getVelocidade(), criatura3.getVelocidade(), 1);
//            if (segundaBatalha == agua.getVelocidade()) {
//                if (segundaBatalha == criatura1.getVelocidade()) {
//                    return criatura1.getId();
//                }
//                if (segundaBatalha == criatura2.getVelocidade()) {
//                    return criatura2.getId();
//                }
//                if (segundaBatalha == criatura3.getVelocidade()) {
//                    return criatura3.getId();
//                }
//            }
//        }
//        if (contador == 3) {
//            int segundaBatalha = acao.verificadorDeVelocidade(criatura1.getVelocidade(), criatura2.getVelocidade(), criatura3.getVelocidade(), 2);
//            if (segundaBatalha == agua.getVelocidade()) {
//                if (segundaBatalha == criatura1.getVelocidade()) {
//                    return criatura1.getId();
//                }
//                if (segundaBatalha == criatura2.getVelocidade()) {
//                    return criatura2.getId();
//                }
//                if (segundaBatalha == criatura3.getVelocidade()) {
//                    return criatura3.getId();
//                }
//
//            }
//        }
//        return contador;
//    }
//}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    int escolha;
    Criatura criaturaSelecionada;
    int selecionar;


    public void menuInicial(){
        System.out.println("=== Menu Principal ===");
        System.out.println("1. Novo Jogo");
        System.out.println("2. Sair");
        System.out.print("Escolha: ");
        escolha = scanner.nextInt();
        switch (escolha) {
            case 1 -> selecaoCriatura();
            case 2 -> {
                System.out.println("Obrigado por jogar");
                System.exit(0);
            }
            default -> {
                System.out.println("Opção inválida!");
                menuInicial();
            }
        }
    }

    public void selecaoCriatura(){
        System.out.println("\n=== Seleção de Criaturas ===");
        System.out.println("1. StoneDev (terra)");
        System.out.println("2. WaveNerd (água)");
        System.out.println("3. BurnCoder (fogo)");
        System.out.println("4. BreezeHacker (ar)");
        System.out.println("5. Sair");
        System.out.print("Escolha a criatura: ");
        selecionar = scanner.nextInt();

        switch (selecionar) {
            case 1 -> {
                criaturaSelecionada = new StoneDev();
                System.out.println("Você selecionou: " + criaturaSelecionada.getNome());
                System.out.println("Iniciando torneio...");
                torneio(criaturaSelecionada);
            }
            case 2 -> {
                criaturaSelecionada = new WaveNerd();
                System.out.println("Você selecionou: " + criaturaSelecionada.getNome());
                System.out.println("Iniciando torneio...");
                torneio(criaturaSelecionada);
            }
            case 3 -> {
                criaturaSelecionada = new BurnCoder();
                System.out.println("Você selecionou: " + criaturaSelecionada.getNome());
                System.out.println("Iniciando torneio...");
                torneio(criaturaSelecionada);
            }
            case 4 -> {
                criaturaSelecionada = new BreezeHacker();
                System.out.println("Você selecionou: " + criaturaSelecionada.getNome());
                System.out.println("Iniciando torneio...");
                torneio(criaturaSelecionada);
            }
            case 5 -> {
                System.out.println("Saindo do programa...");
                return;
            }
            default -> {
                System.out.println("Opção inválida. Selecione as opções corretas.");
                selecaoCriatura();
            }
        }
    }

    public void torneio(Criatura criaturaSelecionada) {
        List<Criatura> criaturasOponentes = new ArrayList<>();
        criaturasOponentes.add(new StoneDev());
        criaturasOponentes.add(new WaveNerd());
        criaturasOponentes.add(new BurnCoder());
        criaturasOponentes.add(new BreezeHacker());

        criaturasOponentes.sort(Comparator.comparingInt(Criatura::getVel).reversed());;

        for (Criatura criaturaOponente : criaturasOponentes) {
            if (!criaturaOponente.equals(criaturaSelecionada)) {
                batalha(criaturaSelecionada, criaturaOponente);
                if (criaturaSelecionada.estaDerrotada()) {
                    System.out.println("Você foi derrotado. O torneio será encerrado.");
                    return;
                } else if (criaturaOponente.estaDerrotada()) {
                    System.out.println("Parabéns, você derrotou " + criaturaOponente.getNome() + ".");
                    System.out.println("Prossiga para a próxima batalha.");
                }
            }
        }

        if (todasCriaturasOponentesDerrotadas()) {
            System.out.println("Você venceu o torneio!");
            return;
        }
    }

    public void batalha(Criatura criaturaSelecionada, Criatura criaturaOponente) {
        while (true) {
            menuAcoes(criaturaSelecionada, criaturaOponente);

            if (criaturaOponente.estaDerrotada()) {
                System.out.println("Parabéns, você derrotou " + criaturaOponente.getNome() + "!");
                break;
            }

            menuAcoes(criaturaSelecionada, criaturaOponente);

            if (criaturaSelecionada.estaDerrotada()) {
                System.out.println("Você foi derrotado por " + criaturaOponente.getNome() + ".");
                return;
            }
        }

        if (todasCriaturasOponentesDerrotadas()) {
            System.out.println("Você venceu o torneio!");
            return;
        } else {
            System.out.println("Prossiga para a próxima batalha.");
            Criatura proximoOponente = ProximoOponente(criaturaOponente);
            batalha(criaturaSelecionada, proximoOponente);
        }
    }

    private Criatura ProximoOponente(Criatura criaturaOponenteAtual) {
        List<Criatura> criaturasOponentes = new ArrayList<>();
        criaturasOponentes.add(new StoneDev());
        criaturasOponentes.add(new WaveNerd());
        criaturasOponentes.add(new BurnCoder());
        criaturasOponentes.add(new BreezeHacker());

        int indexAtual = criaturasOponentes.indexOf(criaturaOponenteAtual);
        int proximoIndex = (indexAtual + 1) % criaturasOponentes.size();

        return criaturasOponentes.get(proximoIndex);
    }

    private boolean todasCriaturasOponentesDerrotadas() {
        List<Criatura> criaturasOponentes = new ArrayList<>();
        criaturasOponentes.add(new StoneDev());
        criaturasOponentes.add(new WaveNerd());
        criaturasOponentes.add(new BurnCoder());
        criaturasOponentes.add(new BreezeHacker());

        for (Criatura criaturaOponente : criaturasOponentes) {
            if (!criaturaOponente.estaDerrotada()) {
                return false;
            }
        }
        return true;
    }

    public void menuAcoes(Criatura criaturaSelecionada, Criatura criaturaOponente) {
        System.out.println("\n=== Menu de Ações ===");
        System.out.println("1. Ataque Físico");
        System.out.println("2. Ataque Elemental");
        System.out.println("3. Fugir");

        System.out.print("Escolha a ação: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> Acao.ataqueFisico(criaturaSelecionada, criaturaOponente);
            case 2 -> Acao.ataqueElemental(criaturaSelecionada, criaturaOponente);
            case 3 -> System.out.println("Você fugiu da batalha.");
            default -> {
                System.out.println("Opção inválida. Escolha uma ação válida.");
                menuAcoes(criaturaSelecionada, criaturaOponente);
            }
        }

        Acao.ataqueCriaturaOponente(criaturaSelecionada, criaturaOponente);
    }

}