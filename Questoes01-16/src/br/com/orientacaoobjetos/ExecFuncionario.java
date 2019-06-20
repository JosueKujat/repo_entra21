package br.com.orientacaoobjetos;

public class ExecFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		func1.cdFunc = 1;
		func1.nome = "Anderson";
		func1.salario = 7854;
		System.out.println("Codigo: " + func1.cdFunc);
		System.out.println("Nome: " + func1.nome);
		System.out.println("Salario: " + func1.salario);
		System.out.println("-------------------------");
		
		Funcionario func2 = new Funcionario();
		func2.cdFunc = 2;
		func2.nome = "Rafael";
		func2.salario = 6943;
		System.out.println("Codigo: " + func2.cdFunc);
		System.out.println("Nome: " + func2.nome);
		System.out.println("Salario: " + func2.salario);
		System.out.println("-------------------------");
	}

}
