import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text");
        String text = input.nextLine();
        System.out.print("index:\t");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nchars:\t");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.substring(i, i + 1) + "\t");
        }
    }
}
