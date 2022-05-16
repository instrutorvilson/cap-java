package aula1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Aula {

	public static void main(String[] args) {
		//arrayList();
		//listaLinkada()
	}

	public static void listaLinkada() {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");

		// Use addFirst() to add the item to the beginning
		cars.addFirst("Mazda");
		System.out.println(cars);
	}
	
	public static void arrayList() {
		List<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	}
	
	public static void haskMapList() {
		 HashMap<String, String> capitais = new HashMap<String, String>();
		 capitais.put("sc", "Florianopolis");
		 capitais.put("pr", "Curitiba");
		 capitais.put("rs", "Porto Alegre");
		 
		 for (String key : capitais.keySet()) {
			  System.out.println("Chave: " + key + " Valor: " + capitais.get(key));
			}
	}
}
