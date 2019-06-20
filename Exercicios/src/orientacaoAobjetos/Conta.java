package orientacaoAobjetos;

public class Conta {

	public int numero;
	public double saldo;
	public double limite = 100;
	public Agencia agencia;
	
	String extrato = "";
	
	
	public void depositar(double valor) {
		this.saldo += valor;
		Extrato("Deposito de: " + valor);
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
		Extrato("Saque de: " + valor);
	}
	
	public String saldo() {
		String saldo = "Seu saldo é: " + (this.saldo + this.limite);
		return saldo;
	}
	
	public String Extrato(String evento) {
		
		if (!evento.equalsIgnoreCase("Verificar")) 	
			extrato += evento + "\n";
			
		return extrato;			
	}
	
	
	
}
