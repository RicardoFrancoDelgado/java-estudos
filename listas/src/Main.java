import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Maria");
        myList.add("Alex");
        myList.add("Bob");
        myList.add("Anna");

        myList.add(2, "Marco");

        System.out.println(myList.size());

        for (String name : myList) {
            System.out.println(name);
        }

        System.out.println("--------------------------------");

        myList.removeIf(x -> x.charAt(0) == 'M');
        for (String name : myList) {
            System.out.println(name);
        }

        System.out.println("--------------------------------");


    }

}