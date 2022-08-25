package ejercicio1;

public class DomicilioParticular extends Propiedad  {
	private Boolean usoComercialPermitido;
	private int habitaciones;
	public Boolean getUsoComercialPermitido() {
		return usoComercialPermitido;
	}
	public void setUsoComercialPermitido(Boolean usoComercialPermitido) {
		this.usoComercialPermitido = usoComercialPermitido;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	@Override
	public double getAlquilerMensual() {
		double total = 0;
		total = (((this.getImporteBase()*5)/100) * this.getHabitaciones()) + this.getImporteBase() ;
		
		return total;
	}
}
