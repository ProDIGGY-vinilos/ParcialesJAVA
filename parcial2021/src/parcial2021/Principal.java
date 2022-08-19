package parcial2021;

import java.util.LinkedList;


public class Principal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<BillItem> it = new LinkedList<>();
	
		BillItem bill = new BillItem(1, 3);
		it.add(bill);
		BillItem bill1 = new BillItem(2, 1);
		it.add(bill1);
		
		BillItem bill2 = new BillItem(1, 5);
		it.add(bill2);
		
		BillItem bill3 = new BillItem(2, 2);
		it.add(bill3);
		
		System.out.println(BillItem.getTotal(it, false));	
	

	}
	
	
}
