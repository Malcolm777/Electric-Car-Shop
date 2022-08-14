package business_supply_inventory;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class MyBusiness extends BusinessTest {
	        public static void main(String[] args) {
	                // Create an instance of ArrayList
	                ArrayList<business_supply_inventory> myCars = new ArrayList<>();
	                String inputFile = "cars.txt";
	                String outputfile = "myCarsOutput.txt";

	       
	                    try {
	                //load in new file 
	                      File myObj = new File("/Users/malcolmgilbert/desktop/cars.txt");
	                //read and create the file i/o object 
	                      Scanner myReader = new Scanner(myObj);
	                //while there are lines, read in next line 
	                      while (myReader.hasNextLine()) {
	                //setting the next line as a var 
	                        String data = myReader.nextLine();
	                        System.out.println("The brand file has been created! ");
	                      }
	                //catch method with exception type 
	                      myReader.close();
	                    } catch (FileNotFoundException e) {
	                      System.out.println("An error occurred.");
	                    }
	                  }
	                }



