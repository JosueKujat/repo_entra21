	package br.com.questao;

import br.com.util.Teclado;

public class Questao18 {

	public static void main(String[] args) {
		/*
		 * 8) Fazer um algoritmo que receba o pre�o de custo de um produto e mostre como
		 * resposta o valor de venda. Sabese que o pre�o de custo receber� um acr�scimo
		 * de acordo com um percentual informado pelo usu�rio
		 */

		double custo, aumento, calc;

		custo = Teclado.lerDouble("Qual o valor de custo? ");
		aumento = Teclado.lerDouble("Qual o aumento? ");
		calc = custo + (custo * (aumento / 100));
		System.out.println("O pre�o final �: " + calc);

	}

}
