package TADS.TAD_Mapa.Excecoes;

//Exce��o posi��o invalida.
@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	
	public InvalidPositionException(String error) {super(error);}

}