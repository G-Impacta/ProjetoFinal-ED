package TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_ABB.Interfaces;

import java.util.Iterator;

import TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_ABB.Excecoes.BoundaryViolationException;
import TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_ABB.Excecoes.EmptyTreeException;
import TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_ABB.Excecoes.InvalidPositionException;

//Interface para o TAD �RVORE BIN�RIA.
public interface Tree<TYPE> extends Iterable<TYPE>{
	
	//Retorna um inteiro com a quantidade de elementos contidos na �RVORE BIN�RIA.
	public int size();
	
	//Retorna um valor booleano representando o status da �RVORE BIN�RIA => True=Vazia, False=N�o Vazia.
	public boolean isEmpty();	

	//Retorna um valor booleano representando o status do nodo => True=Interno, False=N�o Interno.
	public boolean isInternal(Position<TYPE> position) throws InvalidPositionException;

	//Retorna um valor booleano representando o status do nodo => True=Externo, False=N�o Externo.
	public boolean isExternal(Position<TYPE> position) throws InvalidPositionException;

	//Retorna um valor booleano representando o status do nodo => True=Raiz, False=N�o Raiz.
	public boolean isRoot(Position<TYPE> position) throws InvalidPositionException;	
	
	//Troca o elemento armazenado em um determinado nodo e retorna o elemento que estava armazenado nele.
	public TYPE replace(Position<TYPE> position, TYPE element) throws InvalidPositionException;
	
	//Retorna a raiz da �rvore.
	public Position<TYPE> root() throws EmptyTreeException;
	
	//Retorna o pai de um dado nodo.
	public Position<TYPE> parent(Position<TYPE> position) throws InvalidPositionException, BoundaryViolationException;
	
	//Retorna um iterador sobre todos os elementos da �rvore.
	public Iterator<TYPE> iterator();
	
	//Retorna uma cole��o iter�vel de todos os nodos armazenados na �rvore.
	public Iterable<Position<TYPE>> positions();
	
	//Retorna uma cole��o iter�vel de todos os filhos de um dado nodo da �rvore.
	public Iterable<Position<TYPE>> children(Position<TYPE> position) throws InvalidPositionException;
	
}