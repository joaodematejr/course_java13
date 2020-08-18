package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos ?");
		int quantidadeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno ?");
		int quantidadeNotas = entrada.nextInt();
		
		double[][] notasTurma = new double[quantidadeAlunos][quantidadeNotas];
		double total = 0;
		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
			}
		}
		
		double media = total/(quantidadeAlunos * quantidadeNotas);
		System.out.println("Média da turma é " + media);
		
		for (double[] ds : notasTurma) {
			System.out.println(Arrays.toString(ds));
		}
		
		entrada.close();
	}

}
