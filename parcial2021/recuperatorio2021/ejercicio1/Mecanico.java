package ejercicio1;

import java.util.ArrayList;

public class Mecanico extends Empleado {
	private double valorKm;

	public double getValorKm() {
		return valorKm;
	}

	public void setValorKm(double valorKm) {
		this.valorKm = valorKm;
	}

	@Override
	public double getSueldo() {
		double total = 0;
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo : vehiculos) {
			total = total + (vehiculo.getKmrecorridos() * this.getValorKm());
		}
		return (total + this.getSueldoBase());
	}
	
}
