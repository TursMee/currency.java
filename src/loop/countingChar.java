package loop;

public class countingChar {
//      -count letters, digits and other characters in the String
//
//    String str = "$3%GTlk64mn^y?";
//
//    sout("There are <..> letters in the string");
//    sout("There are <..> digits in the string");
    public static void main(String[] args) {
        String str="$3%GTlk64mn^y?";
        int ind=0;
        int letter=0;
        int digits=0;
        int sign=0;
        do{
            if(str.charAt(ind)>='A' &&str.charAt(ind)<='Z' || str.charAt(ind)>='a' && str.charAt(ind)<='z'){
                letter++;
            }else if(str.charAt(ind)>='0' && str.charAt(ind)<='9'){
                digits++;
            }else{
                sign++;
            }
            ind++;
        }while(str.length()>ind);
        System.out.println("There are "+letter+  " letters in the string");
        System.out.println("There are "+digits+ " digits in the string");
        System.out.println("There are " +sign+ " letters in the string");
    }
}
