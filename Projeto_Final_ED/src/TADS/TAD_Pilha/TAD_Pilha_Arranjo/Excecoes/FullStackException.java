package TADS.TAD_Pilha.TAD_Pilha_Arranjo.Excecoes;

//Exce��o de Pilha cheia.
@SuppressWarnings("serial")
public class FullStackException extends RuntimeException {
	
	public FullStackException(String error) {super(error);}

}