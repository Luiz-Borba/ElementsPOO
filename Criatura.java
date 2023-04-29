public abstract class Criatura extends Acao{
    private String nome;

    private int poder = geradorNumeroAleatorio(10,30);
    private int ataque = geradorNumeroAleatorio(5,15);
    private int velocidade = gerarVelocidadeAleatoria(1,10);
    private int defesa = geradorNumeroAleatorio(5,15);
    private int vida = geradorNumeroAleatorio(200,400);
    private int id = 0;

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getPoder() {
        return poder;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract int getId();
}
