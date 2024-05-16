import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMEROS PARES:");
        int numeroPar = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                numeroPar++;
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("QUANTIDADE DE PARES: " + numeroPar);

        sc.close();
    }
}