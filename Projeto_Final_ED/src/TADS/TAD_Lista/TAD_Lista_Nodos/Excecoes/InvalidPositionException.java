package TADS.TAD_Lista.TAD_Lista_Nodos.Excecoes;

//Exce��o posi��o invalida.
@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	
	public InvalidPositionException(String error) {super(error);}

}