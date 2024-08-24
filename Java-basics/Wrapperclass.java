import java.util.ArrayList;
class HelloWorld {
    public static void main(String[] args) {
        HelloWorld h=new HelloWorld();
        //Integer i=new Integer(10);  // boxing:- wraaping a pre-defined data type in a class
        //System.out.println(i);
        
        // As Integer(n) is depricated 
        Integer i1=Integer.valueOf(12); 
        //Since 'valueOf' is a static mtd call it with its class name
        System.out.println(i1);
        
        Integer i2=50; // auto-boxing
        System.out.println(i2);
        
        int i3=i1.intValue(); //unboxing
        System.out.println(i3);
        
        int i4=i2; //auto-unboxing
        System.out.println(i4);
        
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(12);  // auto-boxing
        a1.add(Integer.valueOf(15));
        System.out.println(a1);
        
        int a=a1.get(0); // auto-unboxing
        System.out.println(a); 
        
        int b=Integer.valueOf("4");
        System.out.println(b);
        
        int c=Integer.parseInt("4"); // directly returns primitive data type
        System.out.println(c);
        
        double d=Double.parseDouble("20");
        System.out.println(d);
        
        boolean e=Boolean.parseBoolean("True");
        System.out.println(e);
        
        Integer age=Integer.valueOf("25");
        System.out.println(age);
        
        long lage=age.intValue();
        System.out.println(lage);
    }
}
