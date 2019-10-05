import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase with vowels to see magic!");
        String text = input.nextLine();
        char[] a = text.toCharArray();
        int c = 0;
        for (int i = 0; i < text.length(); i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                c++;
                if (c == 1) {
                    a[i] = '*';
                }
                if (c == 2) {
                    a[i] = '^';
                }
                if (c == 3) {
                    a[i] = '!';
                }
            }
        }
        System.out.println(a);
    }
}
