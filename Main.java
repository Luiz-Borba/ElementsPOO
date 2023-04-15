public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao();
        Ar ar = new Ar();
        Terra terra = new Terra();
        Fogo fogo = new Fogo();
        Agua agua = new Agua();
        System.out.println("teste ataque normal");
        System.out.print("O dano é de : ");
        double dano = acao.calculoAtaqueBase(ar.getAtaque(),ar.getPoder(),fogo.getDefesa());
        double vida = fogo.getVida();
        double vidaApoAtaque = fogo.getVida()-dano;
        System.out.println(dano);
        System.out.print("A vida atua do defensor é de : ");
        System.out.println(fogo.getVida());
        System.out.print("Vida após ataque : ");
        System.out.println(vidaApoAtaque);
    }


}
