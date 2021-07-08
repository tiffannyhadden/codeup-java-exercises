package collection;

import java.util.Arrays;

public class ArrayLecture {

    public static void main(String[] args) {
 //param fake
        int fakeParam = 10;
        int[] intArray = new int[fakeParam];



        intArray[0] = 1;
        System.out.println(Arrays.toString(getIntArray(10))); // "[1, 2, 3]"


    }

    public static int[] getIntArray(int length){

        int[] intArray = {1, 2, 3 };
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i + 1;
        }
        return intArray;
//// public static int[] getIntArray(int length) {
//        int[] intArray = new int[length];
//
//        for(int i = 0; i < intArray.length; i++) {
//            intArray[i] = i * 2;
//        }
//            return intArray;
    }
}
