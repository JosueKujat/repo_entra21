package br.com.questao;

import br.com.util.Teclado;

public class Questao16 {

	public static void main(String[] args) {
		/*
		 * 6) Fazer um algoritmo que pergunte o nome de um vendedor, o seu sal�rio fixo
		 * e o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este
		 * vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, exibir ao final o
		 * seu nome, o sal�rio fixo, a comiss�o e o sal�rio completo (fixo + comiss�o
		 * sobre vendas) no final do m�s
		 */

		String nome;
		double salario, comi = 0.15, venda;
		double calc;

		nome = Teclado.lerTexto("Qual o nome? ");
		salario = Teclado.lerDouble("Qual o salario fixo? ");
		venda = Teclado.lerDouble("vendas feitas no mes (em R$)");
		calc = venda * comi;
		System.out.println(" O NOME �: " + nome + " Salario fixo de: " + salario + " Comissao de: " + calc);

	}

}
