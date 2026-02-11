package test2;

public class akhil{
    public static void main(String[] args){
        int a=3;
       
                 
        int b =0;
        //                 
        if((b++ < a--) && (++b < a--)){
            System.out.println("Hello in the if block");
            System.err.println("a="+a +"and b="+b);
        }else{
            System.out.println("hello in else block");
            System.err.println("a="+a +"and b="+b);

        }

    }

    
}
