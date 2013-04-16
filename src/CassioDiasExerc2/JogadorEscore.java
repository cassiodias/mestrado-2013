package CassioDiasCassiminhoExerc2;

/**
 * 
 * @author Cassio Dias Cassiminho - cassio.dias.25@gmail.com
 * 
 * Lista 2 de exercicios - nivelamento.
 *
 */
public class JogadorEscore implements Comparable<JogadorEscore> {

    private Double escore = Double.valueOf(0.0D);

    private String nome;

    public JogadorEscore(String nome, Double escore) {
	super();
	this.nome = nome;
	this.escore = escore;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Double getEscore() {
	return escore;
    }

    public void setEscore(Double escore) {
	this.escore = escore;
    }

    // if ( this.escore > ) ->  1
    // if ( this.escore = ) ->  0
    // if ( this.escore < ) -> -1
    @Override
    public int compareTo(JogadorEscore escore) {
	return this.escore.compareTo(escore.getEscore());
    }

    @Override
    public String toString() {
	return "Jogador [escore=" + escore + ", nome=" + nome + "]";
    }

}
