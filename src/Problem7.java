import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text");
        String text = input.nextLine();
        char[] a = text.toCharArray();
        int totalWeight = 0;
        for (int i = 0; i < text.length(); i++) {
            int ascii = a[i];
            totalWeight = totalWeight + ascii;
        }
        System.out.println(totalWeight);
    }
}
