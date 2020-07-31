package entities;

public class CompanyTaxPayer extends TaxPayer {
	private int employeeNumber;

	public CompanyTaxPayer(String taxPayer, Double anualIncome, int employeeNumber) {
		super(taxPayer, anualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	@Override
	public double taxesPaid() {
		if (getAnualIncome() <= 10) {
			return getAnualIncome() * 0.16;
		} 
		else {
			return getAnualIncome() * 0.14;
		}
	}
	
	@Override
	public String toString() {
		return getTaxPayer() +
				": $ " +
				String.format("%.2f\n", taxesPaid());
	}
}
