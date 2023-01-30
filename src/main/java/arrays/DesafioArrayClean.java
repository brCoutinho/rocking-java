package arrays;

import java.util.Scanner;

public class DesafioArrayClean {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantas notas você quer informar? ");
        double[] notas = new double[s.nextInt()];

        double total = 0;
        int contador = 0;
        for(double nota: notas){
            contador++;
            System.out.println("Digite o valor da nota " + contador + ": ");
            nota = s.nextDouble();;
            total += nota;
        }
        System.out.println("A média do aluno é: " + (total/notas.length));
        s.close();
    }
}
