package TADS.TAD_Fila.TAD_Fila_Arranjo.Excecoes;

//Exce��o de Fila vazia.
@SuppressWarnings("serial")
public class EmptyQueueExceptionArrayQueue extends RuntimeException {
	
	public EmptyQueueExceptionArrayQueue(String error) {super(error);}

}