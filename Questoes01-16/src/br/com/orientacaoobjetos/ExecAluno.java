package br.com.orientacaoobjetos;

public class ExecAluno {

	public static void main(String[] args) {
		Aluno alunol = new Aluno();
		alunol.nome = "Josué Kujat";
		alunol.dtNasc = "16/10/1997";
		alunol.nRG = 1058749;

		System.out.println("Nome: " + alunol.nome);
		System.out.println("Data Nascimento: " + alunol.dtNasc);
		System.out.println("RG: " + alunol.nRG);
		System.out.println("-------------------------");

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Amós P. Lulu";
		aluno2.dtNasc = "23/04/1984";
		aluno2.nRG = 9747521;

		System.out.println("Nome: " + aluno2.nome);
		System.out.println("Data Nascimento: " + aluno2.dtNasc);
		System.out.println("RG: " + aluno2.nRG);
		System.out.println("-------------------------");

	}

}
