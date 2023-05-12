//public abstract class Criatura extends Acao{
//    private String nome;
//    private int poder;
//    private int ataque;
//    private int velocidade;
//    private int defesa;
//    private int vida;
//    private int id = 0;
//
//    public Criatura() {
//        this.poder = geradorNumeroAleatorio(10,30);
//        this.ataque = geradorNumeroAleatorio(5,15);
//        this.velocidade = gerarVelocidadeAleatoria(1,10);
//        this.defesa =  geradorNumeroAleatorio(5,15);
//        this.vida = geradorNumeroAleatorio(200,400);
//    }
//
//    public void setVida(int vida) {
//        this.vida = vida;
//    }
//
//    public int getVelocidade() {
//        return velocidade;
//    }
//
//    public int getVida() {
//        return vida;
//    }
//
//    public int getAtaque() {
//        return ataque;
//    }
//
//    public int getDefesa() {
//        return defesa;
//    }
//
//    public int getPoder() {
//        return poder;
//    }
//
//    public void setVelocidade(int velocidade) {
//        this.velocidade = velocidade;
//    }
//
//    public void setAtaque(int ataque) {
//        this.ataque = ataque;
//    }
//
//    public void setDefesa(int defesa) {
//        this.defesa = defesa;
//    }
//
//    public void setPoder(int poder) {
//        this.poder = poder;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public abstract int getId();
//}
//

import java.util.Random;

public class Criatura {
    private  String nome;
    private int pvd;
    private int atq;
    private int def;
    private int vel;
    private int pdr;
    private TipoCriatura tipoCriatura;

    public Criatura(String nome, TipoCriatura tipoCriatura) {
        this.nome = nome;
        this.tipoCriatura = tipoCriatura;
        gerarAtributos();
    }

    private void gerarAtributos() {
        Random random = new Random();
        this.pvd = random.nextInt(201) + 200;
        this.atq = random.nextInt(11) + 5;
        this.def = random.nextInt(11) + 5;
        this.vel = random.nextInt(10) + 1;
        this.pdr = random.nextInt(20) + 1;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPvd() {
        return pvd;
    }
    public void setPv(int pv) {
        this.pvd = pvd;
    }

    public int getAtq() {
        return atq;
    }
    public void setAtq(int atq) {
        this.atq = atq;
    }

    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }

    public int getVel() {
        return vel;
    }
    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getPdr() {
        return pdr;
    }
    public void setPdr(int pdr) {
        this.pdr = pdr;
    }

    public String getElemento() {
        return "elemento";
    }

    public void receberDano(double dano) {
        pvd -= dano;
        if (pvd < 0) {
            pvd = 0;
        }
    }

    public boolean estaDerrotada() {
        return pvd <= 0;
    }

    public enum TipoCriatura {
        TERRA,
        AGUA,
        FOGO,
        AR
    }

    public TipoCriatura getTipoCriatura() {
        return tipoCriatura;
    }
}