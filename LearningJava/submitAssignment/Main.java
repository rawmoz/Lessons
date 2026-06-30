public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + check(i));
        }
    }

    public static String check(int number) {
        String result = "";
        if (number % 3 == 0) result += " fizz";
        if (number % 5 == 0) result += " buzz";
        return result;
    }
}