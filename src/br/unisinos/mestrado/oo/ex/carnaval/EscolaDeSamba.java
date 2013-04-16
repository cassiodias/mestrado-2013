package br.unisinos.mestrado.oo.ex.carnaval;

/**
 * @author Cassio Dias - cassio.dias.25@gmail.com - 26/02/2013
 */
public class EscolaDeSamba {

    private double[] quesitosNotas = new double[7];

    private String[] quesitosNomes = new String[] { "Comissao de frente",
	    "Alegoria e aderecos", "Evolucao, harmonia e conjunto", "Enredo",
	    "Samba enredo", "Mestre sala e porta bandeira", "Bateria" };

    private String nome;
    
    private double notaFinal;

    public EscolaDeSamba() {
	super();
    }

    public EscolaDeSamba(String nome) {
	this.nome = nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public void setNotaComissaoDeFrente(double nota) {
	this.quesitosNotas[0] = nota;
	atualizarNotaFinalTrigger();
    }

    public void setNotaAlegoriasEAderecos(double nota) {
	this.quesitosNotas[1] = nota;
	atualizarNotaFinalTrigger();
    }

    public void setNotaEvolucaoHarmoniaEconjunto(double nota) {
	this.quesitosNotas[2] = nota;
	atualizarNotaFinalTrigger();
    }

    public void setNotaEnredo(double nota) {
	this.quesitosNotas[3] = nota;
	atualizarNotaFinalTrigger();
    }

    public void setNotaSambaEnredo(double nota) {
	this.quesitosNotas[4] = nota;
	atualizarNotaFinalTrigger();
    }

    public void setNotaMestreSalaEportaBandeira(double nota) {
	this.quesitosNotas[5] = nota;
	atualizarNotaFinalTrigger();
    }

    public void setNotaBateria(double nota) {
	this.quesitosNotas[6] = nota;
	atualizarNotaFinalTrigger();
    }
    
    public double carregarNotaFinal(){
	return this.notaFinal;
    }
    
    private void atualizarNotaFinalTrigger(){
	this.notaFinal = 0.0D;
	for (double quesito : quesitosNotas){
	    notaFinal += quesito;
	}
    }

    @Override
    public String toString() {
	String dadosGerais = "Escola: " + this.nome + " - nota final: " + this.notaFinal;
	for (int i = 0; i < quesitosNotas.length; i++) {
	    dadosGerais += quesitosNomes[i] + "=" + quesitosNotas[i] + "; ";
	}
	return dadosGerais;
    }

}