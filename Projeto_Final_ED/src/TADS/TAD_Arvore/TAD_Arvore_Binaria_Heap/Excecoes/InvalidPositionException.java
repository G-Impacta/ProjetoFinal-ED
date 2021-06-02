package TADS.TAD_Arvore.TAD_Arvore_Binaria_Heap.Excecoes;

//Exceção posição invalida.
@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	
	public InvalidPositionException(String error) {super(error);}

}