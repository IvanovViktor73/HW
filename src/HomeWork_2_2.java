import java.util.Scanner;

public class HomeWork_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char symbol = str.charAt(0);
        int len = str.length();
        while (len != 0) {
            len--;
            System.out.println(symbol);
        }
    }
}
