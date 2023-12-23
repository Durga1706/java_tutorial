// List of items of the same type

// Defining an array
  // type[] arr_name= new type[size];  'new' is a keyword used to take space in memory
    int[] marks= new int[3];

import java.util.Scanner;
import java.lang.Math;

class Main {
 public static void main(String[] args) {
  
   // create an array
   int[] age = {12, 4, 5, 2, 5};

   // access each array elements
   System.out.println("First Element: " + age[0]);

   String v[]={"a","e", "i", "o","u"};
   System.out.println(v[0]);

   for(String c: v)
      System.out.print(c);
        

   // to make dynamic changes use 'new'
   int nums[]= new int[4];   // here all the values are 0

   // Multi Dimensional Array: an array of arrays
      // [ [], [], ]

   // array initialization of having 4 elements each in 3 internal arrays i.e [ [1,2,3,4], [2,3,4,5], [5,6,7,8] ]
   int a[][]= new int[3][4];

   Scanner sc= new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        
        int a[][]= new int[m][n];
        
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=(int) (Math.random() * 10); // Generates a random number from 0 to 9
                System.out.print(a[i][j]+ " ");     // Print each element followed by a space
            }
          System.out.println();   // Move to the next line
        }

       // Accessing all the elements in an mxn structured way
       for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
           System.out.println();
        }

     System.out.println("Accessing internal arrays at a time ");
        for(int i[]: a){
            for(int j: i){
                System.out.print(j+" ");
            }
           System.out.println();
        }
   
 }
}



import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();

        int a[][] = new int[m][n];

        // Generate and print array elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " "); // Print each element followed by a space
            }
            System.out.println(); // Move to the next line after printing all elements in a row
        }

        // Access and print array elements in a structured way
        System.out.println("Accessing array elements ");
        //System.out.println("a[0][1]: " + a[0][1]);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

