package CassioDiasCassiminhoExerc2;

/**
 * 
 * @author Cassio Dias Cassiminho - cassio.dias.25@gmail.com
 * 
 * Lista 2 de exercicios - nivelamento.
 *
 */
public class PalindromeTeste {

    public static void main(String[] args) {
	Palindrome palindrome = new Palindrome();

	// Testando um NAO palindromo
	String originalString = "ESTE EXERCICIO E MUITO FACIL";
	String inverseString = palindrome.inverse(originalString);
	System.out.println("Palavra original: " + originalString);
	System.out.println("Palavra invertida: " + inverseString);
	System.out.println("Existe palindromo? " + palindrome.isTherePalindrome(inverseString));
	System.out.println();

	// Testando um palindromo com frase
	originalString = "CACHORRO GATO RATO MUSSUM";
	System.out.println("Palavra original: " + originalString);
	inverseString = palindrome.inverse(originalString);
	System.out.println("Palavra invertida: " + inverseString);
	System.out.println("Existe palindromo? " + palindrome.isTherePalindrome(inverseString));
	System.out.println();

	// Testando um palindromo com uma palavra
	originalString = "OVO";
	System.out.println("Palavra original: " + originalString);
	System.out.println("Existe palindromo? " + palindrome.isTherePalindrome(originalString));
    }

}
