package TADS.TAD_Fila.TAD_Fila_Arranjo.Excecoes;

//Exce��o de Fila cheia.
@SuppressWarnings("serial")
public class FullQueueException extends RuntimeException {
	
	public FullQueueException(String error) {super(error);}

}