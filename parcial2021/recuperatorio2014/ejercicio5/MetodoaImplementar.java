package ejercicio5;

import java.util.ArrayList;

public class MetodoaImplementar {
	
	public String getEstado(ArrayList<Double> notas) {
		String result = "";
		double prom = 0;
		for (Double not : notas) {
			prom = prom + not;
		}
		prom = prom / notas.size();
		if (prom < 6) {
			result = "NA";
		} 
		if ((prom >= 6) && (8 > prom)) {
			result = "A";
		} 
		if (prom >= 8) {
			result = "A+";
		} 
		
		return result;		
	}
	
}
