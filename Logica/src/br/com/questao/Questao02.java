package br.com.questao;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
/*2) Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:
a) Resultado de suas adições
b) Resultado de suas multiplicações*/
		
		int n1, n2, n3, n4;
		int soma;
		int multiplicacao;
		
		n1 = Teclado.lerInt("Digite o primeiro numero: ");
		n2 = Teclado.lerInt("Digite o segundo numero: ");
		n3 = Teclado.lerInt("Digite o terceiro numero: ");
		n4 = Teclado.lerInt("Digite o quarto numero: ");
		
		soma = n1 + n2 + n3 + n4;
		multiplicacao = n1 * n2 * n3 * n4;
		
		System.out.println("A - " + "O resultado da adição é: " + soma);
		System.out.println("B - " + "O resultado da multiplicação é: " + multiplicacao);
		
		
		
		

	}

}
