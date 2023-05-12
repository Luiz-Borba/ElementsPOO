//import java.lang.reflect.Array;
//import java.util.*;
//
//public class Acao {
//    Random gerador = new Random();
//
//    public int geradorNumeroAleatorio(int menorValor, int maiorValor) {
//        return gerador.nextInt(maiorValor - menorValor + 1) + menorValor;
//    }
//    int[] velocidadeGerada = new int[4];
//    int contadorVelocidade = 0;
//
//    public int gerarVelocidadeAleatoria(int menorValor, int maiorValor) {
//        int gerado;
//        boolean repetido;
//        do {
//            gerado = gerador.nextInt(maiorValor - menorValor + 1) + menorValor;
//            repetido = false;
//            for (int i = 0; i < contadorVelocidade; i++) {
//                if (velocidadeGerada[i] == gerado) {
//                    repetido = true;
//                    break;
//                }
//            }
//        } while (repetido);
//        velocidadeGerada[contadorVelocidade++] = gerado;
//        return gerado;
//    }
//
//    public int verificadorDeVelocidade(int inimigo1, int inimigo3, int inimigo2,int posicao) {
//        int[] velocidade = new int[3];
//        velocidade[0] = inimigo1;
//        velocidade[1]=inimigo2;
//        velocidade[2]=inimigo3;
//        Arrays.sort(velocidade);
//
//
//        return velocidade[posicao];
//    }
//    public  double calculoFatorPoder(int id1, int id2) {
//        if (id1 == id2) {
//            return 0.5;
//        } else if ((id1 == 1 && id2 == 2) || (id1 == 2 && id2 == 1)
//                || (id1 == 1 && id2 == 3) || (id1 == 3 && id2 == 1)
//                || (id1 == 1 && id2 == 4) || (id1 == 4 && id2 == 1)
//                || (id1 == 2 && id2 == 4) || (id1 == 4 && id2 == 2)
//                || (id1 == 3 && id2 == 2) || (id1 == 2 && id2 == 3)
//                || (id1 == 3 && id2 == 4) || (id1 == 4 && id2 == 3)) {
//            return 1.0;
//        } else if ((id1 == 1 && id2 == 2) || (id1 == 2 && id2 == 3)
//                || (id1 == 3 && id2 == 4) || (id1 == 4 && id2 == 1)) {
//            return 2.0;
//        }
//        return 0;
//    }
//    public int ataqueFisico(int poderAtacante,int ataqueAtacante,int defesaDefensor){
//            return (poderAtacante*ataqueAtacante)/defesaDefensor;
//    }
//    public double ataqueElemental(int poderAtacante,int ataqueAtacante,int defesaDefensor,double fator){
//        return (poderAtacante*ataqueAtacante)/defesaDefensor*fator;
//
//    }
//
//}
//

import java.util.Random;

public class Acao {
    public static int ataqueFisico(Criatura criaturaSelecionada, Criatura criaturaOponente) {
        int danoFisico = (criaturaSelecionada.getPdr() * criaturaSelecionada.getAtq() / criaturaOponente.getDef());
        criaturaSelecionada.receberDano(danoFisico);

        System.out.println("Você" + criaturaSelecionada.getNome() + " causou " + danoFisico + " de dano com ataque fisico em " + criaturaOponente.getNome() + ".");
        System.out.println("Vida de " + criaturaSelecionada.getNome() + ": " + criaturaSelecionada.getPvd());
        System.out.println("Vida de " + criaturaOponente.getNome() + ": " + criaturaOponente.getPvd());
        return danoFisico;
    }

