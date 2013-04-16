package CassioDiasCassiminhoExerc3;

/**
 * 
 * @author Cassio Dias Cassiminho - Nivelamento - 05/03/2013
 * cassio.dias.25@gmail.com
 *
 */
public class ListaEncadeadaTest {

    public static void main(String args[]) {
	DLinkedList<Integer> list = new DLinkedList<Integer>();
	list.addLast(2);
	list.addLast(4);
	list.addLast(6);
	list.addLast(8);
	list.addLast(10);
	list.print();

	DNode<Integer> d = new DNode<Integer>(-1);
	System.out.println("Removeu? " + list.removeInPosition(3)); //remove o valor da posicao 3, no caso o 8
	System.out.println("Inseriu? " + list.insertAfter(3, d)); // insere -1 apos o 10, ja que 0 10 agora esta na posicao 3.
	
	list.addFirst(0); // s— para testar que os indices estao OK...
	list.addLast(99);
	
	list.print();
    }

}