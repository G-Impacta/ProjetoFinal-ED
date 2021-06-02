package TADS.TAD_Mapa.Excecoes;

//Exceção posição invalida.
@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	
	public InvalidPositionException(String error) {super(error);}

}