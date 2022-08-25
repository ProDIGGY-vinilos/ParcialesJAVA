package ejercicio1;

import java.util.ArrayList;


public class Oficina extends Propiedad {
	private Boolean pisoTecnico;
	private ArrayList<Servicio> servis = new ArrayList<Servicio>();

	public Boolean getPisoTecnico() {
		return pisoTecnico;
	}

	public void setPisoTecnico(Boolean pisoTecnico) {
		this.pisoTecnico = pisoTecnico;
	}
	public void getServicios(Servicio service_) {
		this.servis.add(service_);		
	}
	
	@Override
	public double getAlquilerMensual() {
		double total = 0;
		for (Servicio servicio : servis) {
			total = total + servicio.getCostoMensual();
		}
		total = total + this.getImporteBase();
		return total;
	}
}
