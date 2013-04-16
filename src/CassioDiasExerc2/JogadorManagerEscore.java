package CassioDiasCassiminhoExerc2;

/**
 * @author Cassio Dias Cassiminho - cassio.dias.25@gmail.com
 * 
 *         Lista 2 de exercicios - nivelamento.
 * 
 *         Classe responsavel em armazenar os jogadores e garatir que a lista
 *         nao seja sobrecarregada - caso esteja cheia, insere o novo jogador
 *         caso o escore seja maior que algum item na lista.
 * 
 *         Regras de comparacao: 1 maior 0 igual -1 menor
 */
public class JogadorManagerEscore {

    private ArrayIndexListObject<JogadorEscore> listaDeJogadores;

    public JogadorManagerEscore(int capacidade) {
	// Na criacao já define o tamanho maximo da lista
	// Reescrevi o método contrutor.
	this.listaDeJogadores = new ArrayIndexListObject<JogadorEscore>(
		capacidade);
    }

    /**
     * Aproveitei o método print de ArrayINdexListObj que - internamente - usa o
     * método toString da classe JogadorEscore.
     */
    public void listar() {
	listaDeJogadores.print();
    }

    public void adicionarJogador(JogadorEscore novoJogador) {

	if (!listaDeJogadores.isFull()) { // isFull - método novo que criei.
	    listaDeJogadores.add(0, novoJogador);
	    System.out.println("Jogador " + novoJogador + " inserido com sucesso.");

	} else {
	    processarInsercaoListaCheia(novoJogador);
	}

    }

    private void processarInsercaoListaCheia(JogadorEscore novoJogador) {
	System.out.println("Oops, lista cheia... vamos analisar...");
	System.out.println();

	for (int i = 0, size = listaDeJogadores.size(); i < size; i++) {
	    JogadorEscore jogadorDaLista = listaDeJogadores.get(i);

	    if (novoJogador.compareTo(jogadorDaLista) == 1) {
		// opa! Novo jogador possui escore maior que o jogador atual da
		// lista.
		System.out.println("É possivel trocar jogador porque possui maior escore!");
		System.out.println("Jogador que foi removido: " + jogadorDaLista);
		System.out.println("Novo jogador adicionado: " + novoJogador);
		listaDeJogadores.set(i, novoJogador);
		break;
	    }
	}
    }

}