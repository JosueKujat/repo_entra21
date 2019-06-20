package orientacaoAobjetos;

public class Gerente {
	
	
	public double salario;
	public String nome;

	
	public void aumento(double taxa) {
		this.salario *=  ( 1 + (taxa /100));
	}
	
	
	public void beneficio() {
		this.salario *= 1.1;
	}
	
	
	
	
}
