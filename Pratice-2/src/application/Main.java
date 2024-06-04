package application;

import entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Quantos produtos deseja cadastrar ? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Product #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preço: ");
            Double price = sc.nextDouble();

            Product prod = new Product(id, name, price);
            list.add(prod);
        }

        System.out.println();
        System.out.print("Informe o nome do produto que deseja atualizar o preço: ");
        String prodSearch = sc.next();

        Product prod = list.stream().filter(x -> Objects.equals(x.getName(), prodSearch)).findFirst().orElse(null);
        if (prod == null) {
            System.out.println("Product does not exist!");
        } else {
            System.out.print("Enter the new price: ");
            double newPrice = sc.nextDouble();
            prod.setPrice(newPrice);
        }

        System.out.println();
        System.out.println("List of products");


        for (Product p : list) {
            System.out.println(p);
        }

        sc.close();
    }

}