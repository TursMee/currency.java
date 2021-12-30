package loop.forLoop;

public class DigitalClock {
    public static void main(String[] args) {
        //print hours and minutes for 12 houts a day
        //ex:0:01...0:59-->till 11:59
        OUTER:  //inner,label
        for(int hour=0; hour<12;hour++){
            System.out.println(hour+"hour");
            for(int min=0;min<=59;min++){
                if(min>=30) { //it means break in to next hour after 30min
                    break OUTER;
                }
                for(int sec=0;sec<=59;sec++)
                    System.out.println(hour+":"+ min+":"+sec);
            }
        }























    }
}
