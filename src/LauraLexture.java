////public class LauraLexture {
////    public static void main(String[] args) {
////   String myFavAnimal = "frog";
////        System.out.println(myFavAnimal);
////
////        int chanceOfRain = 60;
////        if(chanceOfRain >= 50){
////            System.out.println("Stay inside");
////        }
////
////        boolean isWarm = true;
////        boolean isSunny = false;
////        if(isWarm && isSunny){
////            System.out.println("go swimming");
//
//        //&& will stop evaluating if the first condition is false
//        //& will still read both conditions no matter what
//
//        //if(isWarm || isSunny){
//        // System.out.println("go swimming");
//
//        //if(isWarm | isSunny){
//        // System.out.println("2nd go swim");
//
//        //String myName = "Laura";
//        //String yourName = "Laura";
//        //.equals()
//        //System.out.println(myName.equals(yourName));
//        //.equalsIgnoreCase
//        //System.out.println(myName.equalsIgnoreCase(yourName));
//
//        //CONTROL STRUCTURES
//
//        //if(/*condition*/){
//        //execute code if condition is met to be true
//
//        //        MINI EXERCISE
//        // TODO: create three unique usernames (user1, user2, user3).
//        //  create a fourth user and set it equal to user input. (ask
//        //  the user to enter a username). if the username has already
//        //  been used by user1, user2, or user3, print "sorry this
//        //  username already exists.
//
////            scanner sc = new Scanner(System.in);
////
////            String user1 = "demo";
////            String user2 = "prachi";
////            String user3 = "josh";
////
////            System.out.println("Please enter a username");
////
////            String user4 = sc.nextLine();
////            if(user4.equalsIgnoreCase(user1) || user4.equalsIgnoreCase(user2) || user4.equalsIgnoreCase(user3) {
////                System.out.println("sorry this username already exists");
//
//
//////            }
//////
//////        }
////
////    }
////}
//
//
////    }}
////TODO: refactor your code from the previous mini exercise into a switch statement
//
////public class SwitchCaseExample1 {
////
////    public static void main(String args[]){
////        int num=2;
////        switch(num+2)
////        {
////            case 1:
////                System.out.println("Case1: Value is: "+num);
////            case 2:
////                System.out.println("Case2: Value is: "+num);
////            case 3:
////                System.out.println("Case3: Value is: "+num);
////            default:
////                System.out.println("Default: Value is: "+num);
//
////ex from web, took screenshot need to add in here the answer to mini exercise.
//
//
////TODO: using previous mini exercise, allow the user to input a new username several times until a unique username is entered.
////        }
//
////    }
////}
//
//
////        warmup:
////        TODO: create a new "Strings-Lecture" java class file (or wherever
////         you like to keep notes/lecture exercises. Copy given
////         code, that is your starting point. Using Scanner prompt a
////         user (in this case it's you, you're the user) to type in
////         their first name. Save the input into a String variable. If
////         your name matches randomName, print "woah! you guessed:
////         enter-randomName-here! How did you know enter-yourName-here
////         is my name?!". if randomName does
////         not
////         match your name exactly, print "Way off my friend! My name
////         isn't randomName-here. It's yourName-here.".
////import java.util.Scanner;
////public class LauraLexture {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String[] studentsArr =
////                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
////                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
////                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
////                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
////                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
////                        "Casey", "Dorian", "Tristan", "Jordy"};
////        int randomNum = (int) (Math.random() * 28);
////        String randomName = studentsArr[randomNum];
////        System.out.println("What is your first name?");
////        String firstName = sc.next();
////        System.out.printf("You entered: %s\n", firstName);
////        if(firstName.equals(randomName)) {
////            System.out.println("woah! you guessed: " + randomName +
////                    "!!" + "How did you know my name is: " + firstName);
////                  } else {
////              System.out.println("Way off my friend! My name isn't " + firstName + ". It's " + randomName + ".");
////        }
////
////    }
////}
////        TODO: create a String variable that holds this sentence: "Red
////         Orange Blue Yellow Green Purple". Prompt the user to type in
////         their favorite color, if their fave color is the same as the
////         first word in the String, then print out "my fave color:
////         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"
//
//public class LauraLexture {
//    public static void main(String[] args) {
//        String colors = "Red Orange Blue Yellow Green Purple";
//
//        System.out.print("What is your favorite color: ");
//
//        String input = scanner.next();
//
//        if (colors.startsWith(input)) {
//            System.out.println("My fave color: " + input + " is the first one!");
//        } else if (colors.endsWith(input)) {
//            System.out.println("My fave color: " + input + " is the last one!");
//        } else {
//            System.out.println(" I don't know that color...");

//
//        }
//
//
//    }
//}
////    TODO: create a new method that accepts the name of a basketball
////     team (ex: the spurs) and returns a String that says
////     "[basketballTeam] is the best team.". Invoke that method within
////     your main method (remember to pass in the name of the basketball
////     team). print out the result of the new method.

//public class LauraLexture {
//    public static void main(String[] args) {
//                String basketball = "Spurs";
//
//        System.out.print("What is your favorite color: ");
//    }
//}
//            public static void basketballTeam(String s){
//            String ballTeam = s + " is the best team!";
//            System.out.println(ballTeam);
//            counter(ballTeam);
//        }
// part 2
//    TODO: create a new method that accepts the string created from the
//     first method and returns the number of characters in that string.

//        public static void counter(String str){
//        System.out.println("With white spaces the number of characters is " + str.length());
//        int count = 0;
//        for(int i = 0; i < str.length(); i ++) {
//            if(str.charAt(i) != ' '){
//        count++;
//
//        }
//        }
//        System.out.println("Without white spaces the number of characters is " + count);
//        }
//        }


//    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.


