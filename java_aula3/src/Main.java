import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Entrada de dados 
		// Scanner aguarda escrever // Input (python)
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		
		Scanner sc = new Scanner(System.in);
		//double se encaixa no nextInt // nextDouble // necessario , ao inves de ponto --se estiver na lingua inglesa devera ser .
		int x;
		x = sc.nextInt();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		
		//ler caracter
		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		
		sc.close();

		//varios dados mesma linda
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	
		sc.close();
	}

}
