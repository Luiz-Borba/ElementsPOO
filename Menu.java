import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    int escolha;
    Criatura criaturaSelecionada;
    int selecionar;

    public void menuInicial() {
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
                System.out.println("Opção invalida!");
                menuInicial();
            }
        }
    }

    public void selecaoCriatura() {
        System.out.println("\n=== Selecao de Criaturas ===");
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
                System.out.println("Voce selecionou: " + criaturaSelecionada.getNome());
                System.out.println("Iniciando torneio...");
                torneio(criaturaSelecionada);
            }
            case 2 -> {
                criaturaSelecionada = new WaveNerd();
                System.out.println("Voce selecionou: " + criaturaSelecionada.getNome());
                System.out.println("Iniciando torneio...");
                torneio(criaturaSelecionada);
            }
            case 3 -> {
                criaturaSelecionada = new BurnCoder();
                System.out.println("Voce selecionou: " + criaturaSelecionada.getNome());
                System.out.println("Iniciando torneio...");
                torneio(criaturaSelecionada);
            }
            case 4 -> {
                criaturaSelecionada = new BreezeHacker();
                System.out.println("Voce selecionou: " + criaturaSelecionada.getNome());
                System.out.println("Iniciando torneio...");
                torneio(criaturaSelecionada);
            }
            case 5 -> {
                System.out.println("Saindo do programa...");
                return;
            }
            default -> {
                System.out.println("Opcao invalida. Selecione as opcoes corretas.");
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

        criaturasOponentes.sort(Comparator.comparingInt(Criatura::getVel).reversed());
        ;

        for (Criatura criaturaOponente : criaturasOponentes) {
            if (!criaturaOponente.equals(criaturaSelecionada)) {
                batalha(criaturaSelecionada, criaturaOponente);
                if (criaturaSelecionada.estaDerrotada()) {
                    System.out.println("Voce foi derrotado. O torneio sera encerrado.");
                    return;
                } else if (criaturaOponente.estaDerrotada()) {
                    System.out.println("Parabens, voce derrotou " + criaturaOponente.getNome() + ".");
                    System.out.println("Prossiga para a proxima batalha.");
                }
            }
        }

        if (todasCriaturasOponentesDerrotadas()) {
            System.out.println("Voce venceu o torneio!");
            return;
        }
    }

    public void batalha(Criatura criaturaSelecionada, Criatura criaturaOponente) {
        while (true) {
            menuAcoes(criaturaSelecionada, criaturaOponente);

            if (criaturaOponente.estaDerrotada()) {
                System.out.println("Parabens, voce derrotou " + criaturaOponente.getNome() + "!");
                break;
            }

            menuAcoes(criaturaSelecionada, criaturaOponente);

            if (criaturaSelecionada.estaDerrotada()) {
                System.out.println("Voce foi derrotado por " + criaturaOponente.getNome() + ".");
                return;
            }
        }

        if (todasCriaturasOponentesDerrotadas()) {
            System.out.println("Voce venceu o torneio!");
            return;
        } else {
            System.out.println("Prossiga para a proxima batalha.");
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
        System.out.println("\n=== Menu de Acoes ===");
        System.out.println("1. Ataque Fisico");
        System.out.println("2. Ataque Elemental");
        System.out.println("3. Fugir");

        System.out.print("Escolha a acao: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> Acao.ataqueFisico(criaturaSelecionada, criaturaOponente);
            case 2 -> Acao.ataqueElemental(criaturaSelecionada, criaturaOponente);
            case 3 -> System.out.println("Voce fugiu da batalha.");
            default -> {
                System.out.println("Opcao invalida. Escolha uma acao valida.");
                menuAcoes(criaturaSelecionada, criaturaOponente);
            }
        }

        Acao.ataqueCriaturaOponente(criaturaSelecionada, criaturaOponente);
    }

}