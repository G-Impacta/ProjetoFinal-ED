package TADS.TAD_Fila_Prioridade.TAD_Fila_Prioridade.Excecoes;

//Exce��o posi��o invalida.
@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	
	public InvalidPositionException(String error) {super(error);}

}