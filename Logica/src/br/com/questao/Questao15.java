package br.com.questao;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {
		/*
		 * 5) Fazer um algoritmo que pergunte dois números e ao final apresente os
		 * seguintes valores: a soma dos dois números, a subtração do primeiro pelo
		 * segundo número, a subtração do segundo pelo primeiro número, a multiplicação
		 * entre os dois números, a divisão do primeiro pelo segundo número, e também o
		 * resto da divisão do primeiro pelo segundo número.
		 */
	double n1,n2, soma,  divisao, multi, subtAB, subtBA, resto;
	
	n1 = Teclado.lerDouble("Digite um numero: ");
	n2 = Teclado.lerDouble("Digite outro numero: ");
	soma = n1 + n2;
	subtAB = n1 - n2;
	subtBA = n2 - n1;
	multi = n1 * n2;
	divisao = n1 / n2;
	resto = n1 % n2;
	
	System.out.println("A some é: " + soma);
	System.out.println("A subtração de n1 e n2 é: " + subtAB);
	System.out.println("A subtração de n2 e n1 é: " + subtBA);
	System.out.println("A multipicação é: " + multi);
	System.out.println("A divisao é: " + divisao);
	System.out.println("O resto da divisao é: " + resto);
	
	
	
	
	
	
	
	
	}
	

}
