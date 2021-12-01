
package ex11_3_exercise;

public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60), 
                    new Item("WristBand",0), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    
    public void displayTotal(){
    	double total = 0;
    	for(int i = 0; i<items.length; i++) {
    		Item item = items[i];
    		if(item.isBackOrdered()) {
    			continue;
    		}
    		total += item.getPrice();
    	}
    	System.out.println("Total: "+ total);
    	
        
    }
}
