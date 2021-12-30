package Array;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.util.Arrays;

public class DimentionalArray {
    public static void main(String[] args) {
        int[][] numbers= new int[2][3];
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0][0]);//it shows 1 number from the largest arr and there is empty console shows 0
        System.out.println(numbers[0][1]);//shows next number after first


        numbers[0][0]=22;
        numbers[0][1]=33;
        numbers[0][2]=44;

        numbers[1][0]=55;
        numbers[1][1]=66;
        numbers[1][2]=77;
        System.out.println(numbers[1][1]);//66

        System.out.println(Arrays.deepToString(numbers));//[[22, 33, 44], [55, 66, 77]]
        for (int i=0;i<numbers.length;i++) {
            //System.out.println(Arrays.toString(numbers[i]));this is print arrays as array
            for(int k=0;k<numbers[i].length;k++){
                System.out.println(numbers[i][k]);//it's printing elements one by one
            }
        }
        System.out.println("====================");


        for(int[] nums:numbers){
            for (int num:nums) {
                System.out.println(num);

            }
        }


    }
}
