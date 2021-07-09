package collection;

import java.util.ArrayList;
public class CollectionLecture {

    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>();

        stringArr.add("Casey");

        System.out.println(stringArr);
        System.out.printf("Current ArrayList size %s", stringArr.size());
        System.out.println(stringArr.get(0));
        //

        stringArr.add("Raul");
        System.out.printf("Current ArrayList size: %\n", stringArr.size());


    }
}
