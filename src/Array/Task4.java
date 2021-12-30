package Array;

public class Task4 {
    public static void main(String[] args) {
        String str="Meerim";
        int[] arr={4,24,10,100,5,78,11,25,55,str.length()};
        //find sum of numbers less then 10 from array
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<10){
               sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
