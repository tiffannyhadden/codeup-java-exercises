import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %s", pi);
        //caseys version of above
        //System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int myNum = sc.nextInt();
        System.out.println("Here is your number: " + myNum);
        System.out.println("Enter in three words");
        while (sc.hasNext()) {
            String threeWords = sc.next();
            System.out.println(threeWords);
            System.out.println("Enter a sentence");
            String sentence = sc.nextLine();
            System.out.println(sentence);
            System.out.println("Enter the length and width of classroom");
            int length = sc.nextInt();
            System.out.println("Please enter a number for length");
            int width = sc.nextInt();
            int area = length + width;
            System.out.printf("The area of the room is %d", area);

            //caseys
//            int length = Integer.parseInt(sc.nextLine());
//            int width = Integer.parseInt(sc.nextLine());

            System.out.printf("Perimeter: %s\n", (2 * length) + (2 * width));
            System.out.printf("Area: %s", length * width);

            //bonus
            // float length = Float.parseFloat(sc.nextLine());
            // float width = Float.parseFloat(sc.nextLine());




//
        }
    }
}


