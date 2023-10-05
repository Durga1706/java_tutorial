public class Conditions {

    public static void main(String[] args){
    
       // conditions
        int age = 20;

        // if 
        
        if (age < 18) {
        System.out.println("You are not eligibel for vote.");
        }
        
        // if else
        
        if (age < 18) {
        System.out.println("You are not eligibel for vote.");
        } else {
        System.out.println("You are eligibel for vote.");
        }

        //else if
        
        int a=5,b=5,c=6;
        if(a>b){
            System.out.println("a is big.");
        }else if(a<b){
            System.out.println("b is big.");
        }else{
            System.out.println("both a and b are equal.");
        }
        
        // nested if else
        
        if(a>b){
            if(a>c){
                System.out.println("a is big.");
            }else{
                System.out.println("c is big.");
            }
        }else{
            if(b>c){
                System.out.println("b is big.");
            }else{
                System.out.println("c is bog.");
            }
        }

        // ternary operator
        System.out.println((a>b)?a:b);

        // switch
            age = 65;	   
		    switch (age)
		    {
		    	case (16):	    	
		    		System.out.println("You are under 18.");
		    		break;
		    	case (18):		    	
		    		System.out.println("You are eligible for vote.");
		    		break;
		    	case (65):		    	
		    		System.out.println("You are senior citizen.");
		    		break;
		    	default:
		    		System.out.println("Please give the valid age.");
		    		break;
		    }		    
	    }
}
