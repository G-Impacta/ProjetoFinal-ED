package TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_ABB.Excecoes;

//Exce��o posi��o invalida.
@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	
	public InvalidPositionException(String error) {super(error);}

}