


public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        item1.setItemFields("Shirt", 5, 15.0, ' ');
        if(item1.color <= 0) {
        	System.out.println("Invalid color code!");
        }else {
        	item1.displayItem();
        }
        
        
       
        

    }
    
}
