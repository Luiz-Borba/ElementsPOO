import java.util.Arrays;

public class Verificacoes {
    Agua agua = new Agua();
    Fogo fogo = new Fogo();
    Terra terra = new Terra();
    Ar ar = new Ar();
    public int verificadorDeVelocidade(double VelocidadeElemento1, double VelocidadeElemento2, double VelocidadeElemento3,int verificador) {
        double[] velocidade = {VelocidadeElemento1, VelocidadeElemento2, VelocidadeElemento3};
        Arrays.sort(velocidade);
        double posicao = velocidade[verificador];
        int id = 0;
        if (posicao == agua.getVelocidade()){
            id = (int) agua.getTipoElemento();
            System.out.println("agua : "+ id);
        }
        else if (posicao == fogo.getVelocidade()){
            id = (int) fogo.getTipoElemento();
            System.out.println("fogo : "+ id);
        }
        else if (posicao == ar.getVelocidade()){
            id= (int) ar.getTipoElemento();
            System.out.println("ar : "+ id);
        }
        else if (posicao == terra.getVelocidade()){
            id = (int) terra.getTipoElemento();
            System.out.println("terra : "+ id);
        }
        else {
            System.out.println("Erro");
        }
        return id;
    }

}
