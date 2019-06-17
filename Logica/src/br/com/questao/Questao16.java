package br.com.questao;

import br.com.util.Teclado;

public class Questao16 {

	public static void main(String[] args) {
		/*
		 * 6) Fazer um algoritmo que pergunte o nome de um vendedor, o seu salário fixo
		 * e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
		 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, exibir ao final o
		 * seu nome, o salário fixo, a comissão e o salário completo (fixo + comissão
		 * sobre vendas) no final do mês
		 */

		String nome;
		double salario, comi = 0.15, venda;
		double calc;

		nome = Teclado.lerTexto("Qual o nome? ");
		salario = Teclado.lerDouble("Qual o salario fixo? ");
		venda = Teclado.lerDouble("vendas feitas no mes (em R$)");
		calc = venda * comi;
		System.out.println(" O NOME É: " + nome + " Salario fixo de: " + salario + " Comissao de: " + calc);

	}

}
