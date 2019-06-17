package br.com.questao;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
/*
9) Fazer um algoritmo que pergunte 1 número e apresente:
a) O próprio número
b) O quadrado deste número
c) A raiz quadrada deste número math.pow(numero,2)*/
		
		double num;
		
		num = Teclado.lerDouble("Digite um numero");
		System.out.println(num);
		System.out.println("o quadrado é: " + Math.pow(num, 2));
		System.out.println("Raiz quadrada é: " + Math.sqrt (num));
		
		

	}

}
