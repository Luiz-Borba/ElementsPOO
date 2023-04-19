public class    Fogo extends Elementos{
    Acao acao = new Acao();
    private int tipoElemento = 3;
    private double vida = acao.valorAleatorio(200,400);

    public void setTipoElemento(int tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public double getVida() {
        return vida;
    }

    @Override
    public double getVelocidade() {
        return super.getVelocidade();
    }

    @Override
    public double getTipoElemento() {
        return tipoElemento;
    }
}
