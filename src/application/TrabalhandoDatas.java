package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TrabalhandoDatas {

	public static void main(String[] args)  throws ParseException {

			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
			
			Date x1 = new Date();
			Date x2 = new Date(System.currentTimeMillis());
			Date x3 = new Date (0L);
			Date x4 = new Date(1000L * 60L * 60L * 5L);
			
			Date y1 = sdf1.parse("13/07/2020");
			Date y2 = sdf2.parse("13/07/2020 16:48:22");
			Date y3 = Date.from(Instant.parse("2020-07-13T18:43:35Z"));
			
			System.out.println("X1: " + sdf2.format(x1));
			System.out.println("X2: " + sdf2.format(x2)); 
			System.out.println("X3: " + sdf2.format(x3)); 
			System.out.println("X4: " + sdf2.format(x4)); 
			System.out.println("Y1: " + sdf2.format(y1));
			System.out.println("Y2: " + sdf2.format(y2)); 
			System.out.println("Y3: " + sdf2.format(y3)); 
			System.out.println("-----------------------");
			System.out.println("X1: " + sdf3.format(x1));
			System.out.println("X2: " + sdf3.format(x2)); 
			System.out.println("X3: " + sdf3.format(x3)); 
			System.out.println("X4: " + sdf3.format(x4)); 
			System.out.println("Y1: " + sdf3.format(y1));
			System.out.println("Y2: " + sdf3.format(y2)); 
			System.out.println("Y3: " + sdf3.format(y3)); 
			System.out.println("--------------------------------");
			System.out.println("X1: " + (x1));
			System.out.println("X2: " + (x2)); 
			System.out.println("X3: " + (x3)); 
			System.out.println("X4: " + (x4)); 
			System.out.println("Y1: " + (y1));
			System.out.println("Y2: " + (y2)); 
			System.out.println("Y3: " + (y3)); 
			
			
			
			
	}

}