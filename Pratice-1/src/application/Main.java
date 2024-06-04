package application;

import entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> myList = new ArrayList<>();

        System.out.print("How many products do you want to register ? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Product #" + i + ":");
            System.out.print("Product Id: ");
            int id = sc.nextInt();
            while (hasId(myList, id)) {
                System.out.println("Id already taken! Please try again.");
                id = sc.nextInt();
            }
            System.out.print("Product name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();

            Product prod = new Product(id, name, price);
            myList.add(prod);
        }

        System.out.println();
        System.out.print("Enter the product ID you want to increase the price:");
        Integer idSearch = sc.nextInt();

        Product prod = myList.stream().filter(x -> Objects.equals(x.getId(), idSearch)).findFirst().orElse(null);
        if (prod == null) {
            System.out.println("Product does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            prod.increasePrice(percentage);
        }

        System.out.println();
        System.out.println("List of products:");
        for (Product p : myList) {
            System.out.println(p);
        }

        sc.close();
    }

    public static boolean hasId(List<Product> list, int id) {
        Product prod = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return prod != null;
    }

}