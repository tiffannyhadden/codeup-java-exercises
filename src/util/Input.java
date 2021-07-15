package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;
    private int number;
    private double doubleNum;
    public Input(){
        this.scanner = new Scanner(System.in);
        this.number = number;
        this.doubleNum = doubleNum;
    }
    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue? ");
        String input = scanner.next();
        return input.matches("(?i)y|yes|yea|yeah|ya|yep");
    }

//    public int getInt(int min, int max){
//        this.number = getInt();
//        if(number < min){
//            System.out.println("Please pick a number between " + min + " and " + max);
//            getInt(min, max);
//        } else if(number > max){
//            System.out.println("Please pick a number between " + min + " and " + max);
//            getInt(min, max);
//        }
//        return this.number;
//    }
//    public int getInt(){
//        System.out.print("Please enter a number: ");
////        int number = scanner.nextInt();
//        if(scanner.hasNext()) {
//            return scanner.nextInt();
//        } else {
//            System.out.println("please enter a choice between zero and five");
//            getInt();
//        }
//        return number;
//    }
//    public double getDouble(double min, double max){
//        this.doubleNum = getDouble();
//        if(doubleNum < min){
//            System.out.println("Please pick a number between " + min + " and " + max);
//            getDouble(min, max);
//        } else if(doubleNum > max){
//            System.out.println("Please pick a number between " + min + " and " + max);
//            getDouble(min, max);
//        }
//        return this.doubleNum;
//    }
//    public double getDouble(){
////        System.out.print("Please enter a number with decimals: ");
//        double doubleNum = scanner.nextDouble();
//        return doubleNum;
//    }
    public int getDouble(){
        System.out.println("Please enter a number with decimals");
        try {
            return Integer.valueOf(getString());
        } catch(NumberFormatException e) {
            System.out.println("Not a number");
            return getDouble();
        }
    }


    public int getInt() {
        System.out.println("Please enter an integer");
        try {
            return Integer.valueOf(getString());
        } catch(NumberFormatException e) {
            System.out.println("Not a number");
            return getInt();
        }
    }
}