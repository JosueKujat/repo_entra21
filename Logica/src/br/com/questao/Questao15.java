package br.com.questao;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {
		/*
		 * 5) Fazer um algoritmo que pergunte dois n�meros e ao final apresente os
		 * seguintes valores: a soma dos dois n�meros, a subtra��o do primeiro pelo
		 * segundo n�mero, a subtra��o do segundo pelo primeiro n�mero, a multiplica��o
		 * entre os dois n�meros, a divis�o do primeiro pelo segundo n�mero, e tamb�m o
		 * resto da divis�o do primeiro pelo segundo n�mero.
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
	
	System.out.println("A some �: " + soma);
	System.out.println("A subtra��o de n1 e n2 �: " + subtAB);
	System.out.println("A subtra��o de n2 e n1 �: " + subtBA);
	System.out.println("A multipica��o �: " + multi);
	System.out.println("A divisao �: " + divisao);
	System.out.println("O resto da divisao �: " + resto);
	
	
	
	
	
	
	
	
	}
	

}
