package loop.forLoop;

public class PerfectNumber {
    public static void main(String[] args) {
        int number=28;
        int sum=0;
        for(int divisor=1;divisor<=number/2;divisor++){
            if(number%divisor==0){
                sum+=divisor;
            }
        }
        if(number==sum){
            System.out.println(number+" is a perfect number");
        }else{
            System.out.println(number+" is not perfect number");
        }










    }
}
