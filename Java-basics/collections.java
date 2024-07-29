import java.util.*;

public class Main {
    public static void main(String[] args) {
      // collections
       // A Collection in Java is an object which represents a group of objects
       
      
      // List interface
        // 1. ArrayList
        // 2. LinkedList
        // 3. Vector
        
      // 1. ArrayList:- Dynamic Array
      
        // Creating String ArrayList
        ArrayList<String> s1=new ArrayList<>();
        s1.add("Durga");
        s1.add("Prasad");
        s1.add(0, "Ataluri");
        
        //System.out.println("ArrayList s1 is " + s1);
        
        // get elements and set
        //System.out.println("fir posi of s1 is " + s1.get(0));
        s1.set(0, "Attaluri");
        //System.out.println("s1 after set 1st pos is " + s1);
        
        // initalize arraylist with 'aslist'
        ArrayList<String> s2=new ArrayList<>(
          Arrays.asList("I", "am", "25", "years", "old")
          );
          
        //System.out.println("ArrayList s2 is "+s2);
        
        System.out.println("ArrayList s2 contains 'I' "+s2.contains("i".toUpperCase()));
        
        s2.add(".");
        //System.out.println("ArrayList s2 is "+s2);
        
        Collections.sort(s2);
        for(String i: s2){
           //System.out.print(i+", ");
        }
       
        //System.out.println();
        s2.remove(s2.size()-1);
        //System.out.println("ArrayList s2 is "+s2);
        
        
        //2. Vector
  }
}
