package br.com.questao;

import br.com.util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
/* 1) Desenvolver um programa que pergunte ao usu�rio o seu nome completo e seu sexo. 
      * Em seguida, o programa deve apresentar os dados anteriormente informados.*/
		
		String nome, sexo;
		
		nome = Teclado.lerTexto("Digite o Nome: ");
		sexo = Teclado.lerTexto("Digite o sexo: ");
		System.out.println("O nome informado �: " + nome + "e seu sexo �: " + sexo);

	}

}
