package TADS.TAD_Lista.TAD_Lista_Nodos.Excecoes;

//Exce��o Posi��o Fora do Intervalo da LISTA DE NODOS.
@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException {
	
	public BoundaryViolationException(String error) {super(error);}

}