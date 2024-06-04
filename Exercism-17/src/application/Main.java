package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> myList = new ArrayList<>();

        System.out.print("How manny employees will be registred ? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id:");
            Integer id = sc.nextInt();
            while (hasId(myList, id)) {
                System.out.println("Id already taken! Try again");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            myList.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee is that will have salary increase: ");
        int findId = sc.nextInt();

//      Utilizando função Lambda
        Employee emp = myList.stream().filter(x -> x.getId() == findId).findFirst().orElse(null);

//        Método manual
//        Integer pos = position(myList, findId);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : myList) {
            System.out.println(e);
        }

        sc.close();
    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

//    Método manual de buscar o id informado
//    public static Integer position(List<Employee> list, int id) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == id) {
//                return i;
//            }
//        }
//        return null;
//    }



}
