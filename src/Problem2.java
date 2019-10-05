import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text");
        String text = input.nextLine();
        int i =input.nextInt();
        int j =input.nextInt();
        System.out.println(text);
        System.out.println(text.substring(i,j));
    }
}
