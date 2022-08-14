/* Author: Malcolm Gilbert 
 * Date: 03/13/22
 * Assignment: Abstracts and interfaces 
 * Purpose: 
 * Use the inventory classes from your previous assignment, 
 * but change the super class to an abstract class. 
*/

package business_supply_inventory;
import java.util.*; 


//super class 
public abstract class business_supply_inventory implements BusinessInterface {
	//declare variables
	private int inventoryID; //unique number for each product 
	private int count; //number of items 
	private int supplyLevel; //how many need to be kept in stock 
	private int price; //price of product
	//String newline = System.getProperty("line.separator");
	

	
	//static int variable for total number of objects in inventory 
	private static int numberOfObjects = 100; //number of items 
	
	
	//default constructor 
	public business_supply_inventory () {} 
	
	//overloaded constructor 
	public business_supply_inventory (int myInventoryID, int myCount, int mySupplyLevel, int myPrice) {
		//number is called every time object is instantiated 
		numberOfObjects++;
		this.inventoryID = myInventoryID; 
		this.count = myCount; 	
		this.supplyLevel = mySupplyLevel; 
		this.price = myPrice; 
	} 
	
	
		       //public getters for private data member
				public int getInventoryID() { 
					return inventoryID; 
				}
				
				public int getCount() { 
					return count; 
				} 
				
				public int getSupplyLevel() { 
					return supplyLevel; 
				} 
				
				public int getPrice() { 
					return price; 
				}
				
			    // Public method to get private member number of objects
			    public static int getNumberOfObjects(){
			        return numberOfObjects;
			    }
			}
				

		        
	
	//override the toString method to print out the object 
	//public String toString() { 
	//	return "#items:" + this.count + " StockSupplyNeeded:" + this.supplyLevel + " Price($):" + this.price; 
	//}
	
	//

