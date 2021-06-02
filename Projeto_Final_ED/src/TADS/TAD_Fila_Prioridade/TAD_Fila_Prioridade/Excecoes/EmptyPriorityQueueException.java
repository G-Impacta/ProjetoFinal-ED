package TADS.TAD_Fila_Prioridade.TAD_Fila_Prioridade.Excecoes;

//Exceção de Fila de prioridade vazia.
@SuppressWarnings("serial")
public class EmptyPriorityQueueException extends RuntimeException {
	
	public EmptyPriorityQueueException(String error) {super(error);}

}