/* Author: Malcolm Gilbert 
 * Date: 02/20/22
 * Assignment: Inheritance - Shirts 
 * Purpose: Program will print out each list 
 * to document the inventory for the buyer 
 * so they can re-order supplies that are low
*/

package business_supply_inventory;

public class Shirts extends business_supply_inventory {
	//Define class variables 
	String size; 
	String color;
	String material; 
	String newline = System.getProperty("line.separator");
	
	//Default constructor 
	Shirts() {} 
	
	//overloaded constructor 
	Shirts(int inventoryID, int count, int supplyLevel, int price, String mySize, String myColor, String myMaterial){ 
		//calling the super class 
		super(inventoryID, count, supplyLevel, price); 
		this.size = mySize; 
		this.color = myColor; 
		this.material = myMaterial; 
	}
	
	//String toString() 
	public String toString() { 
		return "Supply needed: " + this.supplyLevel + newline + "Shirt size: " + this.size + newline + "Shirt color: " + this.color + newline + "Shirt material: " + this.material; 
	}
}
