package Array;

import java.util.Arrays;

public class ReversingString {
    public static void main(String[] args) {
        String[] colors={"white","black","red","pink","orange"};
        String rev="";
        String[] reversed=new String[colors.length];
        for(int a=0;a<colors.length;a++){
            rev="";
            for(int i= colors[a].length()-1;i>=0;i--){
                rev+=colors[a].charAt(i);
            }
            reversed[a]=rev;

        }
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(reversed));
    }
}
