import java.util.Scanner;

public class Jogo {
    Scanner input = new Scanner(System.in);

    public static final int NUMERO_ELEMENTOS = 4;
    public static final int ELEMENTO_TERRA = 0;
    public static final int ELEMENTO_AGUA = 1;
    public static final int ELEMENTO_FOGO = 2;
    public static final int ELEMENTO_AR = 3;

    public static final int PODER_MINIMO = 10;
    public static final int PODER_MAXIMO = 30;
    public static final int ATAQUE_MINIMO = 5;
    public static final int ATAQUE_MAXIMO = 15;
    public static final int DEFESA_MINIMO = 5;
    public static final int DEFESA_MAXIMO = 15;
    public static final int VELOCIDADE_MINIMO = 1;
    public static final int VELOCIDADE_MAXIMO = 10;
    public static final int VIDA_MINIMO = 200;
    public static final int VIDA_MAXIMO = 400;

    private boolean jogando = false;
    private Elementos elementos[];
    private int elementosOrdemVelocidade[];
    private int elemento;

    public Jogo() {
        elementos = new Elementos[NUMERO_ELEMENTOS];
        elementosOrdemVelocidade = new int[NUMERO_ELEMENTOS];
        elementos[ELEMENTO_TERRA] = new Terra();
        elementos[ELEMENTO_AGUA] = new Agua();
        elementos[ELEMENTO_FOGO] = new Fogo();
        elementos[ELEMENTO_AR] = new Ar();
    }

    public void ordenarElementosPorVelocidade() {
        // seta todos os elementos como selecionado=falso para serem comparados
        for (int i = 0; i < NUMERO_ELEMENTOS; i++) {
            elementos[i].selecionado = false;
        }
        // seta indice, tipoElemento e maiorVelocidade negativos para comparar
        for (int j = 0; j < NUMERO_ELEMENTOS; j++) {
            int indice = -1;
            int tipoElemento = -1;
            double maiorVelocidade = -1;
            // ordena por indice em array os elementos mais rapidos
            for (int i = 0; i < NUMERO_ELEMENTOS; i++) {
                if ((elementos[i].selecionado == false) && (elementos[i].getVelocidade() > maiorVelocidade)) {
                    tipoElemento = elementos[i].getTipoElemento();
                    indice = i;
                    maiorVelocidade = elementos[i].getVelocidade();
                }
            }
            elementosOrdemVelocidade[j] = tipoElemento;
            elementos[indice].selecionado = true;
        }
    }

    public boolean estaJogando() {
        return jogando;
    }

    public int escolherElemento() {
        int criatura;

        System.out.println("Escolha uma das Criaturas abaixo");
        System.out.println("1 - StoneDev (terra)\n2 - WaveNerd (água)\n3 - BurnCoder (fogo)\n4 - BreezeHacker (ar)\n");
        criatura = input.nextInt();
        while (criatura < 1 || criatura > 4) {
            System.out.println("Criatura invalida, por favor selecione uma criatura existente.");
            System.out.println(
                    "1 - StoneDev (terra)\n2 - WaveNerd (água)\n3 - BurnCoder (fogo)\n4 - BreezeHacker (ar)\n");
            criatura = input.nextInt();
        }

        return criatura - 1;
    }

    public void inicializarJogo() {
        for (int i = 0; i < NUMERO_ELEMENTOS; i++) {
            this.elementos[i].resetarObjeto();
        }
        this.elemento = escolherElemento();
        this.jogando = true;
    }

    public void rodada() {

    }
}