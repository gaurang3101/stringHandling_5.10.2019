import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text");
        String text = input.nextLine();
        System.out.println("Enter any character of the previously entered text");
        char c = input.next().trim().charAt(0);
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == c) {
                System.out.println(i);
            }
    }
}
