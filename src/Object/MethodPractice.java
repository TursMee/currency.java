package Object;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MethodPractice {
    /*
     	`create a method that will calculate age of a person,
 	`does not return age,
 	`will take birth year as parameter,
 	`user provides the birth year
 	`will print age of person
     */

    public void ageCalculator(int BirthYear){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter your Birth year");
//        BirthYear= scanner.nextInt();
        int age= LocalDateTime.now().getYear() -BirthYear;
        System.out.println("Your age is : "+age);
    }
   public  void ageCalculator(int BirthYear,String name){
       int age= LocalDateTime.now().getYear() -BirthYear;
       System.out.println(name+" Your age is : "+age);
       System.out.println("Overloaded age calculator method");
       //return age;

   }

    public static void main(String[] args) {
        MethodPractice object2=new MethodPractice();
        object2.ageCalculator(1994);

        int[] nums={1,2,3,4,5,6,7};
        double v=object2.SumOfArrayElem(nums);
        System.out.println(v);
        double w=object2.SumOfArrayElem(new int[] {1,2,3,4});
        System.out.println(w);
    }
    public double SumOfArrayElem(int[] ids){
        double sum=0;
        for (int id:ids) {
            sum+=id;
        }
        return sum;

    }
}
