package Array;

public class Dimentionaltask1 {
    public static void main(String[] args) {
        String[][] device={{"Apple","Lenova","HP","DELL","Acer"},{"Samsung","LG","Sony"},{"Alexa","Google","Logistech","JBL"}};
        double [][] price={{2500,1600,1800,1900},{2199,1799,1599},{79.99,89.99,64.99,55.99}};
        for (int i=0;i< device.length;i++){
            for(int j=0;j<device[i].length;j++){
                System.out.println(device[i][j] +" is cost "+ price[i][j]);
                if(price.length<1000){
                    System.out.println("This device "+device[i][j]+ " is less than 1000$"+price[i][j]);
                }
            }
        }







    }
}
