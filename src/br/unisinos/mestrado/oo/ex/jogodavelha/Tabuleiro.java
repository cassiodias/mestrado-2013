package br.unisinos.mestrado.oo.ex.jogodavelha;

/**
 * Abstração que representa um tabuleiro.
 * 
 * @author Cassio Dias Cassiminho - Nivelamento PIPCA
 * @date 26/02/2013
 * 
 * cassio.dias.25@gmail.com
 */
public class Tabuleiro {

    private String[][] matrizJogo;

    public Tabuleiro() {
	matrizJogo = new String[3][3];
	iniciarTabuleiro();
    }

    private void iniciarTabuleiro() {
	for (int linha = 0; linha < 3; linha++) {
	    for (int coluna = 0; coluna < 3; coluna++) {
		matrizJogo[linha][coluna] = "_";
	    }
	}
    }

    public String[] criarListaDePadroes() {
	String[] listaDePadroes = new String[8];
	// carregar diagonais
	listaDePadroes[0] = new StringBuilder(matrizJogo[0][0])
		.append(matrizJogo[1][1]).append(matrizJogo[2][2]).toString();
	listaDePadroes[1] = new StringBuilder(matrizJogo[0][2])
		.append(matrizJogo[1][1]).append(matrizJogo[2][0]).toString();
	// carregar linhas
	listaDePadroes[2] = new StringBuilder(matrizJogo[0][0])
		.append(matrizJogo[0][1]).append(matrizJogo[0][2]).toString();
	listaDePadroes[3] = new StringBuilder(matrizJogo[1][0])
		.append(matrizJogo[1][1]).append(matrizJogo[1][2]).toString();
	listaDePadroes[4] = new StringBuilder(matrizJogo[2][0])
		.append(matrizJogo[2][1]).append(matrizJogo[2][2]).toString();
	// carregar colunas
	listaDePadroes[5] = new StringBuilder(matrizJogo[0][0])
		.append(matrizJogo[1][0]).append(matrizJogo[2][0]).toString();
	listaDePadroes[6] = new StringBuilder(matrizJogo[0][1])
		.append(matrizJogo[1][1]).append(matrizJogo[2][1]).toString();
	listaDePadroes[7] = new StringBuilder(matrizJogo[0][2])
		.append(matrizJogo[1][2]).append(matrizJogo[2][2]).toString();
	return listaDePadroes;
    }

    public String setCel(int linha, int coluna, String valor) {
	return matrizJogo[linha][coluna] = valor;
    }

    public boolean isPosicaoLivre(int linha, int coluna) {
	return matrizJogo[linha][coluna].equals("_");
    }

    public boolean isOverLimit(int linha) {
	return linha < 0 || linha > 2;
    }

    public void exibe() {
	System.out.println("\n");
	for (int linha = 0; linha < matrizJogo.length; linha++) {
	    for (int coluna = 0; coluna < matrizJogo.length; coluna++) {
		System.out.print(matrizJogo[linha][coluna] + "\t");
	    }
	    System.out.println("\n");
	}
	System.out.println("\n");
    }

}
