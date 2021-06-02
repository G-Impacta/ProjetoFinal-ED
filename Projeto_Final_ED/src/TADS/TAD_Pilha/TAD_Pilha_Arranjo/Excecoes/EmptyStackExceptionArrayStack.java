package TADS.TAD_Pilha.TAD_Pilha_Arranjo.Excecoes;

//Exceção de Pilha vazia.
@SuppressWarnings("serial")
public class EmptyStackExceptionArrayStack extends RuntimeException {
	
	public EmptyStackExceptionArrayStack(String error) {super(error);}

}