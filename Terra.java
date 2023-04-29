public class Terra extends Criatura{
    private int id= 1;

    @Override
    public int getId() {
        return id;
    }
    private String nome = "StoneDev  ";

    @Override
    public String getNome() {
        return nome;
    }
    @Override

    public void setNome(String nome) {
        this.nome = nome;
    }
}
