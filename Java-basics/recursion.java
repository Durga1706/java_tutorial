import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        
        // --- sum of n natural
        // int sum=rec_sum(n);
        // System.out.println("The sum of "+n+" numbers is "+sum);
        
        // --- factorial
        // int fact=rec_fact(n);
        // System.out.println("The factorial of "+n+" is "+fact);
        
        // --- fibonacci
        // for(int i=0;i<n;i++){
        //     System.out.print(rec_fib(i)+" ");
        // }
        
        // --- HCF
        System.out.print("Enter a: ");  int a=sc.nextInt();
        System.out.print("Enter b: ");  int b=sc.nextInt();
        System.out.print(rec_hcf(a, b)+"\n");
        
        //System.out.print(a+" "+b+" ");
        while(b!=0){
            System.out.println("(a, b): "+"("+a+","+b+")");
            int c=a;
            a=b;
            b=c%b;
        }
    }
    
    static int rec_sum(int n){
        if(n>0)  return n+rec_sum(n-1);
        else     return 0;
    }
    
    static int rec_fact(int n){
        if(n>0)  return n*rec_fact(n-1);
        else     return 1;
    }
    
    static int rec_fib(int c){
        if(c==0) return 0;
        else if(c==1 || c==2) return 1;
        else return rec_fib(c-1)+ rec_fib(c-2);
    }
    
    static int rec_hcf(int a, int b){
        if(b!=0) return rec_hcf(b, a%b);
        else return a;
    }
}
