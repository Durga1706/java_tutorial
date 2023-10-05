import java.util.Scanner;

public class Input{

    public static void main(String[] args){
    
      Scanner sc=new Scanner(System.in);
      
        //Enter your name
        String name=sc.nextLine();
        
        // Enter your age
        int age=sc.nextInt();
        
        //sc.nextLine();
        
        // Enter your college name
        String col_name=sc.nextLine();
        
        System.out.println("Hello "+name+" You are "+age+" years old "+" Your college name is "+col_name);
        // output Hello Durga You are 24 years old  Your college name is
        
        // Use nextLine() 

        sc.nextLine();
        // Enter your college name
        System.out.println("Enter college name ");
        String coll_name=sc.nextLine();
        System.out.println("Hello "+name+" You are "+age+" years old "+" Your college name is "+coll_name);
        // output is Hello durga You are 24 years old  Your college name is vit-ap
    }
  
}


