import java.util.Random;

public class Acao {
    public int valorAleatorio(int valorMinimo, int valorMaximo) {
        Random numero = new Random();
        int valorAleatorio = numero.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        return valorAleatorio;
    }
    public double fatorPoder(int tipoElementoFatorAtaque, int tipoElementoFatorDefesa){

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
public double calculoAtaqueBase(double poderAtacante,int ataqueBaseAtacante,int defesaDefensor){
        double dano = (ataqueBaseAtacante*poderAtacante)/defesaDefensor;
        return dano;
}
public double calculoAtaquePoder(double poder,int ataqueBase,int defesa,double fator){
        double dano = (poder*ataqueBase)/(defesa*fator);
        return dano;
}
}
