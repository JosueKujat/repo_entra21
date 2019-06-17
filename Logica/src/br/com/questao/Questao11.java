package br.com.questao;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		 /*
		 * 1) Desenvolver um programa que pergunte o valor da conta a ser paga no
		 * restaurante e exiba como resposta o valor com o acréscimo dos 10% da gorjeta
		 * do garçom.
		 */
		
		double valor;
		double conta;
		
		
		valor = Teclado.lerDouble("Digite o total da conta:" );
		conta = valor +(valor * 0.10);
		System.out.println("O valor com a gorgeta é:" + conta);
		

	}

}
