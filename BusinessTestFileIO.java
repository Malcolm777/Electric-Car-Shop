/*package business_supply_inventory;
/* Author: Malcolm Gilbert 
 * Date: 02/20/22
 * Assignment: Inheritance - Main  
 * Purpose: Program will print out each list 
 * to document the inventory for the buyer 
 * so they can re-order supplies that are low
*/
/*
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class BusinessTestFileIO {

		public static void main(String[] args) throws IOException {
			//create new ArrayList 
			ArrayList<business_supply_inventory> myCars = new ArrayList<business_supply_inventory>();
			ArrayList<business_supply_inventory> myCars2 = new ArrayList<business_supply_inventory>();
			ArrayList<business_supply_inventory> myCars3 = new ArrayList<business_supply_inventory>();
			
			//superclass object 
			business_supply_inventory myInventory = new business_supply_inventory(218391239, 50, 30, 100);
			
			//subclass objects 
			Electric myElectric = new Electric(10, 90, 10, 2, "3", "Tesla", 2020);
			Hybrid myHybrid = new Hybrid(01234, 10, 20, 10, "Prius", "Toyota", 2005);
			
			//adding subclass objects to the array list 
			myCars.add(myInventory);
			myCars2.add(myElectric);
			myCars3.add(myHybrid);
			
			System.out.println(myCars);
			System.out.println(myCars2);
			System.out.println(myCars3);
			
		 

			//writing the subclass objects to a file 
			try {
					//create new txt file 
					File file = new File("/Users/malcolmgilbert/desktop/cars.txt");
				
					//print writer to write the file 
					PrintWriter out = new PrintWriter(file); 
						
					//read in the file with a space delimiter 		
					Scanner myScanner = new Scanner(file).useDelimiter(" "); 
					
					//printing out subclass objects
					out.println(myElectric);
					

				    //close the file 
				    out.close();
				    } catch (IOException e) { 
				    	System.out.println("Error: " + e.toString());
				    }
			
		
			//create a text file with input data for the second subclass
			//read the data in and create objects from a provided text file and store them in an arraylist 
	    // Create an instance of ArrayList
	    		
			
			
	    		try {
	    			//create new txt file 
					File file = new File("/Users/malcolmgilbert/desktop/carsObjects.txt");
				
	    			Scanner scanner = new Scanner("/Users/malcolmgilbert/desktop/carsObjects.txt");

	    			// iterate till the last line
	    			while (scanner.hasNext()) {
	                    String model = "", make = "";
	                    int year = 0;
	                    boolean validData = true;
	                   
	                    // if the data is good, create a dog object using an overloaded constructor 
	                    // store it in the arraylist
	                    if (validData) {
	                            myCars3.add(myHybrid);
	                    }
	            }
	            scanner.close();

	            // Display on the console to user
	            for (int i = 0; i < myCars3.size(); i++) {
	                    System.out.println(myCars3.get(i).toString());
	            }

	            // Write the arraylist objects to the file
	            PrintWriter PWriter = new PrintWriter("/Users/malcolmgilbert/desktop/carsObjects.txt");
	            for (int i = 0; i < myCars3.size(); i++) {
	                    PWriter.write(myCars3.get(i).getInventoryID() + " " + myCars3.get(i).getCount() + " "
	                                    + myCars3.get(i).getSupply() + " " + myCars3.get(i).getPrice());
	                 
	            }
	            PWriter.close();

	    } catch (FileNotFoundException e) {
	            System.out.println("File not found " + e);
	    }
	}
	}
		 



}
*/