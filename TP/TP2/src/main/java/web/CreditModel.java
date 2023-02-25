package web;

public class CreditModel {
	private double montant,taux,mensualite;
	private int duree;
	public CreditModel() {
		super();
	}
	public CreditModel(double montant, double taux, int duree) {
		super();
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
	}
	public CreditModel(double montant, double taux, double mensualite, int duree) {
		super();
		this.montant = montant;
		this.taux = taux;
		this.mensualite = mensualite;
		this.duree = duree;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public double getMensualite() {
		return mensualite;
	}
	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	@Override
	public String toString() {
		return "CreditModel [montant=" + montant + ", taux=" + taux + ", mensualite=" + mensualite + ", duree=" + duree
				+ "]";
	}
	
}
