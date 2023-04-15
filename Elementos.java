public class Elementos {
        Acao acao = new Acao();
        private int tipoElemento=0;
        private double poder = acao.valorAleatorio(10,30);
        private double ataque=acao.valorAleatorio(5,15);
        private double defesa = acao.valorAleatorio(5,15);
        private  double velocidade = acao.valorAleatorio(1,10);
        private double vida = 0;

        public double getVelocidade() {
                return velocidade;
        }

        public double getPoder() {
                return poder;
        }

        public double getVida() {
                return vida;
        }

        public double getDefesa() {
                return defesa;
        }

        public double getAtaque() {
                return ataque;
        }

        public double getTipoElemento() {
                return tipoElemento;
        }



}
