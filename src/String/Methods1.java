package String;

public class Methods1 {
    public static void main(String[] args) {
        String device=  "microphone";
        char ch = device.charAt(1);
        System.out.println(ch);
        int letterCount = device.length();
        System.out.println(letterCount);
        device += "is expensive";
        System.out.println(device.length());
        String  moreletters = "The American Standard Code for Information Interchange (ASCII) is a means of encoding characters for digital communications. " +
                "It was originally developed in the early 1960s as early networked communications were being developed $";
        char lastChar =moreletters.charAt(moreletters.length() - 1);
        System.out.println(lastChar);
        char middleChar = moreletters.charAt((moreletters.length()-1) /2);
        System.out.println(moreletters.length());
        System.out.println(middleChar);

        String new1 = "Techtorial";
        System.out.println(new1.charAt(new1.length()-1)/2);

    }
}
