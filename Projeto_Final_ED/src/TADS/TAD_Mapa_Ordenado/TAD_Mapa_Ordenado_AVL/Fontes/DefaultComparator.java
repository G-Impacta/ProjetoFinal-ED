package TADS.TAD_Mapa_Ordenado.TAD_Mapa_Ordenado_AVL.Fontes;

import java.util.Comparator;

public class DefaultComparator<TYPE> implements Comparator<TYPE> {
	
	@SuppressWarnings("unchecked")
	public int compare(TYPE keyOne, TYPE keyTwo) throws ClassCastException {		
		return ((Comparable<TYPE>) keyOne).compareTo(keyTwo);
	}
	
}