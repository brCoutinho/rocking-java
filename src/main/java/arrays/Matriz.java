package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        int qtdAlunos = s.nextInt();

        System.out.println("Quantidade de nota por aluno: ");
        int qtdNota = s.nextInt();

        double[][] notas = new double[qtdAlunos][qtdNota];

        double total = 0;
        for(int a = 0; a < notas.length; a++){
            for(int n = 0; n < notas[a].length; n++){
                System.out.println("Informe a nota "+ (n+1) + " do aluno "+ (a+1) +": ");
                notas[a][n] = s.nextDouble();
                total += notas[a][n];
            }
        }

        //FAZER COM FOREACH


        double media = total/(qtdAlunos*qtdNota);
        System.out.println("A média da turma é: " + media );
        s.close();
    }
}
