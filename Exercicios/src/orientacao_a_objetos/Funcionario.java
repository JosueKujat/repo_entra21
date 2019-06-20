package orientacao_a_objetos;

public class Funcionario {

	 double salario;
	 String nome;

	public String listardados() {
		String dados = "Nome : " + this.nome + "\nSalario: " + this.salario;
		return dados;
	}

	public void aumento() {
		this.salario *= 0.45;
	}

}
