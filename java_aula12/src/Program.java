import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//pode por em binario caso queira 0b00100000;
		int mask = 32;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("Sexto bit é verdadeiro!");
		}
		
		else {
			System.out.println("Sexto bit é falso!");
		}
		
		sc.close();

	}

}
