package br.com.questao;

import br.com.util.Teclado;

public class Questao10 {
	 /*
	 * 10) Fazer um algoritmo que efetue o c�lculo do valor de uma presta��o em
	 * atraso, utilizando a f�rmula presta��o = valor + (valor x (taxa : 100) x
	 * tempo em dias).
	 */

	public static void main(String[] args) {
		double valor;
		int atraso;
		double taxa;
		double calc;

		valor = Teclado.lerDouble("Digite o valor em atraso");
		atraso = Teclado.lerInt("Quantos dias em atraso? ");
		taxa = Teclado.lerDouble("Qual a taxa por atraso ?");
		calc = valor + (valor * (taxa / 100) * atraso);
		System.out.println("Sera acrescentado em sua fatura: R$ " + calc);

	}

}
