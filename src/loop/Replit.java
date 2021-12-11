package loop;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        String value = scanner.nextLine();
        int count = 0;
        while (value.length() > count) {
            if (value.charAt(count)!= 'a'  || value.charAt(count)=='a') {
                char each = value.charAt(count);
                value = value.replace(each, 'a');
                System.out.println(value);


            }
            count++;

        }


//        int number1=scanner.nextInt();
//        System.out.println("Enter an ending number");
//        int number2=scanner.nextInt();
//        int count=0;
//        int div1=3;
//        int div2=5;
//        while (count>0){
//           if(number1%div1==0 &&number1%div2==0 && number2%div1==0 && number2%div2==0){
//
//
//           }
//
//            }
//        }

    }
}

