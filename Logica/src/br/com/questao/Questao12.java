package br.com.questao;

import br.com.util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		/*
		 * (2) Desenvolver um programa que fa�a duas perguntas: o valor referente �s
		 * horas atuais e o valor referente aos minutos atuais. Exemplo, se agora s�o
		 * 09:35h o usu�rio dever� informar como resposta �s horas atuais o valor 09 e
		 * como resposta aos minutos atuais o valor 35. Em seguida o programa dever�
		 * apresentar como resposta quantos minutos j� se passaram desde �s 00:00h deste
		 * dia.
		 */

		int hora, mim;
		int escoH, escoM;
		
		escoH = Teclado.lerInt("Que hora �: ");
		escoM = Teclado.lerInt("Quais minutos? ");
		
		hora = escoH * 60;
		mim = hora + escoM;
		
		System.out.println("Se passaram " + mim + " minutos desde a 00h");
		
		
	
		
		
	}

}
