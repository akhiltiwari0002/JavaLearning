package Test;
public class newloop {
    public static void main(String[] args) {
        int b[] ={10,20,19,10,7,5,3,2};
        ak.max(b);
        
        
    }
}

class ak{
    static void max(int a[]){

        int max= a[0]; // max=10

        for(int i=0; i<a.length;i++){
            if(max<a[i]){//a[0],a[1],a[2],a[3]
                max=a[i];
            }
        }

        System.out.println("max value is :-    "+max);
        

    }
}
