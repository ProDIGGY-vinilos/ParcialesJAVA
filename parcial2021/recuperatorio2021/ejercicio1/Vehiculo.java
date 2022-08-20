package ejercicio1;

import java.util.ArrayList;

public class Vehiculo {
	private String patente;
	private String marca;
	private String modelo;
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public ArrayList<Viaje> getViajesDelMes(){
		ArrayList<Viaje> viajes = new ArrayList<>();
		return viajes;
	}
	public double getKmrecorridos() {
		ArrayList<Viaje> viajes = new ArrayList<>();
		double kmRecorridos=0;
		for (Viaje viaje : viajes) {
			kmRecorridos = kmRecorridos + viaje.getKms();
		}
		return kmRecorridos;
	}
}
