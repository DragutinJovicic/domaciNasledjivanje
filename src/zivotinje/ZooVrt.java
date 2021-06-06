package zivotinje;

import java.util.ArrayList;
import java.util.List;

public class ZooVrt {

	public static void main(String[] args) {

		Zivotinje z1 = new Zivotinje("Kicmenjak", "Ovca", "detelina");
		
		System.out.println(z1.toString());
		
		Ribe r1 = new Ribe("Kicmenjak", "ajkula", "brancin", "slana", "ostra");
		
		System.out.println(r1.toString());
		
		Sisari s1 = new Sisari("Kicmenjak", "lav", "meso", "zlatna", 4);
		System.out.println(s1.toString());
		
		List<Zivotinje> lista = new ArrayList<Zivotinje>();
		
		lista.add(z1);
		lista.add(r1);
		lista.add(s1);
		
		
		
		Staniste st1 = new Staniste(lista, "zoo vrt");
		
		System.out.println(st1.toString());
		
		s1.setBojaDlake("bela");
		System.out.println(st1.toString());
		
		s1.dodajNogu(3);
		
		System.out.println(s1.toString());
	}

}
