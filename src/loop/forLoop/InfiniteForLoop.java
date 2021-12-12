package loop.forLoop;

public class InfiniteForLoop {
    public static void main(String[] args) {
        //print out David 5time
        for (int k = 0; k <= 5; k++) {
            System.out.println("David");
        }
        System.out.println("=============");
        //this code will print Zack infinite
        for( ; ; ){
            System.out.println("Zack");
        }
    }
}