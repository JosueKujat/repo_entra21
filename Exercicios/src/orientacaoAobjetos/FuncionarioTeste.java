package orientacaoAobjetos;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario newfunc1 = new Funcionario();
		Funcionario newfunc2 = new Funcionario();

		newfunc1.nome = "Waldiscleiton";
		newfunc1.salario = 1987.78;
		System.out.println("Nome do funcionario é: " + newfunc1.nome);
		System.out.println("Salario do funcionario é: " + newfunc1.salario);

		
		System.out.println("-----");

		newfunc2.nome = "Wiliardmestneger";
		newfunc2.salario = 2147.91;
		System.out.println("Nome do funcionario é: " + newfunc2.nome);
		System.out.println("Salario do funcionario é: " + newfunc2.salario);

		System.out.println("-------------------");
		System.out.println(newfunc2.listardados());
		newfunc2.aumento();
		System.out.println(newfunc2.listardados());

	}
}
