
public class RecebendoParametros {

	public static void main(String[] args) {
		imprimirTraco();
		imprimir("-----------------");
		
		String nome = "Eduardo Ferreira";
		imprimir(nome);

	}
	
	static void imprimirTraco() {
		System.out.println("-----------------");
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}

}

