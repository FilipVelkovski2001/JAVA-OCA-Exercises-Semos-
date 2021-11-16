
package ex07_3_exercise;


//1. Declare a long, using the L to indicate a long value.  Make it a 
   //  very large number (in the billions).
//2. Declare and initialize a float and a char.
//3. Print the long variable with a suitable label.
//4. Assign the long to the int variable.  Correct the syntax error
 //    by casting the long as an int.
//. Print the int variable.  Note the change in value when you run it.

public class ShoppingCart {
    public static void main(String[] args){
        int int1;
        
	//  Declare and initialize variables of type long, float, and char.
        long n1 = 1000000000L;
        float n2 = 9321451F;
        char c1 = 'F';
        int n3;
        // Print the long variable.
        
        System.out.println(n1);

	// Assign the long to the int and print the int variable.
       n3 = (int) n1;
       System.out.println(n3);
        
        
    }
}
