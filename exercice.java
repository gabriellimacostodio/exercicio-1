package exercicios;

import java.util.Scanner;

public class exercice {

	public static void main(String[] args) {
	 
		String nome;
		int idade;
		String cidade; 
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite seu nome");
		nome = leitor.next();
		System.out.println("digite sua idade");
		idade = leitor.nextInt();
		System.out.println("digite sua cidade");
		cidade = leitor.next();
		
		
		
		
		
		System.out.println("Boas vindas, "+nome);
		System.out.println("minha idede e, "+idade  );
		System.out.println("moro em, " +cidade);

	}

}
