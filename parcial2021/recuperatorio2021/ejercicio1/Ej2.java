package ejercicio1;

import java.util.ArrayList;

public class Ej2 {

	public int cantLargas(ArrayList<String> listaNombres, int tamanio) {
		int cant=0;
		for (String nombres : listaNombres) {
			if (nombres.length() > tamanio) {
				cant++;
			}
		}
		return cant;
	}
}
