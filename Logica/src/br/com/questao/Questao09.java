package br.com.questao;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
/*
9) Fazer um algoritmo que pergunte 1 n�mero e apresente:
a) O pr�prio n�mero
b) O quadrado deste n�mero
c) A raiz quadrada deste n�mero math.pow(numero,2)*/
		
		double num;
		
		num = Teclado.lerDouble("Digite um numero");
		System.out.println(num);
		System.out.println("o quadrado �: " + Math.pow(num, 2));
		System.out.println("Raiz quadrada �: " + Math.sqrt (num));
		
		

	}

}
