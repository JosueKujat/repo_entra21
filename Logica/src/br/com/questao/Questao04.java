package br.com.questao;

import br.com.util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
//4) Fazer um programa que pergunte um n�mero inteiro e apresente o seu antecessor e seu sucessor.

		int numero;
		int sucessor;
		int antecessor;

		numero = Teclado.lerInt("Digite um numero");
		sucessor = numero + 1;
		System.out.println("O numero atnecessor �: " + sucessor);
		antecessor = numero - 1;
		System.out.println("O numero sucessor �: " + antecessor);

	}

}
