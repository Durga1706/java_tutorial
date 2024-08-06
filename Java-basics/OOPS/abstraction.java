class Main{
    public static void main(String[] args) {
        B a=new B();
        a.m1();
        a.m2();
        System.out.println(a.m3());
        
        
    }
}

abstract class Abstraction{
    public abstract void m1();            // Now I don't know wt to do at this time
    public abstract int m3();
    
    public void m2(){
        System.out.println("I am in abstract class only not in method.");
    }
}

abstract class A extends Abstraction{
    public void m1(){                    // Here I know wt to do with m1
        System.out.println("I am in not abstract method but in its imple.");
    }
}

class B extends A{
    public int m3(){                     // Here I know wt to do with m3
        return 1+3;
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------------------
// Interface:- Another way to achieve abstraction
   //  Here I am giving some path to achieve something
   // We can create instance variables but they should be final and static
   // Eg.  int a=5;(final),  we can access it without obj creation(static)

class Main{
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        System.out.println(a.m2());
        a.m3();
    }
}

interface I{
    void m1();  // by default it is public abstract
    int m2();
}

interface Inte{
    void m3();
}

class A implements I, Inte{
    // Here we have to do all the interface methods
    public void m1(){
        System.out.println("I am in interface at m1");
    }
    public int m2(){
        return 1+3;
    }
    public void m3(){
        System.out.println("Method 3");
    }
}
