package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListasInterface {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		

		list.add("D�dimo");
		list.add("Amom");
		list.add("Abra�o");
		list.add("Jud�");
		list.add("Jos�");
		list.add("Ezequias");
		
		list.add(2, "Matias");
		
		System.out.println("Tamanho da lista: " + list.size());
		
	
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println(" *-*-*-*-*-*-*-*-* ");//Removendo itens da lista de acordo com um predicado.
		
//		list.remove(1); //Removendo por posi��o na lista.
		list.removeIf(x -> x.charAt(0) == 'J');
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println(" *-*-*-*-*-*-*-*-* ");//Exibindo a posi��o do item na lista.
		System.out.println("�ndice de Abra�o: " + list.indexOf("Abra�o"));
		System.out.println("�ndice de Jos�: " + list.indexOf("Jos�"));
		
		System.out.println("\n *-*-*-*-*-*-*-*-* "); //Filtrando a list para exibir de acordo com o predicado.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x: result) {
			System.out.println(x);
		}
		
//		System.out.println("\n *-*-*-*-*-*-*-*-* ");
//		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
//		for (String x: name) {
//			System.out.println(x);
//		}
		
	}

}
