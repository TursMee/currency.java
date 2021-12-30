package loop.forLoop;

public class ReversingString {
    public static void main(String[] args) {
        String str="Meerim";
        String reverse="";
        for(int count=str.length()-1;count>=0;count--){
            reverse=reverse+str.charAt(count);

        }
        System.out.println(reverse);









    }
}
