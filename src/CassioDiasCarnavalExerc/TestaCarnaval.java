package CassioDiasCassiminhoCarnavalExerc;

import java.util.Scanner;

/**
 * @author Cassio Dias - cassio.dias.25@gmail.com - 26/02/2013
 */
public class TestaCarnaval {

    public static void main(String[] args) throws Exception {
	EscolaDeSamba esc1 = criarEscola();
	EscolaDeSamba esc2 = criarEscola();
	EscolaDeSamba esc3 = criarEscola();

	Carnaval c = new Carnaval(3);
	c.adicionaEscola(esc1);
	c.adicionaEscola(esc2);
	c.adicionaEscola(esc3);

	System.out.println(c.qualEhVencedora());

    }

    private static EscolaDeSamba criarEscola() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("-------------------------");
	System.out.println("Digite o nome da escola");
	EscolaDeSamba esc1 = new EscolaDeSamba(scanner.nextLine());

	System.out.println("Digite nota para alegorias e aderecos");
	esc1.setNotaAlegoriasEAderecos(scanner.nextDouble());

	System.out.println("Digite nota para bateria");
	esc1.setNotaBateria(scanner.nextDouble());

	System.out.println("Digite nota para comissao de frente");
	esc1.setNotaComissaoDeFrente(scanner.nextDouble());

	System.out.println("Digite nota para enredo");
	esc1.setNotaEnredo(scanner.nextDouble());

	System.out.println("Digite nota para evolucao harmonia e conjunto");
	esc1.setNotaEvolucaoHarmoniaEconjunto(scanner.nextDouble());

	System.out.println("Digite nota para mestre sala e porta bandeira");
	esc1.setNotaMestreSalaEportaBandeira(scanner.nextDouble());

	System.out.println("Digite nota para alegorias e aderecos");
	esc1.setNotaSambaEnredo(scanner.nextDouble());
	System.out.println("----------------");
	return esc1;
    }

}
