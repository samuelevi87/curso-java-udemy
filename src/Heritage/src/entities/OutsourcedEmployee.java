package entities;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAditionalCharge() {
		return additionalCharge;
	}

	public void setAditionalCharge(Double aditionalCharge) {
		this.additionalCharge = aditionalCharge;
	}

	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
