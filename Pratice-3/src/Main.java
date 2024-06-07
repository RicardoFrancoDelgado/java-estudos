import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();


        int[][] matriz = new int[m][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    found = true;
                    System.out.println("Position: " + i + "," + j);

                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j] + " | Position: " + (i - 1)+ "," + j);
                    } else {
                        System.out.println("No numbers above!");
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1] + " | Position: " + i + "," + (j + 1));
                    } else {
                        System.out.println("No numbers right!");
                    }
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1] + " | Position: " + i + "," + (j - 1));
                    } else {
                        System.out.println("No numbers left!");
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j] + " | Position: " + (i + 1)+ "," + j);
                    } else {
                        System.out.println("No numbers below!");
                    }
                }
            }
        }

        if(!found) {
            System.out.println("The value " + x + " is not in the matriz.");
        }

        sc.close();
    }
}