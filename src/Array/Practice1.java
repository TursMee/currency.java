package Array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] studentId=new int[5];
        studentId[0]=21;
        studentId[1]=31;
        studentId[2]=41;
       // System.out.println(studentId); //print out -->[I@29453f44 store where is my studentId
        System.out.println(studentId[3]); //we have 5 space but we assigned just 3 space and this line print out 0
        //studentId[1]=99; //reassigning value

      // studentId[5]=51;We don't have index5 that's why we can't assign value with index5
        System.out.println("=============");
        for(int i=0;i<studentId.length;i++){
            System.out.println(studentId[i]);
        }
        System.out.println(Arrays.toString(studentId));//it will print out all elements as array from array


    }
}
