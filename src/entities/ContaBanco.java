package entities;

public class ContaBanco {
	
	private int numero;
	private String titular;
	private double saldo;



	public ContaBanco(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

	public ContaBanco(int numero, String titular, double depositoInicial) {
		super();
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito (double quantia) {
		saldo += quantia;
	}
	public void saque (double quantia) {
		saldo -= quantia + 5.0;
	}
	
	@Override
	public String toString() {
		return "\nConta Nº: " + numero + ", Titular: " + titular + ", Saldo: R$ " + String.format("%.2f",saldo);

	}
	
	
 }

