package Test;

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Type how much you love supriti");
        int a= sc.nextInt();

        for(int i =0 ;  i < a ; i++  ){   
            for(int j=0; j < i; j++){
            System.out.println("*");
            }
            System.out.println();
        }  // n^2


        // while loop first check condition then execute its block
        // do-while loop execute at least once then check the condition and then it decide to need to run again or not.

        System.out.println("Please love me more");
    }
}
