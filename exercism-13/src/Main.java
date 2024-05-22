import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        double somaPar = 0;
        double numeroPar = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                somaPar += vect[i];
                numeroPar++;
            }
        }

        if (numeroPar == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double mediaPar = somaPar / numeroPar;
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPar);
        }



        sc.close();
    }
}