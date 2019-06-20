package br.com.orientacaoobjetos;

public class ExecBanco {

	public static void main(String[] args) {

		Cliente cli1 = new Cliente();
		cli1.cdCli = 7;
		cli1.nomeCli = "Josue";
		System.out.println("ID: " + cli1.cdCli);
		System.out.println("Nome: " + cli1.nomeCli);

		Banco banc1 = new Banco();
		banc1.id = 4874;
		System.out.println("NumerodaAgencia: " + banc1.id);

		ContaBancaria cont1 = new ContaBancaria();
		cont1.numConta = 424888;
		cont1.saldo = 106;
		System.out.println("Numero da conta: " + cont1.numConta);
		System.out.println("Limite: " + cont1.limite);
		System.out.println("Saldo: " + cont1.saldo);

		CartaodeCredito cred1 = new CartaodeCredito();
		cred1.num = 96857;
		cred1.validadecc = 14092023;
		System.out.println("Número do cartao: " + cred1.num);
		System.out.println("Validade: " + cred1.validadecc);
		System.out.println("-----------------------");

		Cliente cli2 = new Cliente();
		cli2.cdCli = 1;
		cli2.nomeCli = "Gerhard";
		System.out.println("ID: " + cli2.cdCli);
		System.out.println("Nome: " + cli2.nomeCli);

		Banco banc2 = new Banco();
		banc2.id = 1544;
		System.out.println("Numero da agencia: " + banc2.id);
		
		ContaBancaria cont2 = new ContaBancaria();
		cont2.numConta = 31267;
		cont2.saldo = 785;
		System.out.println("Numero: " + cont2.numConta);
		System.out.println("Limite: " + cont2.limite);
		System.out.println("Saldo: " + cont2.saldo);

		CartaodeCredito cred2 = new CartaodeCredito();
		cred2.num = 1475;
		cred2.validadecc = 250720202;
		System.out.println("Numero do cartao: " + cred2.num);
		System.out.println("Validade: " + cred2.validadecc);
		System.out.println("-----------------------");

	}

}
