

public class Item {
    char color;
    
    public String desc;
    public int quantity;
    public double price;
    
    // Declare and code the setColor method.

    public boolean setColor(char colorCode){
        if (colorCode == ' '){
            return false;
        }
        else {
            this.color = colorCode;
            return true;
        }
          
    }
    
    public void setItemFields(String desc, int quantity, double price) {
    	
    	this.desc = desc;
    	this.quantity = quantity;
    	this.price = price;
    	
    }
    
 public int setItemFields(String desc, int quantity, double price, char color) {
    	
    	
    	
    	if(color == ' ') {
    		return -1;
    	}
    	else {
    		this.color = color;
    		setItemFields(desc, quantity, price);
    	}
		return color;
    }
 
 public void displayItem() {

	 System.out.println(this.desc);
	 System.out.println(this.quantity);
	 System.out.println(this.price);
	 System.out.println(this.color);
 }
 
    
}
