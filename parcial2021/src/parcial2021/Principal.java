package parcial2021;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	public double getTotal(LinkedList<BillItem> items, Boolean includeTax) {
		double tot =0;
		for (BillItem billItem : items) {
			tot = tot + (billItem.getUnitPrice() * billItem.getQuantity());
		}
		if (includeTax) {
			tot= tot*1.21;
		}
		return tot;
	}

}
