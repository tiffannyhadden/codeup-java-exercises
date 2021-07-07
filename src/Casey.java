//Create a method that will return how many capital letters are in a string.
import java.util.Scanner;
public class Casey {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type some words with Uppercase letters");
        String input = sc.nextLine();

        int countUps = 0;

        for(int x = 0; x < input.length(); x++){
            if (Character.isUpperCase(input.charAt(x))) countUps++;
        }
        System.out.println("String: " + countUps);
    }

}
