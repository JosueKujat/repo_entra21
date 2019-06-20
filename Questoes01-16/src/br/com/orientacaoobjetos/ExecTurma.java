package br.com.orientacaoobjetos;

public class ExecTurma {

	public static void main(String[] args) {
		
		Turma turma1 = new Turma();
		turma1.ensino = "Superior";
		turma1.turno = "Noturno";
		turma1.serie = 1;
		turma1.cdT = "1nc3";
		
		System.out.println("Codigo da Truma: " + turma1.cdT);
		System.out.println("Turno: " + turma1.turno);
		System.out.println("Ensino: " + turma1.ensino);
		System.out.println("---------------------------");
		
		Turma turma2 = new Turma();
		turma2.ensino = "Médio";
		turma2.turno = "Matutino";
		turma2.serie = 3;
		turma2.cdT = "3nc4";
		System.out.println("Codigo da Truma: " + turma2.cdT);
		System.out.println("Turno: " + turma2.turno);
		System.out.println("Ensino: " + turma2.ensino);
		System.out.println("---------------------------");
	}

}
