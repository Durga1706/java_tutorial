import java.util.Scanner;
import java.util.Arrays;

public class Main {
public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        // String functions

        //1. 
       String s1,s2;
       s1="Hello";
       s2="World";
       
       // 1. join strings
       System.out.print(s1+" "+s2+"!");

       // 2. length
       s1.length();

        // 3. character at the specified index
        s1.charAt(1);  // e

        // 4. substring
       String sub="Programming".substring(3, 7);  // from 3 to 7(exclude)
       System.out.println(sub);  // "gram"

        // 5. indexOf: the index of the first occurrence
        String str="Hello, World";
        str.indexOf("World"); // index is 7

        // 6. upper and lower case
        str.toUpperCase(); // upper is "HELLO, WORLD" 
        str.toLowerCase(); // lower is "hello, world"

        // 7. trim 
        String s="  Durga ";
        s.trim()'  // "Durga"

        // 8. replace, replaceAll(), replaceFirst()
        String s="apple";
        s.replace("a","A");

        String str1 = "aabbaaac";
        str1.replaceAll("aa", "zz")); // zzbbzzac
        str1.replaceFirst("aa", "zz"); // zzbbaaac

        // 9. split
       String s3="a p p l e";
       String [] words=s3.split(" ");
       System.out.println(Arrays.toString(words));  // [a, p, p, l, e]
        
        // 10. startswith, endswith
        String str = "Hello, World!";
        boolean starts = str.startsWith("Hello"); // true
        boolean ends = str.endsWith("World!");    // true

        // 11. string to int
        String str = "123";
        int number = Integer.parseInt(str); // 123

        // 12. contains:  whether the specified string (sequence of characters) is present in the string or not
        String s1= "Hello world";
        boolean res1=s1.contains("ell");  // true
        boolean res2=s1.contains("");  // true

        // 13. join
        String res= String.join("-", "Java", "is", "fun");  // Java-is-fun

        // 14. compare strings
        String str1 = "Hello";
        String str2 = "hello";

        boolean is_equal= str1.equals(str2);  // false
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true

        String str1 = "Learn Java";
        String str2 = "Learn Kolin";
        
         // compareTo: compare two strings lexicographically (in the dictionary order)
        str1.compareTo(str2);  // -1  ; negative because str2 comes after str1
        str2.compareTo(str1);  // 1   ; positive because str1 comes after str2

        // compareToIgnoreCase
        String str1 = "Learn Java";
        String str2 = "learn java";
        
        str1.compareToIgnoreCase(str2); // 0


        
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
