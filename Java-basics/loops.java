class Main {
  public static void main(String[] args) {

    // for loop
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};

   // iterating through an array using a for loop
   for (int i = 0; i < vowels.length; ++ i) 
     System.out.print(vowels[i]+" ");
   
    
    int[] numbers = {3, 9, 5, -5};
    
    // for each loop 

    // iterating through an array using the for-each loop
   for (char item: vowels) 
     System.out.print(item+" ");
     
    for (int number: numbers) 
      System.out.print(number+" ");
    
  }
}
