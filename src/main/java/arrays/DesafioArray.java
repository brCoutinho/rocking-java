package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantas notas você quer informar? ");
        int qtdNota = s.nextInt();

        double[] notas = new double[qtdNota];

        for(int i = 0; i<notas.length; i++){
            System.out.println("Digite o valor da nota " + (i + 1) + ": ");
            notas[i] = s.nextDouble();
        }

        double soma = 0;
        for(double valor: notas){
            soma += valor;
        }

        System.out.println("A média do aluno é: " + (soma/notas.length));
        s.close();
    }
}
