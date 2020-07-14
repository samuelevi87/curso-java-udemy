package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class testeLista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random rand = new Random();

		char resp = 's';

		List<String> list = new ArrayList<>();

		while (resp != 'n') {
			System.out.print("Digite o nome a ser inserido: ");
			list.add(sc.nextLine());
			System.out.println("Lista atualizada: " + list.size() + " registros\n");
			System.out.print("Deseja inserir um novo nome? (s/n): ");
			resp = sc.next().charAt(0);
			sc.nextLine();

		}
		System.out.println(" *-*-*-*-*-*-*-*-* ");
		System.out.print("Sua lista est� fechada!\nVoc� adicionou: " + list.size()
				+ " pessoas.\nDeseja adicionar mais algu�m? (s/n): ");
		resp = sc.next().charAt(0);
		sc.nextLine();
		if (resp == 's') {
			while (resp != 'n') {
				System.out.print("Digite o nome a ser inserido: ");
				list.add(rand.nextInt(list.size()), sc.nextLine());
				System.out.println("Lista atualizada: " + list.size() + " registros\n");
				System.out.print("Deseja inserir um novo nome? (s/n): ");
				resp = sc.next().charAt(0);
				sc.nextLine();
			}
		}
		System.out.println("Lista final com: " + list.size() + " registros!");
		for (String x : list) {
			System.out.println("[" + list.indexOf(x) +"] " +  x);
		}
		System.out.println(" *-*-*-*-*-*-*-*-* ");
		System.out.print("Deseja remover algum registro? (s/n): ");
		resp = sc.next().charAt(0);
		sc.nextLine();
		if (resp == 's') {
			System.out.println("Voc� escolheu remover!\n" + "Digite 1 - Para remover pelo N� do registro.\n"
					+ "Digite 2 - Para remover basedo na 1� letra do nome.");
			int aux = sc.nextInt();
			switch (aux) {
			case 1:
				System.out.println("Lista atual");
				for (String x : list) {
					System.out.println("[" + list.indexOf(x) +"] " +  x);
				}
				System.out.print("Excluir qual registro: (0/" + (list.size()-1) + "): ");
				int excluir = sc.nextInt();
				list.remove(excluir);

				System.out.println("Lista atualizada!");
				for (String x : list) {
					System.out.println("[" + list.indexOf(x) +"] " +  x);
				}
				break;

			case 2:
				System.out.println("Lista atual");
				for (String x : list) {
					System.out.println(list.indexOf(x) + " " + x);
				}
				System.out.print("Deseja excluir os registros que come�am com qual letra? (A/Z): ");
				char letra = sc.next().charAt(0);
				sc.nextLine();
				System.out.println("Voc� escolheu a letra: " + letra);
				System.out.println("Este(s) � (s�o) o(s) registro(s) escolhido(s):");
				List<String> result = list.stream().filter(x -> x.charAt(0) == letra).collect(Collectors.toList());
				for (String x : result) {
					System.out.println(list.indexOf(x) + " " + x);
				}
				System.out.print("Confirma a exclus�o? (s/n): ");
				resp = sc.next().charAt(0);
				if (resp == 's') {
					list.removeIf(x -> x.charAt(0) == letra);
					System.out.println("Registros exclu�dos com sucesso!");
					System.out.println("Lista atualizada:");
					for (String x : list) {
						System.out.println(list.indexOf(x) + " " + x);
					}
				} else {
					System.out.print("OK, nada foi alterado!");
				}
				break;
			}
		}

//		
//		System.out.println(" *-*-*-*-*-*-*-*-* ");//Removendo itens da lista de acordo com um predicado.
//		
////		list.remove(1); //Removendo por posi��o na lista.
//		list.removeIf(x -> x.charAt(0) == 'J');
//		
//		for (String x: list) {
//			System.out.println(x);
//		}
//		System.out.println(" *-*-*-*-*-*-*-*-* ");//Exibindo a posi��o do item na lista.
//		System.out.println("�ndice de Abra�o: " + list.indexOf("Abra�o"));
//		System.out.println("�ndice de Jos�: " + list.indexOf("Jos�"));
//		
//		System.out.println("\n *-*-*-*-*-*-*-*-* "); //Filtrando a list para exibir de acordo com o predicado.
//		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
//		
//		for (String x: result) {
//			System.out.println(x);
//		}
//		
//		System.out.println("\n *-*-*-*-*-*-*-*-* ");
//		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
//		
//		
//	}
//

			sc.close();
		}

}
