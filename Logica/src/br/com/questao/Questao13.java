package br.com.questao;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		/*
		 * 3) Desenvolver um programa que pergunte ao usu�rio o seu peso (em quilos) e
		 * sua altura (em metros). Ao final o programa dever� exibir na tela para o
		 * usu�rio o valor do peso informado em gramas e a altura em cent�metros.
		 */
		
		double peso, altura;
		double calcP, calcA;
		
		peso = Teclado.lerDouble("Digite seu peso em KG: ");
		altura = Teclado.lerDouble("Digite a alturam em M.: ");
		calcP = peso * 1000;
		calcA = altura * 100;
		System.out.println("Voce tem " + calcP + " graams de peso e " + calcA + " Cm de altura" );
		
		

	}

}
