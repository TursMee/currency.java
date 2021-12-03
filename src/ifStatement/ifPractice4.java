package ifStatement;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ifPractice4 {
    public static void main(String[] args) {
        int number =1234;
        if(number==1234)
            System.out.println("Hello");//this line still depending on 'if statement' affect without curlybraces if in () is true
        System.out.println("hello");
        int num1 = 6;
        if(num1<10)
            num1++;//adding 1 on the next line
        System.out.println(num1++);
        int num2=4;
        if(num2>20)
            num2++; //this line dont be work because num2 is not more 20 and shows just 4
        System.out.println(num2);

    }
}
