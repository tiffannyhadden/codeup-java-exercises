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
