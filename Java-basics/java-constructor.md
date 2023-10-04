## Constructors in Java
In java constructor is a block of codes similar to the method. It is called when an instance of the class is created.

It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.

### Rules defined for the constructor.

1. Constructor name must be the same as its class name
2. A Constructor must have no explicit return type
3. A Java constructor cannot be abstract, static, final, and synchronized

### Types of Java constructors

1. Default constructor (no-arg constructor)
2. Parameterized constructor

1. Default constructor
   class Student{
      Student(){
          System.out.println("Student class is created");
       }
    }
   public class constructor{
      Student s1=new Student(1, "Durga");
   }
   
2. Parameterized constructor
   class Student{
      Student(int id,String name){
          System.out.println("Hello "+name+" your id is "+id);
       }
    }
   public class constructor{
      Student s1=new Student(1, "Durga");
   }

   ### Constructor Overloading
   It is a technique of having more than one constructor with different parameter lists.
   
   class Student{  
      int id,age;  
      String name;  

      //creating two arg constructor  
      Student(int i,String n){  
        id = i;  
        name = n;  
      }
   
      //creating three arg constructor  
      Student5(int i,String n,int a){  
        id = i;  
        name = n;  
        age=a;  
      }  
    void display(){System.out.println(id+" "+name+" "+age);
   }  
   
    public static void main(String args[]){  
    Student s1 = new Student(1,"Durga");  
    Student s2 = new Student(2,"Prasad",24);  
    s1.display();  
    s2.display();  
   }  
}  
   
