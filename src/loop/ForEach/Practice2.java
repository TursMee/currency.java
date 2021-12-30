package loop.ForEach;

public class Practice2 {
    public static void main(String[] args) {
        double[] checks={2540,10000,100000,65.50,1.99};
        //by using for each find and print out the total amount of checks
        double total=0;
        for(double check:checks){
            total+=check;

        }
        System.out.println("Total check is "+total);
    }
}
