package br.com.questao;

import br.com.util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
//5) Fazer um programa que pergunte o sal�rio de um funcion�rio e 
//apresente este sal�rio com um aumento de 15%.

		double salario;
		double aumento = 0.15;
		double calculo;

		salario = Teclado.lerDouble("Digite o salario:");
		calculo = salario + (salario * aumento);

		System.out.println("O salario com aumento �: " + calculo);

	}

}
