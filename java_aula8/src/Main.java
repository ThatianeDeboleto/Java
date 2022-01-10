import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Sintaxes opcionais
		
		// Uma operadora de telefonia cobra R$ 50,00 por um plano basico (100 min), cada min que exceder a franquia R$ 2,00.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		 
		System.out.printf("O valor da conta = R$ %.2f%n", conta);
		
		sc.close();

	}

}
