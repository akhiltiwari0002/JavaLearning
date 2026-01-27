package Test;

public class supriti{
    public static void main(String[] args) {  // public class -

        // java.lang.ArrayIndexOutOfBoundsException when your array length is less means if your length is 5 and you are trying to access 6th element of the array then compiler will be you this exception.
        for(int l=0;l < args.length;l++ ){
            System.out.println("Here is words ="+args[l]); // when first then it will be args[0]    , args[1]   , args[2]
        }

        try{
            if ("supriti".equals(args[0])){
                System.out.println("Now code will be run.");
            }
            else{
                System.out.println("Something went wrong.");
            }
        }catch(Exception e)
        {
            String msg= e.getMessage();
            System.out.println("Now code is handled."+msg);
        }
        // This is entry point
        // jvm search this line in all over project 
        // it should be public because if it will not public then it is not accessable to the interpreter.
        // static - this is  static because Java is object oriented programming --- All the method or function is executed by the objects and classes   , static tells us there is no need to make object of pucblic so it is basically becomes an entry of code
        // main -- keyword -- intrepreter searches in project to start execution 

        // arguments are for command line arguments -- while calling program ypu can pass some param as default variable 
        //  akhil ak = new akhil();
        //  akhil ak1= new akhil(5, 6);

        // System.out.println("Here is breakdown of---"+args[2]);
        int c;
        c = akhil.ballu();
        System.out.println("C Value is :------"+ c);
    }


}
class akhil{
    akhil(){
        System.out.println("Hum First , Hum First");
    }// This is default constructor and you over ridden .
    akhil(int a, int b){
        int c = a+b;

            // comparison operator ---- ==, != , < ,>   (true or false)   && , || 
            // int  m = 5;
            // int n = 5; 
            // if(m == 5 && n ==6 ){ // false
            //     System.out.println("This is not  executed");
            // }
            // else if(m == 6 && n ==9){ // false 
            //     System.out.println("This is not  executed");

            // }
            // else if(m != n){  // false
            //     System.out.println("This is  executed  -- 1");
            // }
            //  else if(m == 5){ // true
            //     System.out.println("This is  executed  ---2");
            // }
            // else{
            //     System.out.println("If if block will not run then i will run surely.");
            // }

            // int o; 0,1 ,2,3,4
            for( int o = 0 ; o < 5 ; o++){ 
                System.out.println(o+"-I love You Supriti!"); 
            }
            // assignement operator -- =   a=b;   a =2 , b=3 ;  a= b;  a= 3;
                    
                    System.out.println("Sum="+ ++c);  // 11  // pre increment 

                    // c++ =post increment
                    System.out.println("Sum="+ c); // 11*   12 
                    


                }// Parametrized constructor 
        void calling(){
            System.out.println("Abki baari meri hai.");
        }


        // void is return type means it tells what the function will return 

        static int ballu(){
            int a =5;
            return  a;
        }

        
   
}


// In one file there can be multiple classes but there will be only one public class 
// public class  entire project accessable 