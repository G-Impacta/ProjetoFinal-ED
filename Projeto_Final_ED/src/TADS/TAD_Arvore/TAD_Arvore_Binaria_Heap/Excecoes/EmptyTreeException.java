package TADS.TAD_Arvore.TAD_Arvore_Binaria_Heap.Excecoes;

//Exce��o �rvore est� vazia.
@SuppressWarnings("serial")
public class EmptyTreeException extends RuntimeException {
	
	public EmptyTreeException(String error) {super(error);}

}