package br.com.questao;

import br.com.util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
// 3) Fazer um programa que pergunte um valor em Dólares e apresente o equivalente em Reais. 
 //Considere U$1,00 = R$3,80.

		
		double dolar = 3.80;
		
		double conversao;
		
		dolar = Teclado.lerDouble("Digite a quantidade de dolar: ");
		conversao = dolar * 3.80;
		System.out.println("Voce terá R$ " + conversao + " reais");
			
	}

}
