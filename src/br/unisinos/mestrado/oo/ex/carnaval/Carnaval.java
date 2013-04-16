package br.unisinos.mestrado.oo.ex.carnaval;

/**
 * @author Cassio Dias
 */
public class Carnaval {

    private EscolaDeSamba[] escolas;

    private int last = 0;

    public Carnaval(int quantidadeDeEscolas) {
	this.escolas = new EscolaDeSamba[quantidadeDeEscolas];
    }

    /**
     * Adiciona nova escola de samba a lista de escolas.
     * 
     * @param e
     *            - nova EscolaDeSamba.
     * @throws Exception
     *             caso o array ja esteja cheio.
     */
    public void adicionaEscola(EscolaDeSamba e) throws Exception {
	if (last + 1 > escolas.length) {
	    throw new Exception(
		    "Ops, numero de escolas deste ano ja esgotaram.");
	}
	this.escolas[last] = e;
	last++;
    }

    /**
     * Remove o objeto a partir da posicao indicada e move todos demais
     * elementos para esquerda.
     * 
     * @param posicao
     *            a remover
     * @return true para remocao com sucesso; false para o inverso.
     */
    public boolean removeEscola(int posicao) {
	if ((posicao < 0) || (posicao > escolas.length - 1)) {
	    return false;
	}

	for (int i = (posicao + 1); i < escolas.length; ++i) {
	    if (escolas[i] == null) {
		break; // Daqui pra frente eh inutil percorrer
	    }
	    escolas[i - 1] = escolas[i];
	    escolas[i] = null;
	}
	last--;
	return true;
    }

    public String qualEhVencedora() {
	EscolaDeSamba vencedora = new EscolaDeSamba();
	for (EscolaDeSamba escola : escolas) {
	    if (escola == null) {
		break;
	    }

	    if (escola.carregarNotaFinal() > vencedora.carregarNotaFinal()) {
		vencedora = escola;
	    }
	}
	return "Escola vencedora eh: " + vencedora;
    }

    @Override
    public String toString() {
	String escolasString = "";
	for (EscolaDeSamba escola : escolas) {
	    if (escola == null) {
		break;
	    }
	    escolasString += escola.toString() + "\n";
	}
	return escolasString;
    }

}