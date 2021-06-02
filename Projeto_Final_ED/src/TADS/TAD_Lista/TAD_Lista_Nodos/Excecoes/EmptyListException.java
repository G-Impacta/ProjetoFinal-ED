package TADS.TAD_Lista.TAD_Lista_Nodos.Excecoes;

//Exceção LISTA DE NODOS vazia.
@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException {
	
	public EmptyListException(String error) {super(error);}

}