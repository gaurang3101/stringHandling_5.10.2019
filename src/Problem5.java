import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String string = input.nextLine().trim();
        System.out.println("Enter the substring");
        String subString = input.nextLine().trim();
        string = string.replaceAll(subString, "*");
        System.out.println(string);
    }
}
