package TADS.TAD_Fila_Prioridade.TAD_Fila_Prioridade_Heap.Interfaces;

import TADS.TAD_Fila_Prioridade.TAD_Fila_Prioridade_Heap.Excecoes.BoundaryViolationException;
import TADS.TAD_Fila_Prioridade.TAD_Fila_Prioridade_Heap.Excecoes.InvalidPositionException;

//Interface para � �RVORE BIN�RIA.
public interface BinaryTree<TYPE> extends Tree<TYPE> {
	
	//Retorna o filho esquerdo do nodo.
	public Position<TYPE> left(Position<TYPE> position) throws InvalidPositionException, BoundaryViolationException;
	
	//Retorna o filho direito do nodo.
	public Position<TYPE> right(Position<TYPE> position) throws InvalidPositionException, BoundaryViolationException;
	
	//Retorna o valor booleano representando se o nodo tem filho a esquerda.
	public boolean hasLeft(Position<TYPE> position) throws InvalidPositionException;
	
	//Retorna o valor booleano representando se o nodo tem filho a direita.
	public boolean hasRight(Position<TYPE> position) throws InvalidPositionException;
	
}