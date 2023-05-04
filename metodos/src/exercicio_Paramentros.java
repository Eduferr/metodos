import java.util.Scanner;

public class exercicio_Paramentros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		imprimirConsole("------------------------"); // metodo criado para otimizar a necessidade de alterações
		// Nome do curso
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO" };

		iterarEExibirPosicoesDoVetorString(cursos);// For

		imprimirEContinuarNaMesmaLinha("O Curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = sc.nextInt();

		// verifica se aposição do array é válida
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}

		imprimirConsole("------------------------");
		String[] formasPagamento = new String[] { "cartão", "Boleto", "A vista" };
		imprimirConsole("Escolha a forma de pagamento: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento); // For

		imprimirEContinuarNaMesmaLinha("Informe a forma de pagamento: ");
		Integer posicaoFormaPagamentoEscolhida = sc.nextInt();

		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}

		String cursoescolhido = cursos[posicaoCursoEscolhido];
		String formaPagmentoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirConsole("------------------------");
		imprimirConsole("O curso escolhido foi " + '"' + cursoescolhido + '"' + " e a forma de pagamento é " + '"'
				+ formaPagmentoEscolhido + '"');

		sc.close();

	}

//Metodos e Parâmetros
	static void imprimirConsole(String texto) {
		System.out.println(texto);
	}

	static void encerrarProgramaPorCausaDePosicaoInvalida() {
		imprimirConsole("Posição inválida!"); // Um método invocado dentro de outro método.
		System.exit(1);
	}

	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			imprimirConsole(i + ". " + vetor[i]);
		}
	}

	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

}
