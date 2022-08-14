/* Author: Malcolm Gilbert 
 * Date: 03/13/22
 * Assignment: Abstracts and interfaces 
 * Purpose: 
 * Use encapsulation and related setters and getters for the inventory ID number. 
 * Create an interface (printItem) that is implemented in each subclass.  
 * The method will print all the fields of an object. 
 * For this assignment, do not use an overridden toString. 
 * Access the elements and provide labels using direct attribute access.
 */
package business_supply_inventory;

public class Electric extends business_supply_inventory {
	
	//static method in an abstract class 
	 //public static void main(String[] args) {
		 //business_supply_inventory obj = new Electric();
	     //obj.display();
	     //System.out.print(obj.count);
	
	
	//Define class variables 
	private String model; 
	private String make;
	private int year; 
	//String newline = System.getProperty("line.separator");
	
	//Default constructor 
	Electric() {} 
	
	//overloaded constructor 
	Electric(int inventoryID, int count, int supplyLevel, int price, String myModel, String myMake, int myYear){ 
		//calling the super class 
		super(inventoryID, count, supplyLevel, price); 
		this.model = myModel; 
		this.make = myMake; 
		this.year = myYear; 
	}
	
	//public getter for private member variable 
	public String getModel() {
		return model; 
	}
	
	public String getMake() { 
		return make; 
	}
	
	public int getYear() { 
		return year; 
	}
	
	//Override the printItem interface method 
	@Override 
	public void printItem() { 
		System.out.println("Inventory ID number: " + getInventoryID());
		System.out.println("Current inventory: " + getCount());
		System.out.println("Inventory needed: " + getSupplyLevel());
		System.out.println("Current price: " + getPrice());
		System.out.println("Model: " + getModel() + " Make: " + getMake() + " Year: " + getYear());
	}
}
