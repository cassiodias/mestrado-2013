package CassioDiasCassiminhoExerc2;

/**
 * 
 * @author Cassio Dias Cassiminho - cassio.dias.25@gmail.com
 * 
 * Lista 2 de exercicios - nivelamento.
 *
 */
public class JogadorEscoreTeste {

    private static final int LIMITE_DE_JOGADORES = 10;

    public static void main(String[] args) {
	// Limite de 10 jogadores conforme enunciado
	JogadorManagerEscore jm = new JogadorManagerEscore(LIMITE_DE_JOGADORES);
	
	JogadorEscore j1 = new JogadorEscore("A", 100.0D);
	jm.adicionarJogador(j1);
	
	JogadorEscore j2 = new JogadorEscore("B", 90.0D);
	jm.adicionarJogador(j2);
	
	JogadorEscore j3 = new JogadorEscore("C", 80.0D);
	jm.adicionarJogador(j3);
	
	JogadorEscore j4 = new JogadorEscore("D", 70.0D);
	jm.adicionarJogador(j4);
	
	JogadorEscore j5 = new JogadorEscore("E", 60.0D);
	jm.adicionarJogador(j5);
	
	JogadorEscore j6 = new JogadorEscore("F", 50.0D);
	jm.adicionarJogador(j6);
	
	JogadorEscore j7 = new JogadorEscore("G", 40.0D);
	jm.adicionarJogador(j7);
	
	JogadorEscore j8 = new JogadorEscore("H", 30.0D);
	jm.adicionarJogador(j8);
	
	JogadorEscore j9 = new JogadorEscore("I", 20.0D);
	jm.adicionarJogador(j9);
	
	JogadorEscore j10 = new JogadorEscore("J", 10.0D);
	jm.adicionarJogador(j10);

	// Lista cheia, vai verificar se pode entrar na lista.
	JogadorEscore j11 = new JogadorEscore("Jogador que substituiu o J", 15.0D);
	jm.adicionarJogador(j11);
	
	// Mostrar a lista.
	jm.listar();
    }

}
