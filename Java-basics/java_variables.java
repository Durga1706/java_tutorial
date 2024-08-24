// Data types specifies the different values that can be stored in variables.
  //   Primitive:- binary, byte, char, double, float, int, long, short - these are predefined by the language
  //   Non-primitive:- arrays, classes, interfaces  -user defined

   // Java is not a fully oop because of primitive data type since they are not objects
   // because of  primitive data types java memory consumption(as they occupy a fixed amount of memory space) is very less and performance is also high
public class variables {
    char gender='m';
    boolean isMarried=false;

    public static void main(String[] args){
        String name="Durga";
        int age=24;
        float salary=50000f;
        System.out.println("My name is "+name+" I am "+age+" years old and my salary is "+salary);

        int myNum=5;
        myNum = 15;
        final int num=5;
        //num=10; //cannot assign a value to final variable num
        System.out.println(myNum);

        //swap two variables
        String x="Durga";
        String y="Prasad";
        System.out.println("before swapping x= "+x);
        System.out.println("before swapping y= "+y);

        String temp;
        temp=x;
        x=y;
        y=temp;

        System.out.println("after swapping x= "+x);
        System.out.println("after swapping y= "+y);
    }
}

// types of data types
/*
   1. fixed size data type(primitive data types)  :- integer(byte,short, int, long), char, boolean, float, double
   2. varying size data type(no limit) :- String, Array, Class, Oject, Interface, enumeration
 * 
 */

