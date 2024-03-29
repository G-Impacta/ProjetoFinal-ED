package TADS.TAD_Fila.TAD_Fila_Arranjo.Interfaces;

import TADS.TAD_Fila.TAD_Fila_Arranjo.Excecoes.EmptyQueueExceptionArrayQueue;

//Interface para o TAD FILA USANDO ARRANJO.
public interface Queue<TYPE> {	
	
	//Retorna um inteiro com a quantidade de elementos contidos na FILA.
	public int size();
	
	//Retorna um valor booleano representando o status da FILA => True=Vazia, False=N�o Vazia.
	public boolean isEmpty();
	
	//Retorna o elemento � frente da FILA, sem remove-lo.
	public TYPE front() throws EmptyQueueExceptionArrayQueue;
	
	//Adiciona um 'element=elemento' no final da FILA.
	public void enqueue(TYPE element);
	
	//Remove e retorna o elemento � frente da FILA.
	public TYPE dequeue() throws EmptyQueueExceptionArrayQueue;

}