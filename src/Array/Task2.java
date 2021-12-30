package Array;

import java.util.Scanner;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
         /*-ask user, how many names that s/he wants to store in array
        -if name has more than 5 letters store it in longname array
        if the name has less than 5 letters store it in shortname array
                -print them both out by using ->Arrays.toString(); method*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many names do you want to store? ");
        int num= scanner.nextInt();
        String[] longName=new String[num];
        String[]shortName=new String[num];
        for(int i=0; i< num;i++){
            scanner=new Scanner(System.in);
            System.out.println("Enter " +(i+1)+" name");
            String names = scanner.nextLine();
            if(names.length()>=5) {
                longName[i] = names;
            }else{
                shortName[i]=names;
            }

        }
        System.out.println(Arrays.toString(longName));
        System.out.println(Arrays.toString(shortName));
    }
}
