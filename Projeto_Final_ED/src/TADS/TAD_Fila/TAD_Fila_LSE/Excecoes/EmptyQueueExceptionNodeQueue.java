package TADS.TAD_Fila.TAD_Fila_LSE.Excecoes;

//Exceção de Fila vazia.
@SuppressWarnings("serial")
public class EmptyQueueExceptionNodeQueue extends RuntimeException {
	
	public EmptyQueueExceptionNodeQueue(String error) {super(error);}

}