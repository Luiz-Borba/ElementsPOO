//public class Fogo extends Criatura{
//
//    private String nome = "BurnCoder ";
//    private int id= 3;
//
//    @Override
//    public int getId() {
//        return id;
//    }
//    public String getNome() {
//        return nome;
//    }
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//}

public class BurnCoder extends Criatura {
    public BurnCoder() {
        super("BurnCoder", TipoCriatura.FOGO);
    }
}
