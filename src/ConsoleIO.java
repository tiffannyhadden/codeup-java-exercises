import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
//        System.out.printf("My name is Tiffanny \n");
//        System.out.printf("Maybe new line?");
//        String name = "Tiffanny";
//        String role = "instructor";
//        System.out.printf("My name is %s", name); // can also do %S it will return capitalized.
//
//        String mySentence = String.format("My name is %s and I am an %s", name, role);
//
//        System.out.println(mySentence);
//
//        String nickname = "Chuck";
//        String birthday = "June";
//        System.out.printf("Charles nickname is %s and his birthday is %s", nickname, birthday);
//
//        float currencyInPennies = 1000.0f;
//
//        System.out.printf("I'll sell you swamp land for $%.2f per acre", currencyInPennies);

        Scanner sc = new Scanner(System.in); // changed up above import java.util.Scanner;
//        System.out.println("What is your first name?");
//        String firstName = sc.next();
//        System.out.printf("You entered: %s\n", firstName);
//        System.out.println("What is your full name?");
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Your first name is %s\n", firstName);
//        System.out.printf("Your last name is %s\n", lastName);


//        /* TODO: use the scanner to take in the name of the month you were born and print it back out
//    - remember to first prompt the user for the input
// */
//        System.out.println("What is the month you were born?");
//        String birthMonth = sc.next();
//        System.out.printf("My birth month is %s\n", birthMonth);

//        System.out.print("Enter a number: ");
//        int myNum = sc.nextInt();
//        System.out.println(myNum);
        //nextInt - token is the first uninterrupted integer
        //It takes the integer value only

//        String myString = sc.nextLine();
//        System.out.println(myString);
//        boolean hasNL = sc.hasNext();
//        int myNum = sc.nextInt();
//        System.out.println(myNum);

        while (sc.hasNext()){ //boolean loop
            String word = sc.next();
            System.out.println(word);
            // Hi my name is casey
            //Hi
            //my
            //name
            //is
            //casey
        }



    }

}
