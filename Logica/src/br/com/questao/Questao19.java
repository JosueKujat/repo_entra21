package br.com.questao;

import br.com.util.Teclado;

public class Questao19 {

	public static void main(String[] args) {
		/*
		 * 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa apenas em dias. Obs: Considere os anos com 365 dias
		 * e os meses com 30 dias.
		 */

		int ano, mes, dia;
		double calc;
		
		ano = Teclado.lerInt("Digite o ano de nascomento: " );
		mes = Teclado.lerInt("Mes de nascimento: ");
		dia = Teclado.lerInt("Dia de nascimento: ");
		calc = (ano * 365) + (mes * 30) + dia;
		System.out.println("Vc tem " + calc + " dias de vida");
		
		
		
		
	}

}
