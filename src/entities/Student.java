package entities;

public class Student {
		public String name;
		public double nota1;
		public double nota2;
		public double nota3;
		public double notaCorte = 60.00;
		
		public double notaFinal () {
			return nota1 + nota2 + nota3;
		}
		public String resultado () {
			if (notaFinal() >= notaCorte) {
				return "FINAL GRADE = " + String.format("%.2f", notaFinal())+ "\nPASS";
			}
			else {
				return "FINAL GRADE = " + String.format("%.2f", notaFinal()) + "\nFAILED\nMISSING " + (String.format("%.2f", notaCorte - notaFinal())) + " POINTS";
			}
		}

		}
