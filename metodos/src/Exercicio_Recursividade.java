import java.util.Scanner;

public class Exercicio_Recursividade {

	// Crie um programa que receba um número qualquer do usuário e imprima a tabuada
	// desse número, do 0 até o 10.

	// Para fazer esse trabalho você deve usar a técnica da recursividade.
	// Crie um método com o nome de "imprimirTabuada" que receba dois parâmetros - o
	// multiplicando e o multiplicador. O multiplicando será o número que o usuário
	// digitou e o multiplicador será o número que irá ser incrementado a cada
	// operação de multiplicação. Dentro do método "imprimirTabuada" você deve
	// multiplicar um parâmetro pelo outro, mostrar para o usuário a multiplicação
	// feita juntamente com o resultado, e, no final, incrementar o multiplicador e
	// fazer uma nova chamada ao método "imprimirTabuada" com o multiplicador já
	// incrementado.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número: ");
		Integer numero = sc.nextInt();

		System.out.println("-----------------");

		imprimirTabuada(numero, 0);

		sc.close();

	}

	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + "x" + multiplicador + "=" + (multiplicando * multiplicador));

		if (++multiplicador <= 10) {

			imprimirTabuada(multiplicando, multiplicador);

		}
	}
}
