package br.com.questao;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		 /*
		 * 8) Fazer um programa que calcule e apresente a quantidade de litros que um
		 * autom�vel gastar� em uma viagem. O programa deve coletar as seguintes
		 * informa��es: Dist�ncia a percorrer na viagem, em quil�metros; qual � o valor
		 * do consumo m�dio do autom�vel, em quil�metros por litro.
		 */

		double km;
		double consumo;
		double calc;

		km = Teclado.lerDouble("Digite a km a ser rodada");
		consumo = Teclado.lerDouble("Quanto faz por litro");
		calc = km / consumo;
		System.out.println("O consumo medio � de " + calc + " por km");

	}

}
