package loop.forLoop;

public class PracticeFor3 {
    public static void main(String[] args) {
        //print out every letter from the string
        String str="Today is snowy";
        for(int count=0;str.length()>count;count++) {
            System.out.println(count + "*" + str.charAt(count));
        }

        //print out only letter 'y' from the string
        for(int ind=0;str.length()>ind;ind++){
            if(str.charAt(ind)=='y') {
                System.out.println(str.charAt(ind));
            }
            }
        //print out number of letter 'n' in the string
        int count=0;
        for(int n=0;str.length()>n;n++){
            if(str.charAt(n)=='n'){
                count++;
            }
        }
        System.out.println("There are "+count+" "+'n');


    }
}
