import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println();

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        double media = sum / vect.length;

        System.out.printf("MEDIA DO VETOR: %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }

        sc.close();
    }
}