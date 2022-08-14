/* Author: Malcolm Gilbert 
 * Date: 02/20/22
 * Assignment: Inheritance - shoes 
 * Purpose: Program will print out each list 
 * to document the inventory for the buyer 
 * so they can re-order supplies that are low
*/


package business_supply_inventory;

public class Nio extends business_supply_inventory {
	//declare variables 
	 
	String model; 
	String make; 
	int year; 
	String newline = System.getProperty("line.separator");
	
	//default constructor 
	Nio() {} 
	
	//overloaded constructor 
	Nio(int inventoryID, int count, int supplyLevel, int price, String myModel, String myMake, int myYear){ 
		//calling the super class
		super(inventoryID, count, supplyLevel, price);
		this.model = myModel; 
		this.make = myMake; 
		this.year = myYear;
		
	}
	
	//toString method 
	public String toString() { 
		return "Supply needed: " + this.supplyLevel + newline +  "Model: " + this.model + newline + "Make: " + this.make + newline + "Year: " + this.year;
	}
	
}
