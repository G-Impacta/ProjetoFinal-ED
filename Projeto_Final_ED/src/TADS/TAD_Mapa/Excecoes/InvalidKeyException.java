package TADS.TAD_Mapa.Excecoes;

//Exce��o chave informada invalida.
@SuppressWarnings("serial")
public class InvalidKeyException extends RuntimeException {
	
	public InvalidKeyException(String error) {super(error);}
	
}