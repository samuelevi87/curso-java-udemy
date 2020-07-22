package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderN {
	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public OrderN() {
	}

	public OrderN(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		for (OrderItem  it :items) {
			sum += it.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order moment: ");
		builder.append(sdf.format(moment) + "\n");
		builder.append("Order status: ");
		builder.append(status + "\n");
		builder.append("Client: ");
		builder.append(client + "\n");
		builder.append("Order items:\n");
		for (OrderItem item : items) {
			builder.append(item + "\n");
		}
		builder.append("Total price: $");
		builder.append(String.format(".2f", total()));
		return builder.toString();
	}
	
	


}
