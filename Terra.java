public class Terra extends Elementos{
Acao acao = new Acao();
        private int tipoElemento = 1;
        private double vida= acao.valorAleatorio(200,400);

        public void setTipoElemento(int tipoElemento) {
                this.tipoElemento = tipoElemento;
        }

        @Override
        public double getVelocidade() {
                return super.getVelocidade();
        }

        @Override
        public double getVida() {
                return vida;
        }

        public void setVida(double vida) {
                this.vida = vida;
        }
}
