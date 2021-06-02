package TADS.TAD_Arvore.TAD_Arvore_Binaria.Excecoes;

//Exceção árvore não está vazia, não é possivel criar uma raiz.
@SuppressWarnings("serial")
public class NonEmptyTreeException extends RuntimeException {
	
	public NonEmptyTreeException(String error) {super(error);}

}