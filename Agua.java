public class Agua extends Elementos{
    Acao acao = new Acao();
    private int tipoElemento = 2;
    private int vida = acao.valorAleatorio(200,400);

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
}
