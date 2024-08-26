import java.util.*;
import java.util.stream.*;

class Streams {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(10);  l.add(20);  l.add(30);  l.add(40); 
        
        Iterator<Integer> i=l.iterator();
        int s=0;
        // while(i.hasNext()){
        //     int n=i.next();
        //     if(n>5){
        //         s+=n;
        //     }
        // }
        // System.out.println(s);
        
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);  a.add(20);  a.add(3);  a.add(1); a.add(13); 
        
        a.forEach(n->System.out.print(n+" "));
        Stream<Integer> d=a.stream();
        //d.forEach(n->System.out.print(n+" "));
    
        System.out.println();
        Stream<Integer> sort_list=d.sorted();  // d is closed now, we can't use
        //sort_list.forEach(e -> System.out.print(e+" ")); // sort_list is closed
        
        Stream<Integer> map_list=sort_list.map(e -> e*2);
        map_list.filter(n -> n%2==0 && n>15).forEach(n->System.out.print(n+" "));
        
        

        // System.out.println(a.stream().filter(p -> p>15).collect(Collectors.toList()));
        
        // System.out.println("\nAdding 5 to the arraylist elements");
        // a.forEach(n->System.out.print(n+5+" "));
        
        // System.out.println("\nAdding 5 to the arraylist elements using Stream");
        // Stream<Integer> s=a.stream();
        // s.forEach(n->System.out.print(n+5+" "));
        
        // System.out.println("\nOriginal arraylist elements");
        // a.forEach(n->System.out.print(n+" "));
    }
}
