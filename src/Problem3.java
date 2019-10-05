import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text with vowels to see magic!");
        String text = input.nextLine();

        text = text.replace('a', '*');
        text = text.replace('e', '*');
        text = text.replace('i', '*');
        text = text.replace('o', '*');
        text = text.replace('u', '*');
        text = text.replace('A', '*');
        text = text.replace('E', '*');
        text = text.replace('I', '*');
        text = text.replace('O', '*');
        text = text.replace('U', '*');
        System.out.println(text);


    }
}
