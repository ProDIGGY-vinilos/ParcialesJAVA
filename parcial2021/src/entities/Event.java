package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Event {
	private LocalDateTime eventDate;
	private String location;
	private ArrayList<Service> services = new ArrayList<Service>();
	public LocalDateTime getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void cargaServicios(Service service_) {
		this.services.add(service_);
	}
	
	public double getServicesCost() {
		double costoServicios = 0;
		for (Service service : services) {
			costoServicios = costoServicios + service.getCost();
		}
		return costoServicios;
	}
	
	public abstract double getOveralCost() ;
	
	
}
