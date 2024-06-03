import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println("Index of Bob: " + myList.indexOf("Bob"));
        System.out.println("Index of Marco: " + myList.indexOf("Marco"));

        System.out.println("--------------------------------");

        List<String> result = myList.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------------------------");

        String name = myList.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }

}