package entities;

public class Show extends Event {
	private String type;
	private String name;
	private double durationHs;
	private Equipement equipement_;
	private Artist artist_;
	
	
	public Equipement getEquipement_() {
		return equipement_;
	}
	public void setEquipement_(Equipement equipement_) {
		this.equipement_ = equipement_;
	}
	public Artist getArtist_() {
		return artist_;
	}
	public void setArtist_(Artist artist_) {
		this.artist_ = artist_;
	}
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
	
	@Override
	public double getOveralCost() {
		double costoShow = 0;
		costoShow = (this.durationHs*this.artist_.getHourlyCost()) + this.equipement_.getCost();
		return costoShow + this.getServicesCost();
	}
}
