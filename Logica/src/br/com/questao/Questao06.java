package br.com.questao;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		/*6) Fazer um programa que pergunte uma temperatura ao usu�rio, em graus Fahrenheit, e 
		 * apresente esta
		temperatura convertida em graus Celsius. A f�rmula da convers�o 
		� c = (f � 32) x 5 : 9 , onde c � a temperatura
		em graus Celsius e f em Fahrenheit.*/
		
		
		double celc;
		double fahre;
		
		
		
		
		fahre = Teclado.lerDouble("Digite temperatura em fahrenheit: ");
		celc = (fahre - 32) * 5 / 9 ;
		
		System.out.println("O resultado da convers�o �: " + celc);
		
		

	}

}
