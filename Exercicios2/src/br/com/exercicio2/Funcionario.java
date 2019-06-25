package br.com.exercicio2;

public class Funcionario {

	 double salario = 1000;
	 String nome;

	public String listardados() {
		String dados = "Nome : " + this.nome + "\nSalario: " + this.salario;
		return dados;
	}

	public void aumento() {
		this.salario *= 0.45;
	}

}
