package loop.forLoop;

public class PalindromePractice {
    public static void main(String[] args) {
        String str="1234321";
        String palind="";
        for(int i=str.length()-1;i>=0;i--) {
            palind += str.charAt(i);
        }
            if(palind.equalsIgnoreCase(str)){
                System.out.println("It is palindrome string");
            }else{
                System.out.println("It is NOT palindrome string");
            }



    }
}
