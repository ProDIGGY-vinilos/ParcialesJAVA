package entities;

public class Menu {
	private String name;
	private double unitCost;
	private int quantity;
	
	
	public Menu(String name, double unitCost, int quantity) {
		super();
		this.name = name;
		this.unitCost = unitCost;
		this.quantity = quantity;
	}
	public  Menu() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
