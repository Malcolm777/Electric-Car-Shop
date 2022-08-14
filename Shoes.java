/* Author: Malcolm Gilbert 
 * Date: 02/20/22
 * Assignment: Inheritance - shoes 
 * Purpose: Program will print out each list 
 * to document the inventory for the buyer 
 * so they can re-order supplies that are low
*/


package business_supply_inventory;

public class Shoes extends business_supply_inventory {
	//declare variables 
	int size; 
	String brand; 
	String texture; 
	String newline = System.getProperty("line.separator");
	
	//default constructor 
	Shoes() {} 
	
	//overloaded constructor 
	Shoes(int inventoryID, int count, int supplyLevel, int price, int mySize, String myBrand, String myTexture){ 
		//calling the super class
		super(inventoryID, count, supplyLevel, price);
		this.size = mySize; 
		this.brand = myBrand; 
		this.texture = myTexture;
		
	}
	
	//toString method 
	public String toString() { 
		return "Supply needed: " + this.supplyLevel + newline +  "Shoe brand: " + this.brand + newline + "Shoe size: " + this.size + newline + "Shoe texture: " + this.texture ;
	}
	
}
