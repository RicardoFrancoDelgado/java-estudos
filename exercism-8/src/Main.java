import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        System.out.println();

        double sumAltura = 0.0;
        for(int i = 0; i < altura.length; i++) {
            sumAltura += altura[i];
        }
        double mediaAltura = sumAltura / altura.length;
        System.out.printf("Altura média: %.2f%n", mediaAltura);

        int menores = 0;
        for(int i = 0; i < idade.length; i++) {
            if (idade[i] < 16) {
                menores++;
            }
        }

        double percentualMenores = ((double)menores/n) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < idade.length; i++) {
            if(idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }

        sc.close();
    }
}