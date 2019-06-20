package orientacaoAobjetos;

public class AlunoTeste {

	public static void main(String[] args) {

		Aluno nAluno1 = new Aluno();
		Aluno nAluno2 = new Aluno();

		nAluno1.nome = "Josue";
		nAluno1.nRG = 67070598;
		nAluno1.datanasc = "16/10/1997";
		System.out.println("O nome do primeiro aluno é: " + nAluno1.nome);
		System.out.println("A data de nascimento do primeiro aluno é: " + nAluno1.datanasc);
		System.out.println("O rg do primeiro aluno é: " + nAluno1.nRG);

		System.out.println("-----------------------------------------------------");
		
		nAluno2.nome = "Neto - Pink";
		nAluno2.nRG = 74859675;
		nAluno2.datanasc = "17/07/1992";
		System.out.println("O nome do segundo aluno é: " + nAluno2.nome);
		System.out.println("A data de nascimento do segundo aluno é: " + nAluno2.datanasc);
		System.out.println("O rg do segundo aluno é: " + nAluno2.nRG);

		System.out.println("-----------------------------------------------------");
	
	}

}
