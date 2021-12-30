package Array;

import java.util.Arrays;

public class CharPractice {
    public static void main(String[] args) {
        //print out just digits
        //store other than dig in a new array
        char[] chs={'A','4','&','z','3','u','*'};
        char[] other=new char[chs.length];
        int count=0;
        for(int i=0;i<chs.length;i++){
            if (chs[i]>='0' &&chs[i]<='9' ) {
                System.out.println(chs[i]);
                count++;
            }
            else{
                other[i]=chs[i];
            }
            }
        System.out.println(Arrays.toString(other));
        Arrays.sort(other);
        System.out.println(Arrays.toString(other));
        }



    }

