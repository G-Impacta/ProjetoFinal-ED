package TADS.TAD_Arvore.TAD_Arvore_Binaria.Excecoes;

//Exce��o LISTA DE NODOS vazia.
@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException {
	
	public EmptyListException(String error) {super(error);}

}