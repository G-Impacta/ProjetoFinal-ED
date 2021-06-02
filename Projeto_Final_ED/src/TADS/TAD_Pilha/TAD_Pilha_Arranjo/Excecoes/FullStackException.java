package TADS.TAD_Pilha.TAD_Pilha_Arranjo.Excecoes;

//Exceção de Pilha cheia.
@SuppressWarnings("serial")
public class FullStackException extends RuntimeException {
	
	public FullStackException(String error) {super(error);}

}