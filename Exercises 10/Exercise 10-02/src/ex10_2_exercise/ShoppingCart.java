
package ex10_2_exercise;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter your name:");
    	
    	System.out.println("Enter your purchase price:");
    	
    	System.out.println("Enter your state code:");
    	
        Order order = new Order(scan.nextLine(), scan.nextDouble(), scan.next(), Order.CORP);
        System.out.println("Discount is: "+ order.getDiscount());
        
        
    }
}
