public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao();
        Verificacoes verificacao = new Verificacoes();
        Ar ar = new Ar();
        Terra terra = new Terra();
        Fogo fogo = new Fogo();
        Agua agua = new Agua();
        System.out.println("teste : "+acao.fatorPoder(agua.getTipoElemento(),terra.getTipoElemento()));
        System.out.println(verificacao.verificadorDeVelocidade(agua,fogo,ar,terra,3));

    }


}
