package entities;

import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;


public class Caterig extends Event {
	private double fixedCost;
	private ArrayList<Menu> menues = new ArrayList<Menu>();

	public double getFixedCost() {
		return fixedCost;
	}
	public void setFixedCost(double fixedCost) {
		this.fixedCost = fixedCost;
	}
	
	public void cargaMenu(Menu menu_) {
		this.menues.add(menu_);
	}
	
	@Override
	public double getOveralCost() {
		double costoMenues = 0;
		for (Menu menu : menues) {
			costoMenues = costoMenues + (menu.getQuantity() * menu.getUnitCost());
		}
		
		return costoMenues+this.getFixedCost() + this.getServicesCost();
	}
	
}
