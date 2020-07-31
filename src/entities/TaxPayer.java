package entities;

public abstract class TaxPayer {
	private String taxPayer;
	private Double anualIncome;
	
	public TaxPayer(String taxPayer, Double anualIncome) {
		this.taxPayer = taxPayer;
		this.anualIncome = anualIncome;
	}

	public String getTaxPayer() {
		return taxPayer;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public abstract double taxesPaid();

	public abstract String toString();	
}
