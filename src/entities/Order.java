package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product product;
	/**
	 * @param date
	 * @param product
	 */
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;

	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
