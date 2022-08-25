package ejercicio1;

import java.util.ArrayList;

public class Mecanico extends Empleado {
	private double valorKm;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public double getValorKm() {
		return valorKm;
	}

	public void setValorKm(double valorKm) {
		this.valorKm = valorKm;
	}
	
	public void setVehiculos(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}

	@Override
	public double getSueldo() {
		double total = 0;		
		for (Vehiculo vehiculo : vehiculos) {
			total = total + (vehiculo.getKmrecorridos() * this.getValorKm());
		}
		return (total + this.getSueldoBase());
	}
	
}
