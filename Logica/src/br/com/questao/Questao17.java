package br.com.questao;

import br.com.util.Teclado;

public class Questao17 {

	public static void main(String[] args) {
		/*
		 * 7) A Loja Mamão com Açúcar está vendendo seus produtos em até 10 prestações
		 * sem juros. Faça um algoritmo que pergunte um valor de uma compra, o número de
		 * prestações escolhidas e apresente como resultado o valor das prestações.
		 */

		double valor, prest, calc;
		
		valor = Teclado.lerDouble("Digite o valor da compra: " );
		prest = Teclado.lerDouble("Quantas parcelas vc deseja? (maximo 10)");
		calc = valor / prest;
		System.out.println("Voce pagara " + calc + " por mes");
		
		
		
		
	}

}
