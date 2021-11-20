package primitives;

public class Farm {
    public static void main(String[] args) {
        int cow = 2345;
        int cowLegs=4;
        int cowCount=12;
        double chicken = 23.99;
        int chickenLegs=2;
        int chickenCount = 23;
        int numLegs= (cowCount*cowLegs)+(chickenCount*chickenLegs);
        System.out.println(numLegs);
        double total = (cowCount*cow)+(chickenCount*chicken);
        System.out.println(total);
    }
}
