package ejercicio1;

import java.util.ArrayList;

public class Guia extends Empleado {
	private String disponibilidad;
	private double valorHora;
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public ArrayList<Viaje> getViajesDelMes(){
		ArrayList<Viaje> viajes = new ArrayList<>();
		return viajes;
	}
	@Override
	public double getSueldo() {
		double total=0;
		double horasviaje = 0;
		ArrayList<Viaje> viajes = new ArrayList<Viaje>();
		viajes = this.getViajesDelMes();
		for (Viaje viaje : viajes) {
			horasviaje = horasviaje + viaje.getDuracionHs();
		}
		total = total + (horasviaje * this.getValorHora()) + this.getSueldoBase() ;
		
		return total;
	}
}
