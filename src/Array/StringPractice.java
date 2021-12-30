package Array;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String[] names=new String[6];
        System.out.println(Arrays.toString(names));//shows[null....6time]

        names[5]="Alex";
        names[4]="Dinara";
        names[2]="Ana";
        names[0]="Mary";
        System.out.println(Arrays.toString(names));//shows 4 values(names) in one line with 2 nulls because we assigned just 4 index

     for(int i=0;i<names.length;i++){
         System.out.println(names[i]);
     }


    }
}
