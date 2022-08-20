package ejercicio1;

import java.time.LocalDate;

public class Viaje {
	private int id;
	private LocalDate fecha;
	private double duracionHs;
	private double kms;
	private int capacidad;
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getDuracionHs() {
		return duracionHs;
	}
	public void setDuracionHs(double duracionHs) {
		this.duracionHs = duracionHs;
	}
	public double getKms() {
		return kms;
	}
	public void setKms(double kms) {
		this.kms = kms;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getId() {
		return id;
	}
	
}
