public class Main {
    public static void main(String[] args) {
        Elementos agua = new Agua();
        Elementos fogo = new Fogo();
        Elementos terra = new Terra();
        Elementos ar = new Ar();
        Menu menu = new Menu();
        menu.menu(agua,fogo,terra,ar);

    }
}
