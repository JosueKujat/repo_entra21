package orientacao_a_objetos;

public class TurmaTeste {

	public static void main(String[] args) {

		Turma T1 = new Turma();
		Turma T2 = new Turma();

		T1.serie = 1;
		T1.cdT = "nc3";
		T1.ensino = "Médio";
		T1.turno = "Vespertino";

		System.out.println("A serie da turma é: " + T1.serie + T1.cdT);
		System.out.println("O grau de instrução é: " + T1.ensino);
		System.out.println("Turno: " + T1.turno);
		
		
		System.out.println("------");

		T2.serie = 3;
		T2.cdT = "nc5";
		T2.ensino = "Fundamental";
		T2.turno = "Vespertino";

		System.out.println("A serie da turma é: " + T2.serie + T2.cdT);
		System.out.println("O grau de instrução é: " + T2.ensino);
		System.out.println("Turno: " + T2.turno);

	}

}
