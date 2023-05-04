import java.util.Scanner;

public class ExercicioCalculadora_RetornaValores {

	// Crie um programa que peça dois números do usuário e também qual a operação
	// ele deseja fazer - adição ou subtração. Para cada operação, você deve
	// construir um método que realize a mesma, ou seja, teremos um método para
	// adição, que vai receber dois números como parâmetros e retornar o resultado
	// da soma entre eles, e outro método para subtração.
	// Fique a vontade para implementar multiplicação e divisão também.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Selecionando o operador
		Integer operador = tipoOperador(sc);

		imprimirNoConsole("----------------------------");
		// Informe o primeiro número
		Double n1 = receberNumeroDoUsuario("Informe o primeiro número: ", sc);
		// Informe o segundo número
		Double n2 = receberNumeroDoUsuario("Informe o segundo número: ", sc);

		Double resultado = efetuarCalculo(operador, n1, n2);
		imprimirNoConsole("----------------------------");
		imprimirNoConsole("O resultado é: " + resultado);

		sc.close();
	}

	// Métodos

	static Integer tipoOperador(Scanner sc) {

		imprimirNoConsole("Escolha o numero da operação");
		imprimirNoConsole("----------------------------");
		String[] operadores = new String[] { "Adição", "Subtração", "Multimicação", "Divisão" };

		// For para gerar a lista de operadores
		for (int i = 0; i < operadores.length; i++) {
			imprimirNoConsole((i+1) + " - " + operadores[i]); //(i+1) para a posição não começar em zero
		}
		imprimirNoConsole("----------------------------");
		imprimirEContinuarNaMesmaLinha("Digite o operador:");
		return sc.nextInt();

	}

	static void imprimirNoConsole(String texto) {
		System.out.println(texto);
	}

	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static Double receberNumeroDoUsuario(String texto, Scanner sc) {
		imprimirEContinuarNaMesmaLinha(texto);
		Double posicao = sc.nextDouble();

		return posicao;

	}

	static Double adicao(Double n1, Double n2) {
		return n1 + n2;
	}

	static Double subtracao(Double n1, Double n2) {
		return n1 - n2;
	}

	static Double multiplicacao(Double n1, Double n2) {
		return n1 * n2;
	}

	static Double divisao(Double n1, Double n2) {
		return n1 / n2;
	}

	static Double efetuarCalculo(Integer operador, Double n1, Double n2) {
		Double resultado = null;

		switch (operador) {
		case 1:
			resultado = adicao(n1, n2);
			break;
		case 2:
			resultado = subtracao(n1, n2);
			break;
		case 3:
			resultado = multiplicacao(n1, n2);
			break;
		case 4:
			resultado = divisao(n1, n2);
			break;

		default:
			imprimirNoConsole("Escolha uma operação válida!");
			System.exit(0);
		}

		return resultado;

	}
}
