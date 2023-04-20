public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao();
        Verificacoes verificacao = new Verificacoes();
        Menu teste = new Menu();
        Ar ar = new Ar();
        Terra terra = new Terra();
        Fogo fogo = new Fogo();
        Agua agua = new Agua();
        verificacao.verificadorDeVelocidade(agua,fogo,ar,terra,3);

        teste.menu(agua,fogo,terra,ar);

    }


}
