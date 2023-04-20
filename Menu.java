import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Verificacoes vereficar = new Verificacoes();
    Acao acao = new Acao();
    public boolean menu(Agua agua,Fogo fogo,Terra terra,Ar ar){
        int opcaoIniciarGame;
        int criatura;
        int gamePlay;
        int escolha;
        System.out.println("== MENU PRINCIPAL ==");
        System.out.println("1 - Novo jogo");
        System.out.println("2 - Sair");
        System.out.print("Escolha uma opção: ");
        opcaoIniciarGame = input.nextInt();
        System.out.println();

        if (opcaoIniciarGame == 1){
            System.out.println("Escolha uma das Criaturas abaixo");
            System.out.println("1 - StoneDev (terra)\n2 -  WaveNerd (água)\n3 - BurnCoder (fogo)\n4 - BreezeHacker (ar)");
            criatura = input.nextInt();
            System.out.println("1 - Inicar torneio\n2 - Sair do programa");
            gamePlay = input.nextInt();

            if (gamePlay == 1){
                if (criatura == 1){
                    int maisVeloz = vereficar.verificadorDeVelocidade(agua, fogo, ar, terra, 3);
                    if(maisVeloz == 2){
                        System.out.println("teste");
                        System.out.println("Como você deseja atacar?");
                        System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico");
                        int ataque = input.nextInt();
                        if(ataque == 1){
                            System.out.println("Você está atacando WaveNerd");
                            double fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), agua.getTipoElemento());
                            double dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), agua.getDefesa(), fator);
                            System.out.println("Terra atacou Água e dano :" + dano);
                            System.out.println("vida atual da agua:" + agua.getVida());
                            double statusVida = agua.getVida() - dano;
                            agua.setVida((int) statusVida);
                            System.out.println("vida da Água pós ataque: " + agua.getVida());
                        }
                    }
                    //codigo
                }
                if (criatura == 2){
                    //codigo
                }
                if (criatura == 3){
                    //codigo
                }
                if (criatura == 4){
                    //codigo
                }
                if (gamePlay == 2){
                    System.out.println("Fechando Programa");
                }
            }

        }


        return true;
    }

}