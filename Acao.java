import java.util.Random;

public class Acao {
    public static int ataqueFisico(Criatura criaturaSelecionada, Criatura criaturaOponente) {
        int danoFisico = (criaturaSelecionada.getPdr() * criaturaSelecionada.getAtq() / criaturaOponente.getDef());
        criaturaSelecionada.receberDano(danoFisico);

        System.out.println("\nVoce " + criaturaSelecionada.getNome() + " causou " + danoFisico
                + " de dano com ataque fisico em " + criaturaOponente.getNome() + ".");
        System.out.println("Vida de " + criaturaSelecionada.getNome() + ": " + criaturaSelecionada.getPvd());
        System.out.println("Vida de " + criaturaOponente.getNome() + ": " + criaturaOponente.getPvd());
        return danoFisico;
    }

    public static double calculoFatorPoder(Criatura criaturaSelecionada, Criatura criaturaOponente) {
        Criatura.TipoCriatura tipoSelecionada = criaturaSelecionada.getTipoCriatura();
        Criatura.TipoCriatura tipoOponente = criaturaOponente.getTipoCriatura();

        if (tipoSelecionada == tipoOponente) {
            return 0.5;
        } else if ((tipoSelecionada == Criatura.TipoCriatura.TERRA && tipoOponente == Criatura.TipoCriatura.FOGO)
                || (tipoSelecionada == Criatura.TipoCriatura.TERRA && tipoOponente == Criatura.TipoCriatura.AR)
                || (tipoSelecionada == Criatura.TipoCriatura.AGUA && tipoOponente == Criatura.TipoCriatura.TERRA)
                || (tipoSelecionada == Criatura.TipoCriatura.AGUA && tipoOponente == Criatura.TipoCriatura.AR)
                || (tipoSelecionada == Criatura.TipoCriatura.FOGO && tipoOponente == Criatura.TipoCriatura.TERRA)
                || (tipoSelecionada == Criatura.TipoCriatura.FOGO && tipoOponente == Criatura.TipoCriatura.AGUA)
                || (tipoSelecionada == Criatura.TipoCriatura.AR && tipoOponente == Criatura.TipoCriatura.AGUA)
                || (tipoSelecionada == Criatura.TipoCriatura.AR && tipoOponente == Criatura.TipoCriatura.FOGO)) {
            return 1.0;
        } else if ((tipoSelecionada == Criatura.TipoCriatura.TERRA && tipoOponente == Criatura.TipoCriatura.AGUA)
                || (tipoSelecionada == Criatura.TipoCriatura.AGUA && tipoOponente == Criatura.TipoCriatura.FOGO)
                || (tipoSelecionada == Criatura.TipoCriatura.FOGO && tipoOponente == Criatura.TipoCriatura.AR)
                || (tipoSelecionada == Criatura.TipoCriatura.AR && tipoOponente == Criatura.TipoCriatura.TERRA)) {
            return 2.0;
        }
        return 0.0;
    }

    public static int ataqueElemental(Criatura criaturaSelecionada, Criatura criaturaOponente) {
        double fatorPoder = calculoFatorPoder(criaturaSelecionada, criaturaOponente);
        int danoElemental = (int) (criaturaSelecionada.getAtq() * fatorPoder);
        criaturaOponente.receberDano(danoElemental);

        System.out.println("\nVoce " + criaturaSelecionada.getNome() + " causou " + danoElemental
                + " de dano com ataque elemental em " + criaturaOponente.getNome() + ".");
        System.out.println("Vida de " + criaturaSelecionada.getNome() + ": " + criaturaSelecionada.getPvd());
        System.out.println("Vida de " + criaturaOponente.getNome() + ": " + criaturaOponente.getPvd());

        return danoElemental;
    }

    public static int ataqueCriaturaOponente(Criatura criaturaOponente, Criatura criaturaSelecionada) {
        Random random = new Random();
        int acaoOponente = (int) (Math.random() * 2) + 1;

        switch (acaoOponente) {
            case 1:
                int danoFisicoOponente = (criaturaOponente.getPdr() * criaturaOponente.getAtq()
                        / criaturaSelecionada.getDef());
                criaturaOponente.receberDano(danoFisicoOponente);
                System.out.println(criaturaSelecionada.getNome() + " causou " + danoFisicoOponente
                        + " de dano com ataque fisico em " + criaturaOponente.getNome() + ".");
                System.out.println("Vida de " + criaturaOponente.getNome() + ": " + criaturaOponente.getPvd());
                System.out.println("Vida de " + criaturaSelecionada.getNome() + ": " + criaturaSelecionada.getPvd());
                return danoFisicoOponente;
            case 2:
                double fatorPoder = calculoFatorPoder(criaturaOponente, criaturaSelecionada);
                int danoElementalOponente = (int) (criaturaOponente.getAtq() * fatorPoder);
                criaturaSelecionada.receberDano(danoElementalOponente);

                System.out.println("\nVoce " + criaturaOponente.getNome() + " causou " + danoElementalOponente
                        + " de dano com ataque elemental em " + criaturaSelecionada.getNome() + ".");
                System.out.println("Vida de " + criaturaOponente.getNome() + ": " + criaturaOponente.getPvd());
                System.out.println("Vida de " + criaturaSelecionada.getNome() + ": " + criaturaSelecionada.getPvd());

                return danoElementalOponente;
        }
        return acaoOponente;
    }

}