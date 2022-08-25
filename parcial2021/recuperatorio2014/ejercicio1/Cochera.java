package ejercicio1;

public class Cochera extends Propiedad {
	private int capacidadVehiculos;
	private double cargoExtraPorVehiculo;
	
	public int getCapacidadVehiculos() {
		return capacidadVehiculos;
	}
	public void setCapacidadVehiculos(int capacidadVehiculos) {
		this.capacidadVehiculos = capacidadVehiculos;
	}
	public double getCargoExtraPorVehiculo() {
		return cargoExtraPorVehiculo;
	}
	public void setCargoExtraPorVehiculo(double cargoExtraPorVehiculo) {
		this.cargoExtraPorVehiculo = cargoExtraPorVehiculo;
	}

	@Override
	public double getAlquilerMensual() {
		double total = 0;
		total = this.getImporteBase();
		total = total + this.getCargoExtraPorVehiculo() * this.getCapacidadVehiculos();
		return total;
	}
	
}
