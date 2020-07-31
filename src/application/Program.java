package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyTaxPayer;
import entities.IndividualTaxPayer;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.printf("Enter the number of tax payers: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.printf("Individual or company (i/c)? ");
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String taxPayer = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (op == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new IndividualTaxPayer(taxPayer, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int employeeNumber = sc.nextInt();
				list.add(new CompanyTaxPayer(taxPayer, anualIncome, employeeNumber));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double totalTaxes = 0.0;
		
		for(TaxPayer tp : list) {
			totalTaxes += tp.taxesPaid();
			System.out.print(tp);
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f\n", totalTaxes));
		
		sc.close();
	}

}
