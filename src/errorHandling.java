public class errorHandling {

    public static void main(String[] args) {
        System.out.println(canBank(17, 2001));

    }
    private static String canBank(int age, double money){
        if(age > 16 && money >= 2000) {
            return "Welcome to the bank";
        } else {
             throw new NumberFormatException();
        }
    }
}

// try catch examples explained
//try { // try some code
//} catch(Exception e) {
// handle that exception being thrown
//}
//}

// try {
//  System.out.println("Let's see...");
//  int result = 1 / 0;
//  System.out.println("I can divide by zero!");
//} catch (ArithmeticException myException) {
//

