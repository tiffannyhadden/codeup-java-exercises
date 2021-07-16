package warmup;

import java.util.ArrayList;

public class Friday {
    public static void main(String[] args) {

        int num = 3;
        int status = 1;
        ArrayList list = new ArrayList();

        for(int i = 0; i<= 90; i++) {
            for(int i = 2; i<= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    status = 0;
                    break;
                }
            }
            if(status != 0) {
                list.add(num);
                i++;
            }
            status = 1;
            num++;
        }
        System.out.println("list" + list);

    }

}

