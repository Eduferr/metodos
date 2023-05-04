
public class RetornandoValores {

	public static void main(String[] args) {

//		Integer numeroQualquer = numeroAleatorio(); // invocando o método criado
//		System.out.println("O numero é: " + numeroQualquer);
		
		// 50   -   100%
		//  X   -   20%
		// (50 * 20) / 100
		
		Double[] premissaInicial = new Double[] {50.0, 100.0};
		Double proporcao = 20.0;
		
		Double resultadoFinal = regraDetres(premissaInicial, proporcao);
		System.out.println(resultadoFinal);

	}

//	static void numeroAleatorio() { //void retorna vazio
//		System.out.println("");
//	}

	static Integer numeroAleatorio() {
		Integer numero = 1;
		return numero;
	}

	static Double regraDetres(Double[] premissa, Double proporcao) {
		Double resultado = (premissa[0] * proporcao) / premissa[1];

		return resultado;
	}

}
