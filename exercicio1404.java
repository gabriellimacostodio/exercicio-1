import java.util.Scanner;

public class exercicio1404 {

	public static void main(String[] args) {
		
		int num1, num2;
		int soma, subtracao, multiplicacao, divisao, modulo;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero");
		num1= leitor.nextInt();
		System.out.println("digite o segundo numero");
		num2 = leitor.nextInt();
		
		//oper��es
		soma = num1 +num2;
		subtracao = num1 -num2;
		multiplicacao = num1 * num2;
		divisao = num1 /num2;
		modulo = num1 % num2;
		
		
		System.out.println("soma: "+soma);
		System.out.println("subtra��o: "+subtracao);
		System.out.println("multiplica��o: "+multiplicacao);
		System.out.println("divis�o: "+divisao);
		System.out.println("modulo: "+modulo);
		

	}

}
