import java.util.Arrays;

public class Verificacoes {
    Acao verificar = new Acao();
    Agua agua = new Agua();
    Fogo fogo = new Fogo();
    Terra terra = new Terra();
    Ar ar = new Ar();
    public double verificadorDeVelocidade(double elemento1, double elemento2, double elemento3,int verificador) {
        double[] velocidade = {elemento1, elemento2, elemento3};
        Arrays.sort(velocidade);
        double posicao = velocidade[verificador];
        return posicao;
    }
    public double verificarInimigo(double velocidade){
        double tipo = 0;
        if (velocidade == agua.getVelocidade()){
            tipo = (int) agua.getTipoElemento();
        }
        if (velocidade == fogo.getVelocidade()){
            tipo = (int) fogo.getTipoElemento();
        }
        if (velocidade == ar.getVelocidade()){
            tipo= ar.getTipoElemento();
        }
        if (velocidade == terra.getVelocidade()){
            tipo = terra.getTipoElemento();
        }

        return tipo;
    }
}
