package application;

import java.util.Date;

import entities.OrderN;
import entities.enums.OrderStatus;

public class ProgramEnum {

	public static void main(String[] args) {
		
		OrderN order = new OrderN(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}

}
