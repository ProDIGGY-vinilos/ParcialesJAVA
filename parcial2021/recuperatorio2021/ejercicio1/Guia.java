package ejercicio1;

import java.util.ArrayList;

public class Guia extends Empleado {
	private String disponibilidad;
	private double valorHora;
	private ArrayList<Viaje> viajes = new ArrayList<>();
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
		
		return viajes;
	}
	@Override
	public double getSueldo() {
		double total=0;
		double horasviaje = 0;				
		for (Viaje viaje : this.getViajesDelMes()) {
			horasviaje = horasviaje + viaje.getDuracionHs();
		}
		total = total + (horasviaje * this.getValorHora()) + this.getSueldoBase() ;
		
		return total;
	}
}
