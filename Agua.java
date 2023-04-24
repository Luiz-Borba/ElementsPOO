public class Agua extends Elementos{
    Acao acao = new Acao();
    private int tipoElemento = 2;
    private int vida = acao.valorAleatorio(200,400);
    private int velocidade = acao.valorAleatorio(1,10);

    public int getVelocidade() {
        return velocidade;
    }

    public void setTipoElemento(int tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    @Override
    public double getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public double getTipoElemento() {
        return tipoElemento;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void setVida(double vida) {
        super.setVida(vida);
    }
}
