package TADS.TAD_Arvore.TAD_Arvore_Generica.Excecoes;

//Exceção Posição Fora do Intervalo Permitido.
@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException {
	
	public BoundaryViolationException(String error) {super(error);}

}