package primitives;

import org.w3c.dom.ls.LSOutput;

public class comparisePractise2 {
    public static void main(String[] args) {
        int childHeight= 48;
        int myChildheight = 56;
        boolean pass= childHeight<=myChildheight ;
        System.out.println(pass);
        // 6 or younger it will be free;
        int childAge = 6;
        int myChildAge = 5;
        boolean pass2 = childAge<= myChildAge;
        System.out.println(pass2);

    }

}
