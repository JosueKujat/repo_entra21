package br.com.questao;

import br.com.util.Teclado;

public class Questao07 {

	public static void main(String[] args) {

//7) Fazer um algoritmo que pergunte 3 n�meros e apresente a m�dia aritm�tica entre estes 3 n�meros.

		double n1, n2, n3;
		double soma;

		n1 = Teclado.lerDouble("Digite o primeiro numero");
		n2 = Teclado.lerDouble("Digite o segundo numero");
		n3 = Teclado.lerDouble("Digite o terceiro numero");
		soma = (n1 + n2 + n3) / 3;
		System.out.println("O resultado � " + soma);

	}

}
