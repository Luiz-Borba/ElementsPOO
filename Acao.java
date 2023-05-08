import java.lang.reflect.Array;
import java.util.*;

public class Acao {
    Random gerador = new Random();

    public int geradorNumeroAleatorio(int menorValor, int maiorValor) {
        return gerador.nextInt(maiorValor - menorValor + 1) + menorValor;
    }
    int[] velocidadeGerada = new int[4];
    int contadorVelocidade = 0;

    public int gerarVelocidadeAleatoria(int menorValor, int maiorValor) {
        int gerado;
        boolean repetido;
        do {
            gerado = gerador.nextInt(maiorValor - menorValor + 1) + menorValor;
            repetido = false;
            for (int i = 0; i < contadorVelocidade; i++) {
                if (velocidadeGerada[i] == gerado) {
                    repetido = true;
                    break;
                }
            }
        } while (repetido);
        velocidadeGerada[contadorVelocidade++] = gerado;
        return gerado;
    }

    public int verificadorDeVelocidade(int inimigo1, int inimigo3, int inimigo2,int posicao) {
        int[] velocidade = new int[3];
        velocidade[0] = inimigo1;
        velocidade[1]=inimigo2;
        velocidade[2]=inimigo3;
        Arrays.sort(velocidade);


        return velocidade[posicao];
    }
    public  double calculoFatorPoder(int id1, int id2) {
        if (id1 == id2) {
            return 0.5;
        } else if ((id1 == 1 && id2 == 2) || (id1 == 2 && id2 == 1)
                || (id1 == 1 && id2 == 3) || (id1 == 3 && id2 == 1)
                || (id1 == 1 && id2 == 4) || (id1 == 4 && id2 == 1)
                || (id1 == 2 && id2 == 4) || (id1 == 4 && id2 == 2)
                || (id1 == 3 && id2 == 2) || (id1 == 2 && id2 == 3)
                || (id1 == 3 && id2 == 4) || (id1 == 4 && id2 == 3)) {
            return 1.0;
        } else if ((id1 == 1 && id2 == 2) || (id1 == 2 && id2 == 3)
                || (id1 == 3 && id2 == 4) || (id1 == 4 && id2 == 1)) {
            return 2.0;
        }
        return 0;
    }
    public int ataqueFisico(int poderAtacante,int ataqueAtacante,int defesaDefensor){
            return (poderAtacante*ataqueAtacante)/defesaDefensor;
    }
    public double ataqueElemental(int poderAtacante,int ataqueAtacante,int defesaDefensor,double fator){
        return (poderAtacante*ataqueAtacante)/defesaDefensor*fator;

    }

}
