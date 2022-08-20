package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Chofer extends Empleado {
	private String carnet;
	private LocalDate proximoVencimiento;
	private double cantViajesPremio;
	private double premio;
	
	public String getCarnet() {
		return carnet;
	}
	
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	
	public LocalDate getProximoVencimiento() {
		return proximoVencimiento;
	}
	
	public void setProximoVencimiento(LocalDate proximoVencimiento) {
		this.proximoVencimiento = proximoVencimiento;
	}
	
	public double getCantViajesPremio() {
		return cantViajesPremio;
	}
	
	public void setCantViajesPremio(double cantViajesPremio) {
		this.cantViajesPremio = cantViajesPremio;
	}
	
	public double getPremio() {
		return premio;
	}
	
	public void setPremio(double premio) {
		this.premio = premio;
	}
	
	public ArrayList<Viaje> getViajesDelMes(){
		ArrayList<Viaje> viajes = new ArrayList<>();
		return viajes;
	}

	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		double total = 0;
		int viajesHechos = 0;
		ArrayList<Viaje> viajes = new ArrayList<Viaje>();
		viajes = this.getViajesDelMes();
		for (Viaje viaje : viajes) {
			viajesHechos = viajesHechos++;
		}
		
		if (viajesHechos >= this.getCantViajesPremio()) {
			total = this.getSueldoBase() + this.getPremio();
		}
		return total;
	}
}
