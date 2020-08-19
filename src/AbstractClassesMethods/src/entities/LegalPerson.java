package entities;

public class LegalPerson extends Contributor {
	private Integer numberEmployee;

	public LegalPerson() {
	}

	public LegalPerson(String name, Double annualIncome, Integer numberEmployee) {
		super(name, annualIncome);
		this.numberEmployee = numberEmployee;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public Double tax() {
		double tax = 0.0;
		if (numberEmployee > 10) {
			tax = annualIncome * 0.14;
		} else {
			tax = annualIncome * 0.16;
		}
		return tax;
	}

}