    public static double calculoFatorPoder(Criatura criaturaSelecionada, Criatura criaturaOponente) {
        Criatura.TipoCriatura tipoSelecionada = criaturaSelecionada.getTipoCriatura();
        Criatura.TipoCriatura tipoOponente = criaturaOponente.getTipoCriatura();

        if (tipoSelecionada == tipoOponente) {
            return 0.5;
        } else if ((tipoSelecionada == tipoSelecionada.TERRA && tipoOponente == tipoOponente.FOGO)
                || (tipoSelecionada == tipoSelecionada.TERRA && tipoOponente == tipoOponente.AR)
                || (tipoSelecionada == tipoSelecionada.AGUA && tipoOponente == tipoOponente.TERRA)
                || (tipoSelecionada == tipoSelecionada.AGUA && tipoOponente == tipoOponente.AR)
                || (tipoSelecionada == tipoSelecionada.FOGO && tipoOponente == tipoOponente.TERRA)
                || (tipoSelecionada == tipoSelecionada.FOGO && tipoOponente == tipoOponente.AGUA)
                || (tipoSelecionada == tipoSelecionada.AR && tipoOponente == tipoOponente.AGUA)
                || (tipoSelecionada == tipoSelecionada.AR && tipoOponente == tipoOponente.FOGO)){
            return 1.0;
        } else if ((tipoSelecionada == tipoSelecionada.TERRA && tipoOponente == tipoOponente.AGUA)
                || (tipoSelecionada == tipoSelecionada.AGUA && tipoOponente == tipoOponente.FOGO)
                || (tipoSelecionada == tipoSelecionada.FOGO && tipoOponente == tipoOponente.AR)
                || (tipoSelecionada == tipoSelecionada.AR && tipoOponente == tipoOponente.TERRA)) {
            return 2.0;
        }
        return 0.0;
    }

    public static int ataqueElemental(Criatura criaturaSelecionada, Criatura criaturaOponente) {
        double fatorPoder = calculoFatorPoder(criaturaSelecionada, criaturaOponente);
        int danoElemental = (int) (criaturaSelecionada.getAtq() * fatorPoder);
        criaturaOponente.receberDano(danoElemental);

        System.out.println("Você" + criaturaSelecionada.getNome() + " causou " + danoElemental + " de dano com ataque elemental em " + criaturaOponente.getNome() + ".");
        System.out.println("Vida de " + criaturaSelecionada.getNome() + ": " + criaturaSelecionada.getPvd());
        System.out.println("Vida de " + criaturaOponente.getNome() + ": " + criaturaOponente.getPvd());

        return danoElemental;
    }

    public static int ataqueCriaturaOponente(Criatura criaturaOponente, Criatura criaturaSelecionada) {
        Random random = new Random();
        int acaoOponente = (int) (Math.random() * 2) + 1;

        switch (acaoOponente) {
            case 1:
                int danoFisicoOponente = (criaturaOponente.getPdr() * criaturaOponente.getAtq() / criaturaSelecionada.getDef());
                criaturaOponente.receberDano(danoFisicoOponente);
                System.out.println(criaturaSelecionada.getNome() + " causou " + danoFisicoOponente + " de dano com ataque fisico em " + criaturaOponente.getNome() + ".");
                System.out.println("Vida de " + criaturaOponente.getNome() + ": " + criaturaOponente.getPvd());
                System.out.println("Vida de " + criaturaSelecionada.getNome() + ": " + criaturaSelecionada.getPvd());
                return danoFisicoOponente;
            case 2:
                double fatorPoder = calculoFatorPoder(criaturaOponente, criaturaSelecionada);
                int danoElementalOponente = (int) (criaturaOponente.getAtq() * fatorPoder);
                criaturaSelecionada.receberDano(danoElementalOponente);

                System.out.println("Você" + criaturaOponente.getNome() + " causou " + danoElementalOponente + " de dano com ataque elemental em " + criaturaSelecionada.getNome() + ".");
                System.out.println("Vida de " + criaturaOponente.getNome() + ": " + criaturaOponente.getPvd());
                System.out.println("Vida de " + criaturaSelecionada.getNome() + ": " + criaturaSelecionada.getPvd());

                return danoElementalOponente;
        }
        return acaoOponente;
    }

}