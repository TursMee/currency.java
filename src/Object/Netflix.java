package Object;

import java.util.Random;

public class Netflix {
    String accountName;
    String username;
    static int monthlyDate=100;

    public static void use(int data){
        monthlyDate-=data;
        System.out.println("Monthly data you have left "+monthlyDate+" GB of data");
    }

}
