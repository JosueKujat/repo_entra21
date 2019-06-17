package br.com.questao;

import br.com.util.Teclado;

public class Questao20 {

	public static void main(String[] args) {
		/*
		 * 10) Escreva um algoritmo pergunte o número total de eleitores de um
		 * município, o número de votos brancos, nulos e válidos e apresente como
		 * resposta o percentual que cada um representa em relação ao total de
		 * eleitores.
		 */

		double eleitores, valido, branco, nulo;
		double percV, percB, percN;

		eleitores = Teclado.lerDouble("Quantos eleitores tem o municipio? ");
		valido = Teclado.lerDouble("Quantos votos validos: ");
		branco = Teclado.lerDouble("Quantos votos brancos: ");
		nulo = Teclado.lerDouble("Quantos votos nulos: ");

		percV = (valido * 100) / eleitores;
		percB = (branco * 100) / eleitores;
		percN = (nulo * 100) / eleitores;
		
		System.out.println("A quantidade de votos validos é: " + percV);
		System.out.println("A quantidade de votos brancos é: " + percB);
		System.out.println("A quantidade de votos nulos é: " + percN);

	}
}
