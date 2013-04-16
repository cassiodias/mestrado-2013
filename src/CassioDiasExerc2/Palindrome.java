package CassioDiasCassiminhoExerc2;

import java.util.Stack;

/**
 * @author Cassio Dias Cassiminho - cassio.dias.25@gmail.com
 * 
 * Lista 2 de exercicios - nivelamento.
 */
public class Palindrome {

    /**
     * Inverte a palavra (ou palavras de uma frase) e verifica se a informacao
     * original Ž igual a invertida (desconsiderei letras soltas em caso de
     * frases).
     * 
     * Caso seja uma frase, verifica se existe pelo menos uma palavra como palindromo.
     * Letras sozinhas sao desconsideradas, porque A sempre sera um palindromo (por exemplo).
     * 
     * fonte - http://pt.wikipedia.org/wiki/Pal%C3%ADndromo
     */
    public boolean isTherePalindrome(String textoAProcurar) {
	String[] palavras = textoAProcurar.split(" "); // Considerando que exista uma frase
	
	for (String palavraParaInverter : palavras) {
	    String invertido = inverse(palavraParaInverter);
	    if (invertido.trim().equals(palavraParaInverter.trim())
		    && invertido.trim().length() > 1) {
		System.out.println(palavraParaInverter + " Ž um Palindromo.");
		return true;
	    }
	}
	return false;
    }

    /**
     * Modifica a ordem das letras do "textoAInverter" inserindo e retirando de
     * uma PILHA (LIFO).
     * 
     * Caso o "textoAInverter" seja uma frase, modifica a ordem de cada palavra
     * mas nao altera a ordem das palavras, conforme exemplo do enunciado.
     * 
     * Ex.: ESTE EXERCICIO E MUITO FACIL -> ETSE OICICREXE E OTIUM LICAF
     * 
     * @param textoAInverter
     * @return palavra / frase invertida
     */
    public String inverse(String textoAInverter) {
	String retorno = "";

	String[] palavras = textoAInverter.split(" "); // Considerando que
						       // exista uma frase.
	for (String palavra : palavras) {
	    Stack<String> pilha = new Stack<String>();
	    // Insere na pilha.
	    char[] palavraArray = palavra.toCharArray();
	    for (int i = 0; i < palavraArray.length; i++) {
		pilha.push(String.valueOf(palavraArray[i]));
	    }
	    // Busca da pilha (automaticamente esta tudo invertido).
	    while (pilha.size() > 0) {
		retorno += pilha.pop();
	    }
	    retorno += " ";
	}

	return retorno;
    }

}