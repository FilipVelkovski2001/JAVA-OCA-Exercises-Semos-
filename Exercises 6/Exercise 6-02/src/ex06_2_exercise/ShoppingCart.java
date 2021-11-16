
package ex06_2_exercise;

public class ShoppingCart {

     public static void main(String args[]) {
        // Declare and initialize 2 Item objects
    	 Item item1 = new Item();
    	 
    	 item1.desc = "Belt";
    	 
    	 Item item2 = new Item();
    	 
    	 item2.desc = "Jeans";
    	 
         item2.desc = item1.desc;
	

	// Print both item descriptions and run code.
    	 System.out.println(item1.desc);
    	 System.out.println(item2.desc);


	// Assign one item to another and run it again.

     }
 
} 
