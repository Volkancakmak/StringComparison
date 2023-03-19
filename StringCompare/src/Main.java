import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String s1,s2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first string:");
        s1=scanner.nextLine();
        System.out.println("Enter second string:");
        s2=scanner.nextLine();

        if(s1.compareTo(s2)>0){
            System.out.println("First string is bigger than second string.");

        }
        else if(s2.compareTo(s1)>0){
            System.out.println("Second string is bigger than first string.");
        }
        else
            System.out.println("Two string are equal");
    }
}