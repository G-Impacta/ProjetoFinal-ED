package TADS.TAD_Fila_Prioridade.TAD_Fila_Prioridade_Heap.Excecoes;

//Exceção de Fila de prioridade vazia.
@SuppressWarnings("serial")
public class EmptyHeapPriorityQueueException extends RuntimeException {
	
	public EmptyHeapPriorityQueueException(String error) {super(error);}

}