package TADS.TAD_Pilha.TAD_Pilha_LSE.Excecoes;

//Exce��o de Pilha vazia.
@SuppressWarnings("serial")
public class EmptyStackExceptionNodeStack extends RuntimeException {
	
	public EmptyStackExceptionNodeStack(String error) {super(error);}

}