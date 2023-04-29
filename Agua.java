public class Agua extends Criatura{
    private int id= 2;

    @Override
    public int getId() {
        return id;
    }
    private String nome = "WaveNerd";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
