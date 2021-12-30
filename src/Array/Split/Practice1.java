package Array.Split;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        String str="Stay safe and Healthy";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        //print out every single word as:....***
        for(String word:arr) {
            System.out.println(word + "***");
        }
        String[] arr2=str.split("a",2);
        System.out.println(Arrays.toString(arr2));
        //12_17_2021
        String date="12_17_2021";
        String[] sp=date.split("_");
        for(String sep:sp) {
            System.out.println(sep);
        }
        //12.17.2021
        String date2="12.17.2021";
        String[] sp2=date2.split("\\.");
        System.out.println("This is for dot(.) example "+Arrays.toString(sp2));
        for(String d:sp2){
            System.out.println("\""+d+"\"");
        }



    }
}
