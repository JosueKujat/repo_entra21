package orientacaoAobjetos;

public class Funcionario {

	public double salario;
	public String nome;

	public String listardados() {
		String dados = "Nome : " + this.nome + "\nSalario: " + this.salario;
		return dados;
	}

	public void aumento() {
		this.salario *= 0.45;
	}

}
