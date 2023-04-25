import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Jogo jogo = new Jogo();

    public boolean perguntaJogador() {
        System.out.println("== MENU PRINCIPAL ==");
        System.out.println("1 - Novo jogo");
        System.out.println("2 - Sair");
        System.out.print("Escolha uma opcao: ");
        return input.nextInt() == 1;
    }

    public boolean iniciarRodada() {
        System.out.println("1 - Iniciar torneio\n2 - Sair do programa");
        return input.nextInt() == 1;
    }

    public void menu() {
        if (perguntaJogador()) {
            jogo.inicializarJogo();
            while (jogo.estaJogando()) {
                if (iniciarRodada() == false) {
                    return;
                }
                jogo.rodada();
            }
        }
    }
}