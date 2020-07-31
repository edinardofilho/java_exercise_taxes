package entities;

public class IndividualTaxPayer extends TaxPayer {
	public Double healthExpenditures;

	public IndividualTaxPayer(String taxPayer, Double anualIncome, Double healthExpenditures) {
		super(taxPayer, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	@Override
	public double taxesPaid() {
		if (getAnualIncome() >= 20000.0) {
			return (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
		} 
		else {
			return (getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
		}
	}

	@Override
	public String toString() {
		return getTaxPayer() +
				": $ " +
				String.format("%.2f\n", taxesPaid());
	}
}
