package Test;

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Type how much you love supriti");
        int a= sc.nextInt();
        int i=0;
        while(i < a){
            System.out.println(i+"-I love you supriti");
            if(i==69){
                System.out.println("Do with me");
                
            }
            i++;  
        }

        System.out.println("Please love me more");
    }
}
