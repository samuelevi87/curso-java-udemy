package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class UnidadesTempo {

	public static void main(String[] args) throws ParseException{
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//				sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
				
				Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
				Date x2 = new Date(System.currentTimeMillis());
				
				System.out.println(sdf.format(d));
				
				Calendar cal= Calendar.getInstance();
				cal.setTime(d);
				
//				cal.add(Calendar.HOUR_OF_DAY, 4); // Adicionando Horas
//				d = cal.getTime();								// Fazendo a variável 'd', pegar o valor das horas adicionadas.
				
				int hour = cal.get(Calendar.HOUR);
				int hourday = cal.get(Calendar.HOUR_OF_DAY);
				int minutes = cal.get(Calendar.MINUTE);
				int seconds = cal.get(Calendar.SECOND);
				int daymonth = cal.get(Calendar.DAY_OF_MONTH);
				int dayweek = cal.get(Calendar.DAY_OF_WEEK);
				int dayweekmonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH); //Quantas vezes esse dia da semana já ocorreu no mês. 3ª quinta-feita, 2º domingo...
				int dayyear = cal.get(Calendar.DAY_OF_YEAR);
				int month = 1 + cal.get(Calendar.MONTH);
				int year = cal.get(Calendar.YEAR);

				System.out.println("Hours: " + hour);
				System.out.println("Hours: " + hourday);
				System.out.println("Minutes: " + minutes);
				System.out.println("Seconds: " + seconds);
				System.out.println("Minutes: " + minutes);
				System.out.println("-----------------");
				System.out.println("Day of Week: " + dayweek);
				System.out.println("Day of Week in a Month: " + dayweekmonth);
				System.out.println("Day of Month: " + daymonth);
				System.out.println("Day of Year: " + dayyear);
				System.out.println("Month: " + month);
				System.out.println("Year: " + year);
				
				
				
				
				
				

	}

}
