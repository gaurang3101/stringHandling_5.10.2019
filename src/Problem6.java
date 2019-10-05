import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to convert all characters to Uppercase.");
        String text = input.nextLine();
        System.out.println(text.toUpperCase());
    }
}
