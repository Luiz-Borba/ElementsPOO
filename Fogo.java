public class    Fogo extends Elementos{
    Acao acao = new Acao();
    private int tipoElemento = 3;
    private double vida = acao.valorAleatorio(200,400);


    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public double getVida() {
        return vida;
    }

    private int velocidade = acao.valorAleatorio(1,10);


    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public double getTipoElemento() {
        return tipoElemento;
    }
}
