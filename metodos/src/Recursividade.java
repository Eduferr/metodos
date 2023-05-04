
public class Recursividade {
	// Recursividade é o método chamando o próprio método
	public static void main(String[] args) {
		// imprimirNumero(0);

		String[] animais = new String[] { "Rato", "Gato", "Cachorro" };
		System.out.println("----USANDO FOR----");
		iterarNomes(animais);
		System.out.println("----RECURSIVO----");
		iterarNomesREcursivo(animais, 0);

	}

	static void imprimirNumero(Integer numero) {
		System.out.println("Número: " + numero);

		if (numero < 10) {
			imprimirNumero(++numero); // Chamando o próprio método
		}

	}

	// metodo for
	static void iterarNomes(String[] animais) {
		for (int i = 0; i < animais.length; i++) {
			System.out.println("Este animal é: " + animais[i]);
		}
	}

	// metodo for pela recursividade
	static void iterarNomesREcursivo(String[] animais, Integer i) {
		System.out.println("Este animal é: " + animais[i]);
		if (++i < animais.length) {
			iterarNomesREcursivo(animais, i);
		}
	}

}
