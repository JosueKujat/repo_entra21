package orientacaoAobjetos;


public class GerenteTeste {

	public static void main(String[] args) {
		
		Gerente nGer = new Gerente();
		
		nGer.nome = "Jurandir";
		nGer.salario = 1297.48;
		System.out.println("Salario é: " + nGer.salario);
		
		nGer.beneficio();
		System.out.println("Salario aumentado para: " + nGer.salario);
		nGer.aumento(10);
		System.out.println("Salario aumentado para: " + nGer.salario);
		
	}

}
