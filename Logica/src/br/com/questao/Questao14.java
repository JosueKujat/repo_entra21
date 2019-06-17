package br.com.questao;

import br.com.util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		/*
		 * 4) Desenvolver um programa que pergunte ao usuário o seu peso e sua altura.
		 * Ao final o programa deverá exibir na tela o valor do índice de massa corporal
		 * desta pessoa (IMC). Fórmula: IMC = peso / altura2 - Obs: peso em quilos e
		 * altura em metros.
		 */
		
		
		double peso, altura, calc;

		peso = Teclado.lerDouble("Digite seu peso em KG: ");
		altura = Teclado.lerDouble("Digite sua altura em MT: ");
		calc = peso / ( Math.pow(altura, 2));
		System.out.println("Vc tem o imc de: " + calc);

	}

}
