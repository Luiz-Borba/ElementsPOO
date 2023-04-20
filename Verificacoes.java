import java.util.Arrays;

public class Verificacoes {
    public int verificadorDeVelocidade(Agua agua,Fogo fogo,Ar ar,Terra terra,int verificador) {
        int[] velocidade = {agua.getVelocidade(), fogo.getVelocidade(), ar.getVelocidade(), terra.getVelocidade()};
        Arrays.sort(velocidade);
        int posicao = velocidade[verificador];
        int id = 0;
        if (posicao == agua.getVelocidade()){
            id = (int) agua.getTipoElemento();
            System.out.println("agua : "+ id);
            return id;
        }
        if (posicao == fogo.getVelocidade()){
            id = (int) fogo.getTipoElemento();
            System.out.println("fogo : "+ id);
            return id;
        }
        if (posicao == ar.getVelocidade()){
            id= (int) ar.getTipoElemento();
            System.out.println("ar : "+ id);
            return id;
        }
        if (posicao == terra.getVelocidade()){
            id = (int) terra.getTipoElemento();
            System.out.println("terra : "+ id);
            return id;
        }
        else {
            System.out.println("Erro não encontrei o ID");
        }
        return id;
    }

}
