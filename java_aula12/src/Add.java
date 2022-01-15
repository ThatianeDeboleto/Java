
public class Add {

	public static void main(String[] args) {
		// funcoes interessantes string
		//trim elimina espaço no fim

		String original = "um NOvo DIa INIcia   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 4);
		String s06 = original.replace("a", "i");
		int i = original.indexOf('u');
		int j = original.lastIndexOf('u');
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 4): -" + s05 + "-");
		System.out.println("replace('a', 'i'): -" + s06 + "-");
		System.out.println("Index Of 'u': -" + i );
		System.out.println("Last Index Of 'u': -" + j);
		
		
	}

}
