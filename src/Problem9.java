import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to know its Absolute Weight.");
        String text= input.nextLine();
        char[] a1=text.toLowerCase().toCharArray();
        int lowerWeight=0;
        for (int i=0;i<text.length();i++){
            int j=a1[i];
            lowerWeight=lowerWeight+j;
        }
        char[] a2=text.toUpperCase().toCharArray();
        int upperWeight=0;
        for (int i=0;i<text.length();i++){
            int j=a2[i];
            upperWeight=upperWeight+j;
        }
        int absoluteWeight=upperWeight-lowerWeight;
        if (absoluteWeight<0){
            absoluteWeight=-absoluteWeight;
            System.out.println(absoluteWeight);
        }
        else {
            System.out.println(absoluteWeight);
        }
    }
}
