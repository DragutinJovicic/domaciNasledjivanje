package zivotinje;

import java.util.Scanner;

public class ArrayStringProbaj {

	public static void main(String[] args) {


		int duzina = 4;
		String[] recenica = new String[duzina];
		for(int i = 0; i < recenica.length; i++) {
			System.out.println("Unesite rec:");
			Scanner sc = new Scanner(System.in);
			recenica[i] = sc.next();
		}
		
		poredjaj(recenica);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < recenica.length; i++) {
		sb.append(recenica[i]);
		}
		System.out.println(sb.toString());

	}
	
	public static void poredjaj(String[] recenica) {
		String najmanji;
		String sledeci;
		for(int i = 0; i < recenica.length-1; i++) {
			najmanji = recenica[i];
			if(najmanji.length() < recenica[i].length()) {
			najmanji = recenica[0];
			}
		}
	}

}
