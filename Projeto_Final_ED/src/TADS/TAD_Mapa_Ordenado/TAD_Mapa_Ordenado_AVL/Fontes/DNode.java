package TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_AVL.Fontes;

import TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_AVL.Excecoes.InvalidPositionException;
import TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_AVL.Interfaces.Position;

//Implementa��o do nodo duplo que compoe a LISTA DE NODOS.
public class DNode<TYPE> implements Position<TYPE> {
	
	//Declara��o de Variaveis.
	private DNode<TYPE> prev, next; //Armazena a referencia ao nodo antecessor e sucessor.
	private TYPE element; //Armazena o elemento contido no nodo.
	
	//M�todo Construtor.
	public DNode(DNode<TYPE> prev, DNode<TYPE> next, TYPE element) {
		
		this.prev = prev; //Inicia a variavel com a referencia do nodo anterior.
		this.next = next; //Inicia a variavel com a referencia do proximo nodo.
		this.element = element; //Inicia o 'element=elemento' com o valor informado.
	}
	
	//M�todo da Interface Position.
	public TYPE element() throws InvalidPositionException {		
		if((prev == null) && (next == null)) {throw new InvalidPositionException("A posi��o n�o est� na lista!");} //Verifica se uma dada posi��o � valida.
		return element; //Retorna o elemento da posi��o.
	}
	
	//Retorna a posi��o do proximo nodo.
	public DNode<TYPE> getNext() {return next;}
	
	//Retorna a posi��o do nodo anterior.
	public DNode<TYPE> getPrev() {return prev;}	
	
	//Retorna o elemento contido no nodo.
	public TYPE getElement() {return element;}
	
	//Altera a referencia do proximo nodo pela nova referencia informada.
	public void setNext(DNode<TYPE> next) {this.next = next;}
	
	//Altera a referencia do nodo anterior pela nova referencia informada.
	public void setPrev(DNode<TYPE> prev) {this.prev = prev;}
	
	//Altera o elemento do nodo pelo novo valor informado.
	public void setElement(TYPE element) {this.element = element;}

}