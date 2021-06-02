package TADS.TAD_Arvore.TAD_Arvore_Generica.Excecoes;

//Exceção LISTA DE NODOS vazia.
@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException {
	
	public EmptyListException(String error) {super(error);}

}