import java.util.Scanner;

public class Main {

public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
 
        // Math opeprations 
        System.out.println("Enter x and y values ");
        double x=sc.nextDouble();
        double y=sc.nextDouble();

        double z=Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse between x and y is "+z);

        double d=-34;
        System.out.println(Math.abs(d)); //34

        // other math operations
        Math.max(5, 10); //10
        Math.min(5, 10); //5
        Math.ceil(3.14);  //4.0
        Math.floor(3.14); //3.0

        // Random Numbers
        Math.random()  // returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        int randomNum = (int)(Math.random() * 101);  // 0 to 100

        Random r=new Random(0);
        int x1=r.nextInt(5)+1;  // between 1 and 5
        double y1=r.nextDouble();
        boolean z1=r.nextBoolean();
        System.out.println(x1);
        System.out.println(y1);

    }
}
