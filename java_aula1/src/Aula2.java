//comando lingua do Eclipse: Locale.setDefault(Locale.US); -- inicio programa import java.util.Locale;  Ao invés de separar , separa por um .
public class Aula2 {

	public static void main(String[] args) {
		// ln ao final quebra linha - somente Print: permanece na mesma linha
		
		int y = 32;
		String nome = "Theo";
		int idade = 1;
		double renda = 1000.0;
		System.out.println(y);
		
		//ponto flutuante
		double x = 10.35784;
		System.out.println(x);
		
		//controlar casas decimais (f localiza a casa decimal determinada)
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
	
		//concatenar varios elementos
		System.out.println("RESULTADO = "+ x + " METROS");
		//concatenar mesma escrita
		System.out.printf("RESULTADO = %.2f metros %n", x);
		System.out.printf("RESULTADO = %.3f metros %n", x);
		
		//concatenar varios elementos + comando escrita
		System.out.printf("%s tem %d anos e ganha R$ %.2 reais%n", nome, idade, renda);
		
		
		System.out.println("Boa tarde!");

	}

}
