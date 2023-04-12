public class Terra extends Elementos{


        Acao acao = new Acao();
        private int tipoElemento = 1;
        private int poder = acao.valorAleatorio(10,30);
        private int ataque=acao.valorAleatorio(5,15);
        private int defesa = acao.valorAleatorio(5,15);
        private  int velocidade = acao.valorAleatorio(1,10);
        private int vida = acao.valorAleatorio(200,400);

        public int getVelocidade() {
            return velocidade;
        }

        public int getPoder() {
            return poder;
        }

        public int getVida() {
            return vida;
        }

        public int getDefesa() {
            return defesa;
        }

        public int getAtaque() {
            return ataque;
        }

        public int getTipoElemento() {
            return tipoElemento;
        }


}
