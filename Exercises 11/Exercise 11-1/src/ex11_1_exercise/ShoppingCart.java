package ex11_1_exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class ShoppingCart {
    public static void main(String[] args){
	
    	LocalDateTime orderDate = LocalDateTime.now();
    			
        
	
    	System.out.println("Standard time format:" + orderDate);


	
    	String formatedDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    	System.out.println("American time format: "+ formatedDate);


    }
}