
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 20.0;
        double tax = 1.5;
        int quantity = 1;
        double total;
        total = price * quantity * tax;
        
        // Modify message to include quantity 
        String message = custName+" wants to purchase "  +quantity +itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        System.out.println("Total cost is: "+ total);

        
    }    
}
