package br.com.questao;

import br.com.util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
//5) Fazer um programa que pergunte o salário de um funcionário e 
//apresente este salário com um aumento de 15%.

		double salario;
		double aumento = 0.15;
		double calculo;

		salario = Teclado.lerDouble("Digite o salario:");
		calculo = salario + (salario * aumento);

		System.out.println("O salario com aumento é: " + calculo);

	}

}
