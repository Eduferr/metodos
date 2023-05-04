import java.util.Scanner;

public class primeiroMetodo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		imprimirTraco(); // metodo criado para otimizar a necessidade de alterações
		// Nome do curso
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO" };

		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "]" + cursos[i]);
		}
		System.out.print("O Curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = sc.nextInt();

		// verifica se aposição do array é válida
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}

		imprimirTraco();
		// Forma de pagamento
		String[] formasPagamento = new String[] { "cartão", "Boleto", "A vista" };
		System.out.println("Escolha a forma de pagamento: ");
		for (int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "]" + formasPagamento[i]);
		}

		System.out.print("Informe a forma de pagamento: ");
		Integer posicaoFormaPagamentoEscolhida = sc.nextInt();

		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}

		String cursoescolhido = cursos[posicaoCursoEscolhido];
		String formaPagmentoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		System.out.println(
				"O curso escolhido foi " + cursoescolhido + " e a forma de pagamento é " + formaPagmentoEscolhido);

		sc.close();

	}

	static void imprimirTraco() {
		System.out.println("---------------------------------");
	}

	static void encerrarProgramaPorCausaDePosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}

}
