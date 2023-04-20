import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public boolean menu(Agua agua,Fogo fogo,Terra terra,Ar ar){
        int opcaoIniciarGame;
        int criatura;
        int gamePlay;
        System.out.println("1 - Iniciar novo jogo\n2 - Sair");
        opcaoIniciarGame = input.nextInt();
        if (opcaoIniciarGame == 1){
            System.out.println("Escolha uma das Criaturas abaixo");
            System.out.println("1 - StoneDev (terra)\n2 -  WaveNerd (água)\n3 - BurnCoder (fogo)\n4 - BreezeHacker (ar)");
            criatura = input.nextInt();
            System.out.println("1 - Inicar torneio\n2 - Sair do programa");
            gamePlay = input.nextInt();

            if (gamePlay == 1){
                if (criatura == 1){
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
