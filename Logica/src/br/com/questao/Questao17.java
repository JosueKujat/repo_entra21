package br.com.questao;

import br.com.util.Teclado;

public class Questao17 {

	public static void main(String[] args) {
		/*
		 * 7) A Loja Mam�o com A��car est� vendendo seus produtos em at� 10 presta��es
		 * sem juros. Fa�a um algoritmo que pergunte um valor de uma compra, o n�mero de
		 * presta��es escolhidas e apresente como resultado o valor das presta��es.
		 */

		double valor, prest, calc;
		
		valor = Teclado.lerDouble("Digite o valor da compra: " );
		prest = Teclado.lerDouble("Quantas parcelas vc deseja? (maximo 10)");
		calc = valor / prest;
		System.out.println("Voce pagara " + calc + " por mes");
		
		
		
		
	}

}
