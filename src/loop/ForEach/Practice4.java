package loop.ForEach;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        String[] names={"John","Brian","Easy","Nina","David"};
        //create e=mail address for each of the name in array
        //store these emails in an array if it is gmail e-mail store it in gmail array if its yahoo store in yahoo array
        String[] gmail=new String[names.length];
        String[] yahoo=new String[names.length];
        for(String email:names){
            System.out.println(email.toLowerCase()+"@gmail.com");
            System.out.println(email.toLowerCase()+"@yahoo.com");
            }
        System.out.println("=======================");
        for(int i=0;i< names.length;i++){
            String acc=names[i]+"@gmail.com";
            String acc2=names[i]+"@yahoo.com";
           gmail[i]=acc;
           yahoo[i]=acc2;
        }
        System.out.println(Arrays.toString(gmail));
        System.out.println(Arrays.toString(yahoo));

        }
    }


