package Test;
import java.util.*;  

public class Calculator {
    public static void main(String arg[]){
        // nextLine(): Reads a whole line of text (including spaces).
        // next(): Reads a single word (stops at the first whitespace).
        // nextInt(): Reads an integer value.
        // nextDouble(): Reads a double (decimal) value.
        // nextBoolean(): Reads a boolean value (true or false)
        Scanner sc = new Scanner(System.in);  // Scanner is a class for taking inputs from user and this class is present in java.util package.
        System.out.println("Enter First value-");
        float a= sc.nextFloat();  // For integer input
        System.out.println("Enter Second value-");
        float b = sc.nextFloat();
        System.out.println("Enter Your choice-");

        String choice= sc.next();
        float c;
        if("sum".equals(choice)){
            c = a+b;
            System.out.println("Sum is:-"+c);
        }
        else if("sub".equals(choice)){
            c = a-b;
            System.out.println("Substraction is:-     "+c);
        }
        else if("multi".equals(choice)){
            c = a*b;
            System.out.println("Multiplication is:-     "+c);
        }
        else if("divide".equals(choice)){
            c = a/b;
            System.out.println("Divison is:-     "+c);
        }
        else{
             System.out.println("Unexpected Input.");
        }
        //java.util.InputMismatchException - if inputted value is not true or false  in boolean
        // String text= sc.next();
        // System.out.println("here is result ----"+text);
        sc.close();





    }
    
}
