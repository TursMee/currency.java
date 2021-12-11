package loop.forLoop;

public class PracticeFor2 {
    public static void main(String[] args) {
        //print out numbers btw 0--5 decreasing by using for loop
        for(int a=5; a>=0; a--){
            System.out.println(a);
        }
        int sum=0; //we can put sum into for()
        for(int b=1;b<5;b++){
            sum+=b;
          //System.out.println("It is"+sum); it shows many time
        }
        System.out.println("It is"+sum); //out of loop shows ans 1time
    }
}
