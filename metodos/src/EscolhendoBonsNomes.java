import java.util.Scanner;

public class EscolhendoBonsNomes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		imprimirNoConsole("------------------------"); // metodo criado para otimizar a necessidade de alterações
		String cursoescolhido = receberCursoDoUsuario(sc);

		imprimirNoConsole("------------------------");
		String formaPagmentoEscolhido = receberFormaPagamentoDoUsuario(sc);

		imprimirNoConsole("------------------------");
		imprimirNoConsole("O curso escolhido foi " + '"' + cursoescolhido + '"' + " e a forma de pagamento é " + '"'
				+ formaPagmentoEscolhido + '"');

		sc.close();

	}

//Metodos e Parâmetros

	static String receberFormaPagamentoDoUsuario(Scanner sc) {
		String[] formasPagamento = new String[] { "cartão", "Boleto", "A vista" };
		imprimirNoConsole("Escolha a forma de pagamento: ");
		iterarEExibirPosicoesDoVetorString(formasPagamento); // For
		Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario(formasPagamento,
				"Informe a forma de pagamento: ", sc);

		return formasPagamento[posicaoFormaPagamentoEscolhida];
	}

	static String receberCursoDoUsuario(Scanner sc) {
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO" };
		iterarEExibirPosicoesDoVetorString(cursos);// For
		Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "O Curso que você deseja é o: ", sc);
		return cursos[posicaoCursoEscolhido];
	}

	static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner sc) {
		Integer posicaoEscolhida = receberNumeroInteiroDoUsuario(texto, sc);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhida, vetor);

		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}

		return posicaoEscolhida;
	}

	static void imprimirNoConsole(String texto) {
		System.out.println(texto);
	}

	static void encerrarProgramaPorCausaDePosicaoInvalida() {
		imprimirNoConsole("Posição inválida!"); // Um método invocado dentro de outro método.
		System.exit(1);
	}

	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			imprimirNoConsole(i + ". " + vetor[i]);
		}
	}

	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}

	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner sc) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer posicao = sc.nextInt();

		return posicao;

	}

}
