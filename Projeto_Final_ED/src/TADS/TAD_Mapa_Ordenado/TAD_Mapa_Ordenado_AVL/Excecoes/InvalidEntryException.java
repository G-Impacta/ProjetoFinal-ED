package TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_AVL.Excecoes;

//Exce��o entrada informada invalida.
@SuppressWarnings("serial")
public class InvalidEntryException extends RuntimeException {
	
	public InvalidEntryException(String error) {super(error);}

}