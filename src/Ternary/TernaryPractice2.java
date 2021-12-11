package Ternary;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int a=3, b=5, k=7;
        //increments++ /decrements--

      int r1=  a>=k ? a+ k++ : ++b +k; //didn't seen first k++ because condition a>k is false and a+ k++ is skiped
        System.out.println(r1);

        int r2= k<++b ? 2*++k : --k*2 -1;
        System.out.println(r2);

        System.out.println(k>=b ? "I got this " : false); //it's print false like boolean false
    }
}
