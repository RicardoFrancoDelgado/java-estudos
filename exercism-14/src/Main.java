import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da pessoa %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maisVelho = idade[0];
        int posicaoMaior = 0;

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > maisVelho) {
                maisVelho = idade[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaoMaior]);

        sc.close();
    }
}