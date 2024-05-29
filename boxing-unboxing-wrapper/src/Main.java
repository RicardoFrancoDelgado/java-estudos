public class Main {
    public static void main(String[] args) {
        int x = 20;

        Object obj = x;

        System.out.println(x);

        int y = (int) obj;

        System.out.println(y);
    }
}