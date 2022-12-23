package seis;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String word;
		String inversa="";
		System.out.println("Dame la palabra a invertir: ");
		
		
		word=scanner.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			inversa=word.charAt(i)+inversa;
		}
		System.out.println(inversa);
	}
}
