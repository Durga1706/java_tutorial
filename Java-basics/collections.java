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
        Vector<Integer> v=new Vector<>();
      ArrayList<Integer> a=new ArrayList<>();
      
      //System.out.println("Initially Vector size is: "+v.capacity());
      //System.out.println("Initially ArrayList size is: "+a.size());
      
      v.add(10);  v.add(10);  v.add(10);  v.add(10);  v.add(10); 
      v.add(10);  v.add(10);  v.add(10);  v.add(10);  v.add(10); 
      
      a.add(12);  a.add(12);  a.add(12);
      
      //System.out.println("after 10 ele Vector size is: "+v.capacity());
      //System.out.println("after 2 ele ArrayList size is: "+a.size());
      
      v.add(10);  a.add(12);
      
      //System.out.println("Initially Vector size is: "+v.capacity());
      //System.out.println("Initially ArrayList size is: "+a.size());
      
      //3. LinkedList
      LinkedList<String> ll=new LinkedList<>();
      ll.add("S"); ll.add("t");  ll.addFirst("A");  ll.add(1, "B");
      
      ll.set(2, "D");
      
      System.out.println("Linked list ele: "+ll);

     // new list that contains ll from last   
     LinkedList<String> l2 = new LinkedList<>();
        while (!ll.isEmpty()) {
            String t = ll.poll(); // get and remove the head

            // Check if ll is empty before accessing ll.get(0)
            if (!ll.isEmpty() && t.equals(ll.get(0))) {
                l2.offerLast(t);
            } else {
                l2.offerFirst(t);
            }
        }

        System.out.println("List 2 is: " + l2);
      
      Iterator i=ll.descendingIterator();
      
      System.out.print("Linked list ele in desc order: ");
      while(i.hasNext()){
        System.out.print(i.next()+" ");
      }
      
      System.out.println();
      
      // iterating list from spec pos
      ListIterator li=ll.listIterator(1);
      while(li.hasNext()){
        System.out.print(li.next()+" ");
      }
      
      System.out.println();
      
      // get the head
      System.out.println(ll.element());
      
      ll.remove(2); ll.remove("t");  ll.removeLast();
      System.out.println("Linked list ele: "+ll);
      
      System.out.println("Linked list contains 'A': "+ll.contains("A"));
  }
}



// ---------------------------  Stack  ---------------------------------
public class Stack {
    public static void main(String[] args) {
      Stack<Integer> s=new Stack<>();
      
      s.push(10);   s.push(20);  s.push(30);   s.push(40);  s.push(50);
      System.out.println("Stack elements are: "+s);
      
      System.out.println(s.peek()+" is the top element. ");
      s.pop();
      
      System.out.println("\nStack elements after pop one element are: "+s);
      System.out.println("40 found at pos "+s.indexOf(40)+" from beginning.");

      
      int pos=s.search(40);
      
      if(pos==-1){
        System.out.println("not found.");
      }
      else{
        System.out.println(s.get(s.size()-pos)+" found at pos "+pos+" from last.");
      }
      
      System.out.println("\nIterating Stack");
      for(int i:s){
        System.out.print(i+"->");
      }
       
      System.out.println();
      // popping elements one by one
      while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
      }
  }
}
