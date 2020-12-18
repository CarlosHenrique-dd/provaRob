package Questao_2;

import java.util.Scanner;

public class Startapp {
	static Scanner sc = new Scanner(System.in);
	static Aluno aluno = new Aluno();
	public static void main(String[]args) {
		lerAluno();
	}
	public static Aluno lerAluno() {
	
		System.out.println("matricula?");
		aluno.matricula = sc.nextInt();
		System.out.println("nota 1?");
		aluno.nota[0] = sc.nextInt();
		System.out.println("nota 2?");
		aluno.nota[1] = sc.nextInt();
		System.out.println("nota 3?");
		aluno.nota[2] = sc.nextInt();
		System.out.println("nota 4?");
		aluno.nota[3] = sc.nextInt();
		return aluno;
	}
}
