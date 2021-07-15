import java.util.Random;

////WARM UP
//// TODO Given this string: `String str = "Oberon is the
////  best cohort ever!"`, print out the character from that
////  string using a random number generator, that generates
////  a number between 0 and 50. Using a try/catch block, handle
////  any errors (Exceptions) that may occur by printing out the
////  message.
public class javaWarmup {
    public static void main(String[] args) {

        String str = "Oberon is the best cohort ever";

        randomGenerator(str);
    }

    public static void randomGenerator(String str){

        Random random = new Random();

        int upperLimit = 50;

        int rando = random.nextInt(upperLimit);

    }


}
