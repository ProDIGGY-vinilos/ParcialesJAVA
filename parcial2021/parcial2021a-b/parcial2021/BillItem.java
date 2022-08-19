package parcial2021;

import java.util.LinkedList;

public class BillItem  {
	private double unitPrice;
	private int quantity;
	
	public BillItem(double unitPrice, int quantity) {
		super();
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	public void setUnirPrice(double unirPrice) {
		this.unitPrice = unirPrice;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {return unitPrice;}
	public int getQuantity() {return quantity;}
	
	public static double getTotal(LinkedList<BillItem> items, Boolean includeTax) {
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
