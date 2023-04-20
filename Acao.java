import java.util.Arrays;
import java.util.Random;

public class Acao {
    private static final Random random = new Random();
    public int valorAleatorio(int valorMinimo, int valorMaximo) {

        int valorAleatorio = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        return valorAleatorio;
    }
    public double fatorPoder(double tipoElementoFatorAtaque, double tipoElementoFatorDefesa){

        if(tipoElementoFatorAtaque == tipoElementoFatorDefesa){
            return 0.5;
        }
        if (tipoElementoFatorAtaque==1 && tipoElementoFatorDefesa==2||tipoElementoFatorAtaque==2&&tipoElementoFatorDefesa==3||tipoElementoFatorAtaque==3&&tipoElementoFatorDefesa==4||tipoElementoFatorAtaque==4&&tipoElementoFatorDefesa==1){
            return 2.0;
        }
        if (tipoElementoFatorAtaque ==1&&tipoElementoFatorDefesa==3||tipoElementoFatorAtaque ==1&&tipoElementoFatorDefesa==4||tipoElementoFatorAtaque ==2&&tipoElementoFatorDefesa==1||tipoElementoFatorAtaque ==2&&tipoElementoFatorDefesa==4||tipoElementoFatorAtaque ==3&&tipoElementoFatorDefesa==1||tipoElementoFatorAtaque ==3&&tipoElementoFatorDefesa==2||tipoElementoFatorAtaque ==4&&tipoElementoFatorDefesa==2||tipoElementoFatorAtaque ==4&&tipoElementoFatorDefesa==3){
            return 1.0;
        }
        return 0.0;
    }
    public double calculoAtaqueBase(double poderAtacante,double ataqueBaseAtacante,double defesaDefensor){
        double dano = (ataqueBaseAtacante*poderAtacante)/defesaDefensor;
        return dano;
    }
    public double calculoAtaquePoder(double poder,double ataqueBase,double defesa,double fator){
        double dano = (poder*ataqueBase)/(defesa*fator);
        return dano;
    }



}
