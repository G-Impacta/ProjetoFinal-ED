package TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_ABB.Excecoes;

//Exce��o chave informada invalida.
@SuppressWarnings("serial")
public class InvalidKeyException extends RuntimeException {
	
	public InvalidKeyException(String error) {super(error);}
	
}