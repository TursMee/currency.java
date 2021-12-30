package Array;

import java.util.Arrays;

public class CombiningArrays {
    public static void main(String[] args) {
        int[] num={3,4,5};
        int[] num2={6,7,8,9};
        int[] comb=new int[num.length+num2.length];
        //combine these two arrays in to another array
        for(int i=0;i<num.length;i++){
            comb[i]=num[i];

        }
        System.out.println(Arrays.toString(comb));
        for(int k=num.length,m=0;k<comb.length;k++,m++){
            comb[k]=num2[m];
        }
        System.out.println(Arrays.toString(comb));
    }
}
