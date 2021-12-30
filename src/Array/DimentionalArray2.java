package Array;

import java.util.Arrays;

public class DimentionalArray2 {
    public static void main(String[] args) {
        //states of different regions in US
        //print out every state onr by one

        String[][]states={{"IL","OH"},{"NY","FL","NC"},{"CA","WA","OR","UT"}};
        for(String[] state:states){
            for(String each:state){
                System.out.println(each);
            }
        }






    }
}
