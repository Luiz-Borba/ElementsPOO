import java.util.Random;

public class Acao {
    public int valorAleatorio(int valorMinimo, int valorMaximo) {
        Random numero = new Random();
        int valorAleatorio = numero.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        return valorAleatorio;
    }
    public int fatorPoder(int tipoElementoFatorAtaque, int tipoElementoFatorDefesa){

    }
}
