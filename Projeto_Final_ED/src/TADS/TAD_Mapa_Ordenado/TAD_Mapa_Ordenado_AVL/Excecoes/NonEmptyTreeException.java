package TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_AVL.Excecoes;

//Exce��o �rvore n�o est� vazia, n�o � possivel criar uma raiz.
@SuppressWarnings("serial")
public class NonEmptyTreeException extends RuntimeException {
	
	public NonEmptyTreeException(String error) {super(error);}

}