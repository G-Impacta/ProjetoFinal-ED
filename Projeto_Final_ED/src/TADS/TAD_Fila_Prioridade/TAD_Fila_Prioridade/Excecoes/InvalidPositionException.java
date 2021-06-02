package TADS.TAD_Fila_Prioridade.TAD_Fila_Prioridade.Excecoes;

//Exceção posição invalida.
@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	
	public InvalidPositionException(String error) {super(error);}

}