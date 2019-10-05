import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string");
        String b = input.nextLine().trim();
        System.out.println("enter the character");
        char a = input.next().charAt(0);
        System.out.println(b.indexOf(a));
    }
}
