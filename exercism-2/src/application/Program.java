package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine(); // comando para ler texto

        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee);

        sc.close();

    }
}