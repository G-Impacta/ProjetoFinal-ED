package TADS.TAD_Fila_Prioridade.TAD_Fila_Prioridade.Excecoes;

//Exce��o chave informada invalida.
@SuppressWarnings("serial")
public class InvalidKeyException extends RuntimeException {
	
	public InvalidKeyException(String error) {super(error);}
	
}