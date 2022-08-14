package business_supply_inventory;	
		
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.*; 
import java.io.*; 

public class BusinessWriter extends BusinessTest {
	public static void main(String args[]) throws IOException{
		File file = new File("/Users/malcolmgilbert/desktop/cars.txt");
			try {
				//print writer to write the file 
				PrintWriter out = new PrintWriter(file); 
			            
				out.println(myElectric);
			    out.println(myHybrid);
			        
			    out.close();
			    } catch (IOException e) { 
			    	e.printStackTrace();
			    }
	}
}   
			    
			
	//printWriter to print out to file 
	//write subclass objects into file 
      