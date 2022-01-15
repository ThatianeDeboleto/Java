import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Estrutura repetitiva (for)
		//fazer um programa que lê um valor inteiro N e depois N numeros inteiros. Ao final mostrar a soma dos N numeros lidos
		
		Scanner sc = new Scanner(System.in); 

		int N = sc.nextInt();
		
		int soma = 0;
		//i=i+1 == i++
		//contagem for(int i=0; i<5;i++;)
		//contagem regressiva for(int i=4; i>=0; i--)
		for (int i=0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		sc.close();
	}
}