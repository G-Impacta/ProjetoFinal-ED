package TADS.TAD_Fila_Prioridade.TAD_Fila_Prioridade.Excecoes;

//Exce��o Posi��o Fora do Intervalo da LISTA DE NODOS.
@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException {
	
	public BoundaryViolationException(String error) {super(error);}

}