public class Elementos {
    Acao acao = new Acao();
    protected int tipoElemento;
    protected double poder;
    protected double ataque;
    protected double defesa;
    protected double velocidade;
    protected double vida;
    public boolean selecionado;

    public Elementos(int tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public void resetarObjeto() {
        this.poder = acao.valorAleatorio(Jogo.PODER_MINIMO, Jogo.PODER_MAXIMO);
        this.ataque = acao.valorAleatorio(Jogo.ATAQUE_MINIMO, Jogo.ATAQUE_MAXIMO);
        this.defesa = acao.valorAleatorio(Jogo.DEFESA_MINIMO, Jogo.DEFESA_MAXIMO);
        this.velocidade = acao.valorAleatorio(Jogo.VELOCIDADE_MINIMO, Jogo.VELOCIDADE_MAXIMO);
        this.vida = acao.valorAleatorio(Jogo.VIDA_MINIMO, Jogo.VIDA_MAXIMO);
    }

    public int getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(int tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
