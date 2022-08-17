package entities;

public class Show extends Event {
	private String type;
	private String name;
	private double durationHs;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDurationHs() {
		return durationHs;
	}
	public void setDurationHs(double durationHs) {
		this.durationHs = durationHs;
	}
}
