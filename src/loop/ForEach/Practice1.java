package loop.ForEach;

public class Practice1 {
    public static void main(String[] args) {
        int[] numbers={45,23,5,7,21,66,100};
        //print out each element this array by using for each loop
        for(int i=0;i<=numbers.length-1;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("=================");
        for(int num:numbers){
            if(num>=20&&num<=25)
                System.out.println(num);
        }
        System.out.println("===========");
        String flowers[]={"rose","lily","orchid","violet","tulip"};
        for(String flower:flowers){
            //System.out.println(flower);
            System.out.println(flowers[0]);
        }
    }
}
