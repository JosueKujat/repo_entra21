package orientacao_a_objetos;

public class BancoTeste {

	public static void main(String[] args) {

		Cliente newCli1 = new Cliente();
		Cliente newCli2 = new Cliente();
		CartaoDeCredito newCC1 = new CartaoDeCredito();
		CartaoDeCredito newCC2 = new CartaoDeCredito();
		Agencia newAG1 = new Agencia(1544);
		Agencia newAG2 = new Agencia(1544);
		Conta cont1 = new Conta();
		Conta cont2 = new Conta();
		
		

		newCli1.nome = "Gerhard"; 
		newCli1.cdCli = 745862;
		//newAG1.cdAg = 1544;
		cont1.numero = 90684;
		cont1.saldo = 758.47;
		cont1.limite = 516.65;
		newCC1.numero = 8658745;
		newCC1.data = "07/11/2022";

		System.out.println("Nome do primeiro cliente: " + newCli1.nome);
		System.out.println("O codigo do cliente: " + newCli1.cdCli);
		System.out.println("O numero da agencia é: " + newAG1.cdAg);
		System.out.println("O numero da conta é: " + cont1.numero);
		System.out.println("Saldo: " + cont1.saldo);
		System.out.println("Limite: " + cont1.limite);
		System.out.println("O numero do cartao é: " + newCC1.numero);
		System.out.println("A data de vencimento do cartao é: " + newCC1.data);

		System.out.println("------");

		newCli2.nome = "Nina";
		newCli2.cdCli = 886789;
		//newAG2.cdAg = 1511;
		cont2.numero = 9841;
		cont2.saldo = 9875;
		cont2.limite = 418.26;
		newCC2.numero = 198498;
		newCC2.data = "02/12/2032";

		System.out.println("Nome do segundo cliente: " + newCli2.nome);
		System.out.println("Codigo do cliente: " + newCli2.cdCli);
		System.out.println("O numero da agencia é: " + newAG2.cdAg);
		System.out.println("O numero da conta é: " + cont2.numero);
		System.out.println("Saldo: " + cont2.saldo);
		System.out.println("Limite: " + cont2.limite);
		System.out.println("O numero do cartao é: " + newCC2.numero);
		System.out.println("A data de vencimento do cartao é: " + newCC2.data);

		System.out.println("-----------------------------------------------------");

		Cliente clientcart = new Cliente();
		CartaoDeCredito cartclient = new CartaoDeCredito();
		Agencia novaag = new Agencia();
		Conta newAbert = new Conta();

		clientcart.nome = "Alcemir Inacio Beltrano";
		clientcart.cdCli = 34165;
		novaag.cdAg = 11;
		newAbert.numero = 4851;
		newAbert.saldo = 7408.14;
		newAbert.limite = 1400;
		cartclient.numero = 857115236;
		cartclient.data = "21/04/2031";
		cartclient.cliente = clientcart;
		newAbert.agencia = novaag;

		System.out.println("Nome do novo cliente é: " + cartclient.cliente.nome);
		System.out.println("Codigo: " + cartclient.cliente.cdCli);
		System.out.println("Numero da conta: " + newAbert.numero);
		System.out.println("Numedro a agencia: " + newAbert.agencia.cdAg);
		System.out.println("Numero do cartao: " + cartclient.numero);
		System.out.println("Vencimento " + cartclient.data);
		
		System.out.println("---Operação---");
		
		System.out.println(newAbert.saldo);
		
		newAbert.depositar(745.48);
		System.out.println(newAbert.saldo);
	
		newAbert.sacar(1874.15);
		System.out.println(newAbert.saldo);
		System.out.println(newAbert.Extrato("Verificar"));
		
		
		System.out.println("---------------------------------------------");

	
		
		
		
		
	}

}
