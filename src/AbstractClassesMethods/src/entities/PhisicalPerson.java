package entities;

public class PhisicalPerson extends Contributor {
	private Double healthExpenses;

	public PhisicalPerson() {
	}

	public PhisicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double tax() {
		double tax = 0.0;
		if (annualIncome < 20000.00 && healthExpenses != 0.0) {
			tax = (annualIncome * 0.15) - (healthExpenses * 0.5);
		} else if (annualIncome >= 20000.00 && healthExpenses != 0.0) {
			tax = (annualIncome * 0.25) - (healthExpenses * 0.5);
		} else if (annualIncome < 20000.00) {
			tax = annualIncome * 0.15;
		} else {
			tax = annualIncome * 0.25;
		}
		return tax;
	}

}
