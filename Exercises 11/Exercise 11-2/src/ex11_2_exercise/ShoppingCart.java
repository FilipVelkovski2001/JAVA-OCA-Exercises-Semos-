
package ex11_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.  
	// Print an error message if fewer than 2 args are passed in.
        if (args.length < 2) {
        	System.out.println("Please enter two arguements!");
        }
        else {
        	name = args[0];
        	age = Integer.parseInt(args[1]);
        	System.out.println("Name :" + args[0]);
        	System.out.println("Age :" + args[1]);
        }
        
    }
}
