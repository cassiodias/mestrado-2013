package CassioDiasCassiminhoExerc3;

public class DLinkedList<E> {
    protected DNode<E> head; // nodo cabeça da lista
    protected DNode<E> tail; // nodo cauda da lista
    protected long size; // número de nodos da lista

    public DLinkedList() {
	size = 0;
	head = tail = null;
    }

    public boolean isEmpty() {
	return head == null;
    }

    public E getFirst() throws UnderflowException {
	if (isEmpty())
	    throw new UnderflowException();
	return head.getElement();
    }

    public E getLast() throws UnderflowException {
	if (isEmpty())
	    throw new UnderflowException();
	return tail.getElement();
    }

    public void addFirst(E insertItem) {
	DNode<E> n = new DNode<E>(insertItem);
	if (isEmpty()) {
	    head = tail = n;
	} else {
	    head.setPrevious(n);
	    n.setNext(head);
	    head = n;
	}
	size++;
    }

    public void addLast(E insertItem) {
	DNode<E> n = new DNode<E>(insertItem);
	if (isEmpty()) {
	    head = tail = n;
	} else {
	    tail.setNext(n);
	    n.setPrevious(tail);
	    tail = n;
	}
	size++;
    }

    public E removeFirst() throws UnderflowException {
	if (isEmpty()) {
	    throw new UnderflowException();
	}
	E removedItem = head.getElement();
	if (head == tail) {
	    head = tail = null;
	} else {
	    head = head.getNext();
	    head.setPrevious(null);
	}
	size--;
	return removedItem;
    }

    public E removeLast() throws UnderflowException {
	if (isEmpty()) {
	    throw new UnderflowException();
	}
	E removedItem = tail.getElement();
	if (head == tail) {
	    head = tail = null;
	} else {
	    DNode<E> penultimo = tail.getPrevious();
	    tail = penultimo;
	    tail.setNext(null);
	}
	size--;
	return removedItem;
    }

    public void print() {
	System.out.println("Exibindo a lista:");
	DNode<E> current = head;
	while (current != null) {
	    System.out.println(current.getElement());
	    current = current.getNext();
	}
    }

    public DNode<E> find(E key) {
	DNode<E> current = head;
	while (current != null) {
	    if (current.getElement().equals(key)) {
		return current;
	    }
	    current = current.getNext();
	}
	return null;
    }

    public boolean addBefore(E el, E chave) {
	DNode<E> current = find(chave);
	if (current == null) {
	    return false;
	} else if (current == head) {
	    addFirst(el);
	    return true;
	} else {
	    DNode<E> n2 = new DNode<E>(el);
	    DNode<E> before = current.getPrevious();
	    before.setNext(n2);
	    n2.setPrevious(before);
	    n2.setNext(current);
	    current.setPrevious(n2);
	    return true;
	}
    }

    public boolean removeInPosition(int pos) {
	if (pos < 0 || pos > this.size - 1) { // fora da faixa nao processa.
	    return false;
	}

	DNode<E> atual = head;
	for (int i = 0; i < this.size; i++) {
	    if (pos == i) {
		DNode<E> anterior = atual.getPrevious();
		atual = atual.getNext();
		if (anterior == null) { // removendo a primeira posicao
		    head = atual;
		} else {
		    anterior.setNext(atual);
		}

		if (atual == null) { // removendo a ultima posicao
		    tail = anterior;
		} else {
		    atual.setPrevious(anterior);
		}
		size--;
		return true;

	    } else {
		atual = atual.getNext();
	    }
	}
	return false;
    }

    public boolean insertAfter(int pos, DNode<E> toInsert) {
	if (pos < 0 || pos > size) { // fora da faixa nao processa.
	    return false;
	}

	DNode<E> atual = head;
	for (int i = 0; i < this.size; i++) {
	    if (pos == i) {
		DNode<E> proximo = atual.getNext();

		atual.setNext(toInsert);
		toInsert.setPrevious(atual);
		toInsert.setNext(proximo);
		if (proximo != null) { // se nao Ž o ultimo efetua o ponteiro
				       // para o anterior.
		    proximo.setPrevious(toInsert);

		} else { // inserindo na ultima posicao, atualiza o tail
		    tail = toInsert;
		    tail.setNext(null);
		}
		size++;
		return true;

	    } else {
		atual = atual.getNext();
	    }
	}

	return false;
    }

}