package Test;

import java.util.Scanner;

public class Increment {
    public static void main(String args[]){
        // Operator ++ ,--

        // This has two types
        // 1. pre increment and pre decrement
        // 2. post increment and post decrement

        // int k=0;
        // System.out.println(--k);  
        // System.out.println(k--);//  k me store hogi value but print old value hogi jo ki pehle thiS
        // System.out.println(k);



        // Relational  Opertors - 

        // < ,> <=, >= , ==, != ,


        // relation opertaor always used comparison and it return true or false .


        Scanner sc = new Scanner(System.in);

        System.out.println("input your first value.");
        int a = sc.nextInt();
        System.out.println("input your second value.");
        int b = sc.nextInt();


     String s=(a > b) ? "a is greater": "b is greater";


     int c = a>b ? 15 : 20;
    //  String result= (condition) ?  true : false   ternary operator --- purpose to avoid if else block.  

     System.out.println(s);

     System.out.println(c);





        // System.out.println("input your third value.");
        // int c = sc.nextInt();

        
        // if(a==b){
        //     System.out.println("wow! You hacked my heart.");
        // }else if(a>b){
        //     System.out.println("A is big than B- "+a +"and"+b);
        // }
        // else if(a<b){
        //     System.out.println("B is big than A- "+a +"and"+b);
        // }
        // else{
        //     System.out.println("Fuck you.");
        // }



        // Logical operator- && ,||, !

        // These operator will work on true and false

        // && if all condition of if block is true then inside if block code will be executed , if any of result is false then it will not go inside the if block.


        // && , || return true or false
        // a=1,b=2,c=3

                     //F
                //F                     

// Use ful code 

// Table se akhil name ka employee search kiya aur mujhe koi employee nahi mila 
// output will be false

// if (!output){
    // create new employee with this name
// }
        if(!(a==b) || (a++ > b++))
        {
            System.out.println(" if block Here is value of a and b is: "+ a +" and "+ b);
        }
        else{
            System.out.println(" else block Here is value of a and b is: "+ a +" and "+ b++);
        }

        // if(true && true && true && true){
        // // Now this code will be executed.
        // }








        // =        This is not relational operator , it is a assignment operator

        // int a =1;
        // int b;

        // b=a;  // right value copies to the left side variable .
        // System.out.println("B value is ="+b);





    }

    //  -2,-1,0,1,2
    
}
