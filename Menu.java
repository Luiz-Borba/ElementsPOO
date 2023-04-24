import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Verificacoes vereficar = new Verificacoes();
    Acao acao = new Acao();

    public boolean menu(Elementos agua, Elementos fogo, Elementos terra, Elementos ar) {
        int opcaoIniciarGame;
        int criatura,gamePlay,maisVeloz,segundoMaisVeloz,terceiroMaisVeloz;
        int rodada =0,ataque = 0;
        double dano,fator,statusVida;
        System.out.println("== MENU PRINCIPAL ==");
        System.out.println("1 - Novo jogo");
        System.out.println("2 - Sair");
        System.out.print("Escolha uma opção: ");
        opcaoIniciarGame = input.nextInt();
        System.out.println();

        if (opcaoIniciarGame == 1) {
            System.out.println("Escolha uma das Criaturas abaixo");
            System.out.println("1 - StoneDev (terra)\n2 -  WaveNerd (água)\n3 - BurnCoder (fogo)\n4 - BreezeHacker (ar)");
            criatura = input.nextInt();
            System.out.println("1 - Inicar torneio\n2 - Sair do programa");
            gamePlay = input.nextInt();

            if (gamePlay == 1) {
                if (criatura == 1) {
                    maisVeloz = vereficar.verificadorDeVelocidade(agua, fogo, ar, terra, 3);
                    segundoMaisVeloz = vereficar.verificadorDeVelocidade(agua, fogo, ar, terra, 2);
                    terceiroMaisVeloz = vereficar.verificadorDeVelocidade(agua, fogo, ar, terra, 1);
                    if (maisVeloz == 2) {// o numero 2 é o id de elemento que esta com o nome tipoElemento
                        do {
                            rodada++;
                            if (rodada == 1 && maisVeloz == 2) {
                                System.out.println("Como você deseja atacar?");
                                System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico\n3 - Sair do Programa");
                                ataque = input.nextInt();
                                if (ataque == 1) {
                                    System.out.println("WaveNerd efeutou um ataque elemental!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), agua.getTipoElemento());
                                    dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), agua.getDefesa(), fator);
                                    System.out.println("vida atual da agua:" + agua.getVida());
                                    System.out.println("Terra atacou Água e o dano foi de :" + dano);
                                    statusVida = agua.getVida() - dano;
                                    agua.setVida((int) statusVida);
                                    System.out.println("vida da Água pós ataque : " + agua.getVida());
                                }
                                if (ataque == 2) {
                                    System.out.println("WaveNerd efeutou um ataque fisico!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), agua.getTipoElemento());
                                    dano = acao.calcaloAtaqueComun(terra.getPoder(), terra.getAtaque(), agua.getDefesa());
                                    System.out.println("vida atual da agua:" + agua.getVida());
                                    System.out.println("Terra atacou Água e o dano foi de :" + dano);
                                    statusVida = agua.getVida() - dano;
                                    agua.setVida((int) statusVida);
                                    System.out.println("vida da Água pós ataque : " + agua.getVida());
                                }
                                if (ataque == 3) {
                                    break;
                                }
                            }
                            if (rodada == 1 && maisVeloz == 3) {
                                System.out.println("Como você deseja atacar?");
                                System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico");
                                ataque = input.nextInt();
                                if (ataque == 1) {
                                    System.out.println("WaveNerd efeutou um ataque elemental!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), fogo.getTipoElemento());
                                    dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), fogo.getDefesa(), fator);
                                    System.out.println("vida atual da Fogo:" + fogo.getVida());
                                    System.out.println("Terra atacou Fogo e o dano foi de :" + dano);
                                    statusVida = fogo.getVida() - dano;
                                    fogo.setVida((int) statusVida);
                                    System.out.println("vida da fogo pós ataque : " + fogo.getVida());
                                }
                                if (ataque == 2) {
                                    System.out.println("WaveNerd efeutou um ataque fisico!");
                                    dano = acao.calcaloAtaqueComun(terra.getPoder(), terra.getAtaque(), fogo.getDefesa());
                                    System.out.println("vida atual da Fogo:" + fogo.getVida());
                                    System.out.println("Terra atacou Fogo e o dano foi de :" + dano);
                                    statusVida = fogo.getVida() - dano;
                                    fogo.setVida((int) statusVida);
                                    System.out.println("vida da Fogo pós ataque : " + fogo.getVida());
                                }
                                if (ataque == 3) {
                                    break;
                                }
                            }
                            if (rodada == 1 && maisVeloz == 4) {
                                System.out.println("Como você deseja atacar?");
                                System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico");
                                ataque = input.nextInt();
                                if (ataque == 1) {
                                    System.out.println("WaveNerd efeutou um ataque elemental!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), ar.getTipoElemento());
                                    dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), ar.getDefesa(), fator);
                                    System.out.println("vida atual da ar:" + ar.getVida());
                                    System.out.println("Terra atacou ar e o dano foi de :" + dano);
                                    statusVida = ar.getVida() - dano;
                                    ar.setVida((int) statusVida);
                                    System.out.println("vida da ar pós ataque : " + ar.getVida());
                                }
                                if (ataque == 2) {
                                    System.out.println("WaveNerd efeutou um ataque fisico!");
                                    dano = acao.calcaloAtaqueComun(terra.getPoder(), terra.getAtaque(), ar.getDefesa());
                                    System.out.println("vida atual da ar:" + ar.getVida());
                                    System.out.println("Terra atacou ar e o dano foi de :" + dano);
                                    statusVida = ar.getVida() - dano;
                                    ar.setVida((int) statusVida);
                                    System.out.println("vida da ar pós ataque : " + agua.getVida());
                                }
                                if (ataque == 3) {
                                    break;
                                }
                            }
                            if (rodada == 2 && segundoMaisVeloz == 2) {
                                System.out.println("Como você deseja atacar?");
                                System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico\n3 - Sair do Programa");
                                ataque = input.nextInt();
                                if (ataque == 1) {
                                    System.out.println("WaveNerd efeutou um ataque elemental!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), agua.getTipoElemento());
                                    dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), agua.getDefesa(), fator);
                                    System.out.println("vida atual da agua:" + agua.getVida());
                                    System.out.println("Terra atacou Água e o dano foi de :" + dano);
                                    statusVida = agua.getVida() - dano;
                                    agua.setVida((int) statusVida);
                                    System.out.println("vida da Água pós ataque : " + agua.getVida());
                                }
                                if (ataque == 2) {
                                    System.out.println("WaveNerd efeutou um ataque fisico!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), agua.getTipoElemento());
                                    dano = acao.calcaloAtaqueComun(terra.getPoder(), terra.getAtaque(), agua.getDefesa());
                                    System.out.println("vida atual da agua:" + agua.getVida());
                                    System.out.println("Terra atacou Água e o dano foi de :" + dano);
                                    statusVida = agua.getVida() - dano;
                                    agua.setVida((int) statusVida);
                                    System.out.println("vida da Água pós ataque : " + agua.getVida());
                                }
                                if (ataque == 3) {
                                    break;
                                }
                            }
                            if (rodada == 2 && segundoMaisVeloz == 3) {
                                System.out.println("Como você deseja atacar?");
                                System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico");
                                ataque = input.nextInt();
                                if (ataque == 1) {
                                    System.out.println("WaveNerd efeutou um ataque elemental!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), fogo.getTipoElemento());
                                    dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), fogo.getDefesa(), fator);
                                    System.out.println("vida atual da Fogo:" + fogo.getVida());
                                    System.out.println("Terra atacou Fogo e o dano foi de :" + dano);
                                    statusVida = fogo.getVida() - dano;
                                    fogo.setVida((int) statusVida);
                                    System.out.println("vida da fogo pós ataque : " + fogo.getVida());
                                }
                                if (ataque == 2) {
                                    System.out.println("WaveNerd efeutou um ataque fisico!");
                                    dano = acao.calcaloAtaqueComun(terra.getPoder(), terra.getAtaque(), fogo.getDefesa());
                                    System.out.println("vida atual da Fogo:" + fogo.getVida());
                                    System.out.println("Terra atacou Fogo e o dano foi de :" + dano);
                                    statusVida = fogo.getVida() - dano;
                                    fogo.setVida((int) statusVida);
                                    System.out.println("vida da Fogo pós ataque : " + fogo.getVida());
                                }
                                if (ataque == 3) {
                                    break;
                                }
                            }
                            if (rodada == 2 && segundoMaisVeloz == 4) {
                                System.out.println("Como você deseja atacar?");
                                System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico");
                                ataque = input.nextInt();
                                if (ataque == 1) {
                                    System.out.println("WaveNerd efeutou um ataque elemental!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), ar.getTipoElemento());
                                    dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), ar.getDefesa(), fator);
                                    System.out.println("vida atual da ar:" + ar.getVida());
                                    System.out.println("Terra atacou ar e o dano foi de :" + dano);
                                    statusVida = ar.getVida() - dano;
                                    ar.setVida((int) statusVida);
                                    System.out.println("vida da ar pós ataque : " + ar.getVida());
                                }
                                if (ataque == 2) {
                                    System.out.println("WaveNerd efeutou um ataque fisico!");
                                    dano = acao.calcaloAtaqueComun(terra.getPoder(), terra.getAtaque(), ar.getDefesa());
                                    System.out.println("vida atual da ar:" + ar.getVida());
                                    System.out.println("Terra atacou ar e o dano foi de :" + dano);
                                    statusVida = ar.getVida() - dano;
                                    ar.setVida((int) statusVida);
                                    System.out.println("vida da ar pós ataque : " + agua.getVida());
                                }
                                if (ataque == 3) {
                                    break;
                                }
                            }
                            if (rodada == 3 && terceiroMaisVeloz == 2) {
                                System.out.println("Como você deseja atacar?");
                                System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico\n3 - Sair do Programa");
                                ataque = input.nextInt();
                                if (ataque == 1) {
                                    System.out.println("WaveNerd efeutou um ataque elemental!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), agua.getTipoElemento());
                                    dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), agua.getDefesa(), fator);
                                    System.out.println("vida atual da agua:" + agua.getVida());
                                    System.out.println("Terra atacou Água e o dano foi de :" + dano);
                                    statusVida = agua.getVida() - dano;
                                    agua.setVida((int) statusVida);
                                    System.out.println("vida da Água pós ataque : " + agua.getVida());
                                }

                                if (ataque == 2) {
                                    System.out.println("WaveNerd efeutou um ataque fisico!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), agua.getTipoElemento());
                                    dano = acao.calcaloAtaqueComun(terra.getPoder(), terra.getAtaque(), agua.getDefesa());
                                    System.out.println("vida atual da agua:" + agua.getVida());
                                    System.out.println("Terra atacou Água e o dano foi de :" + dano);
                                    statusVida = agua.getVida() - dano;
                                    agua.setVida((int) statusVida);
                                    System.out.println("vida da Água pós ataque : " + agua.getVida());
                                }
                                if (ataque == 3) {
                                    break;
                                }
                            }
                            if (rodada == 3 && terceiroMaisVeloz == 3) {
                                System.out.println("Como você deseja atacar?");
                                System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico");
                                ataque = input.nextInt();
                                if (ataque == 1) {
                                    System.out.println("WaveNerd efeutou um ataque elemental!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), fogo.getTipoElemento());
                                    dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), fogo.getDefesa(), fator);
                                    System.out.println("vida atual da Fogo:" + fogo.getVida());
                                    System.out.println("Terra atacou Fogo e o dano foi de :" + dano);
                                    statusVida = fogo.getVida() - dano;
                                    fogo.setVida((int) statusVida);
                                    System.out.println("vida da fogo pós ataque : " + fogo.getVida());
                                }
                                if (ataque == 2) {
                                    System.out.println("WaveNerd efeutou um ataque fisico!");
                                    dano = acao.calcaloAtaqueComun(terra.getPoder(), terra.getAtaque(), fogo.getDefesa());
                                    System.out.println("vida atual da Fogo:" + fogo.getVida());
                                    System.out.println("Terra atacou Fogo e o dano foi de :" + dano);
                                    statusVida = fogo.getVida() - dano;
                                    fogo.setVida((int) statusVida);
                                    System.out.println("vida da Fogo pós ataque : " + fogo.getVida());
                                }
                                if (ataque == 3) {
                                    break;
                                }
                            }
                            if (rodada == 3 && terceiroMaisVeloz == 4) {
                                System.out.println("Como você deseja atacar?");
                                System.out.println("1 - Ataque Elemental\n2 - Ataque Fisico");
                                ataque = input.nextInt();
                                if (ataque == 1) {
                                    System.out.println("WaveNerd efeutou um ataque elemental!");
                                    fator = acao.descobrirFatorDePoder(terra.getTipoElemento(), ar.getTipoElemento());
                                    dano = acao.calculoAtaqueElemental(terra.getPoder(), terra.getAtaque(), ar.getDefesa(), fator);
                                    System.out.println("vida atual da ar:" + ar.getVida());
                                    System.out.println("Terra atacou ar e o dano foi de :" + dano);
                                    statusVida = ar.getVida() - dano;
                                    ar.setVida((int) statusVida);
                                    System.out.println("vida da ar pós ataque : " + ar.getVida());
                                }
                                if (ataque == 2) {
                                    System.out.println("WaveNerd efeutou um ataque fisico!");
                                    dano = acao.calcaloAtaqueComun(terra.getPoder(), terra.getAtaque(), ar.getDefesa());
                                    System.out.println("vida atual da ar:" + ar.getVida());
                                    System.out.println("Terra atacou ar e o dano foi de :" + dano);
                                    statusVida = ar.getVida() - dano;
                                    ar.setVida((int) statusVida);
                                    System.out.println("vida da ar pós ataque : " + agua.getVida());
                                }
                                if (ataque == 3) {
                                    break;
                                }
                            }
                        } while (rodada != 3 || ataque != 3);

                    }

                }

            }
        }
        return  true;
    }
}