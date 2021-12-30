
package Array;
import java.util.Scanner;
import java.util.Arrays;

public class UserPractice {
    public static void main(String[] args) {
        /*-ask user, how many names that s/he wants to store in array
        -store those names by getting it from user in to array that is called 'names'
                -print them out by using ->Arrays.toString(); method*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many names do you want to store? ");
        int num= scanner.nextInt();
        String[] store=new String[num];

        for(int i=0;i<store.length;i++){
            scanner=new Scanner(System.in);
            System.out.println("Enter " +(i+1)+" name");
            String names = scanner.nextLine();
            store[i]=names;

        }
        System.out.println(Arrays.toString(store));


    }
}
