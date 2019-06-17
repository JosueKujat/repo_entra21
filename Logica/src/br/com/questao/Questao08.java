package br.com.questao;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		 /*
		 * 8) Fazer um programa que calcule e apresente a quantidade de litros que um
		 * automóvel gastará em uma viagem. O programa deve coletar as seguintes
		 * informações: Distância a percorrer na viagem, em quilômetros; qual é o valor
		 * do consumo médio do automóvel, em quilômetros por litro.
		 */

		double km;
		double consumo;
		double calc;

		km = Teclado.lerDouble("Digite a km a ser rodada");
		consumo = Teclado.lerDouble("Quanto faz por litro");
		calc = km / consumo;
		System.out.println("O consumo medio é de " + calc + " por km");

	}

}
