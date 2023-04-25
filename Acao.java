import java.util.Arrays;
import java.util.Random;

public class Acao {
    private static final Random random = new Random();

    public double valorAleatorio(int valorMinimo, int valorMaximo) {

        return (double) (random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo);
    }

    public double descobrirFatorDePoder(double tipoElementoFatorAtaque, double tipoElementoFatorDefesa) {

        if (tipoElementoFatorAtaque == tipoElementoFatorDefesa) {
            return 0.5;
        }
        if (tipoElementoFatorAtaque == 1 && tipoElementoFatorDefesa == 2
                || tipoElementoFatorAtaque == 2 && tipoElementoFatorDefesa == 3
                || tipoElementoFatorAtaque == 3 && tipoElementoFatorDefesa == 4
                || tipoElementoFatorAtaque == 4 && tipoElementoFatorDefesa == 1) {
            return 2.0;
        }
        if (tipoElementoFatorAtaque == 1 && tipoElementoFatorDefesa == 3
                || tipoElementoFatorAtaque == 1 && tipoElementoFatorDefesa == 4
                || tipoElementoFatorAtaque == 2 && tipoElementoFatorDefesa == 1
                || tipoElementoFatorAtaque == 2 && tipoElementoFatorDefesa == 4
                || tipoElementoFatorAtaque == 3 && tipoElementoFatorDefesa == 1
                || tipoElementoFatorAtaque == 3 && tipoElementoFatorDefesa == 2
                || tipoElementoFatorAtaque == 4 && tipoElementoFatorDefesa == 2
                || tipoElementoFatorAtaque == 4 && tipoElementoFatorDefesa == 3) {
            return 1.0;
        }
        return 0.0;
    }

    public double calcaloAtaqueComun(double poderAtacante, double ataqueBaseAtacante, double defesaDefensor) {
        double dano = (ataqueBaseAtacante * poderAtacante) / defesaDefensor;
        return dano;
    }

    public double calculoAtaqueElemental(double poder, double ataqueBase, double defesa, double fator) {
        double dano = (poder * ataqueBase) / (defesa * fator);
        return dano;
    }

}
