package CassioDiasCassiminhoExerc1B;

import java.util.Scanner;

/**
 * Abstracao que representa o controlador do jogo.
 * 
 * @author Cassio Dias Cassiminho - Nivelamento PIPCA
 * @date 26/02/2013
 * 
 * cassio.dias.25@gmail.com
 */
public class JogoDaVelha {

    private Scanner in = new Scanner(System.in);
    private int totalDeJogadas = 0;
    private Tabuleiro tabuleiro = null;
    
    public JogoDaVelha(){
	tabuleiro = new Tabuleiro();
    }

    private String verificaSeHaGanhador() {
	if (this.totalDeJogadas == 9) {
	    return "Ops, deu velha (ou empate)"; // http://pt.wikipedia.org/wiki/Jogo_da_velha
	}

	for (String padrao : tabuleiro.criarListaDePadroes()) {
	    if (padrao.equals("XXX")) {
		return " jogador 1";
	    } else if (padrao.equals("OOO")) {
		return " jogador 2";
	    }
	}
	return null;
    }

    /**
     * Método inicial do jogo que só finaliza a thread quando houver um vencedor ou "velha" (empate).
     */
    public void start() {
	String jogador = null;

	while (true) { // executar até que exista um vencedor.

	    movimentarJogador1();
	    totalDeJogadas++;
	    tabuleiro.exibe();

	    if ((jogador = verificaSeHaGanhador()) != null) {
		break;
	    }

	    movimentarJogador2();
	    tabuleiro.exibe();
	    totalDeJogadas++;

	    if ((jogador = verificaSeHaGanhador()) != null) {
		break;
	    }

	}

	logThis("***** FIM DE JOGO -> " + jogador + " venceu!");
    }

    private void movimentarJogador1() {
	movimentarJogador("1", "X");
    }
    
    private void movimentarJogador2() {
	movimentarJogador("2", "O");
    }

    /**
     * Método principal de interacao com o jogador. Solicita input de linha e coluna 
     * até que a posicao seja valida no array e livre. 
     * 
     * @param jogador
     * @param valor
     */
    private void movimentarJogador(String jogador, String valor) {
	int linha = 0;
	int coluna = 0;
	boolean isJogadaValida = false;

	do {
	    logThis("-> Jogador " + jogador + " - Informe a linha: ");
	    linha = in.nextInt();

	    while (tabuleiro.isOverLimit(linha)) {
		logThis("-----> oops, linha informada é inválida!");
		logThis("-> Jogador " + jogador + " - Informe a linha:");
		linha = in.nextInt();
	    }

	    logThis("-> Jogador " + jogador + " - Informe a coluna:");
	    coluna = in.nextInt();

	    while (tabuleiro.isOverLimit(coluna)) {
		logThis("-----> oops, esta coluna é inválida!");
		logThis("-> Jogador " + jogador + " - Informe a coluna:");
		coluna = in.nextInt();
	    }

	    if (tabuleiro.isPosicaoLivre(linha, coluna)) {
		tabuleiro.setCel(linha, coluna, valor);
		isJogadaValida = true;
	    } else {
		isJogadaValida = false;
		logThis("oops, jogada incorreta. A posição já foi ocupada - Por favor, tente novamente.");
	    }

	} while (!isJogadaValida);
	
    }

    private void logThis(String msg) {
	System.out.println(msg);
    }

}