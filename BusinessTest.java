/* Author: Malcolm Gilbert 
 * Date: 03/13/22
 * Assignment: Abstracts and Interfaces  
 * Purpose:
 * Create at least 3 objects of each subclass 
 * and store them in an ArrayList for each type.  
 * Using a loop and your overridden printItem method, 
 * print out all the items in each ArrayList to display 
 * the entire inventory to the user.
 * */

package business_supply_inventory;

import java.util.ArrayList;

public class BusinessTest {
	public static void main(String[] args) {
		//create new ArrayList 
		ArrayList<business_supply_inventory> carItems = new ArrayList<>();
		
		//Storing Electric cars in carItems 
		carItems.add(new Electric(12345, 10, 20, 30, "S", "Tesla", 2022)); 
		carItems.add(new Electric(12345, 10, 20, 30, "3", "Tesla", 2022)); 
		carItems.add(new Electric(12345, 10, 20, 30, "X", "Tesla", 2022)); 
		
		
		//superclass object 
		//business_supply_inventory myInventory = new business_supply_inventory(218391239, 50, 30, 100);
				
		//Storing Hybrid cars in carItems
		carItems.add(new Hybrid(12345, 10, 20, 30, "Prius", "Toyota", 2022)); 
		carItems.add(new Hybrid(12345, 10, 20, 30, "Mach", "Ford", 2022)); 
		carItems.add(new Hybrid(12345, 10, 20, 30, "Kia", "Soul", 2022)); 
		
		//for loop to loop through the different items 
        for(business_supply_inventory inventory: carItems) {
            inventory.printItem();
        }
        
        System.out.println("The total number of items in the Car dealership " + business_supply_inventory.getNumberOfObjects());
	}
}