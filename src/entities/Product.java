package entities;

public class Product {
	
	private String name;
	private double price;
	private int qtd;
	

	/**
	 * @param name
	 * @param price
	 * @param qtd
	 */
	
	public Product() {
	}
	
	public Product(String name, double price, int qtd) {
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

		
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the qtd
	 */
	public int getQtd() {
		return qtd;
	}

	public double totalValueInStock() {
		return price * qtd;
	}
	public void addProducts(int qtd) {
		this.qtd += qtd;
	}
	public void removeProducts(int qtd) {
		this.qtd -= qtd;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + qtd + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
}
