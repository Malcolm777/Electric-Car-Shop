package business_supply_inventory;
import java.io.*; 
import java.util.*; 

class City implements Comparable<City>{ 
	String name; 
	String country;
	
	City(String myName, String myCountry) { 
		this.name = myName; 
		this.country = myCountry; 
	}
	
	// Override the compareTo() method
    public int compareTo(City c)
    {
        return name.compareTo(c.name);
    }
    
    public String toString() { 
    	return super.toString() + " MyToStringMethod";
    }
}


public class supply_sets {
	public static void main(String[] args) {
		//create the hashset
		HashSet<City> cities = new HashSet<City>(); 
		
		//Creating cities 
		City c1 = new City("Miami", "United States"); 
		City c2 = new City("Amsterdam", "Netherlands");
		City c3 = new City("Tokyo", "Japan");
		City c4 = new City("Madrid", "Spain");
		City c5 = new City("Los Angeles", "United States");
		
		
		//add arrayList
		cities.add(c1); 
		cities.add(c2);
		cities.add(c3);
		
		
		//traversing hashSet 
		  for(City c: cities){  
			    System.out.println(c.name+", "+c.country+" ");
		  } 
		  System.out.println();
		  
		//add new hashSet 
		//create new cities 
		HashSet<City> cities2 = new HashSet<City>(); 
		cities2.add(c1); 
		cities2.add(c2);
		cities2.add(c3);
		cities2.add(c4);
		cities2.add(c5);
		  
		//addAll method 
		cities.addAll(cities2);
		
		
		//traverse through cities set to display 
		for(City c: cities){  
		    System.out.println(c.name+", "+c.country+" "); 
		} 
		System.out.println();
		
		
		//contains() 
		System.out.println("Does the cities HashSet contain Tokyo? " + cities.contains(c3));
		System.out.println();
		
		//containsAll() 
		System.out.println("Does cities set contain the cities2 set? " + cities.containsAll(cities2));
		System.out.println();
		
		
		
	
		//equals() 
		//comparing first set to another using equals method 
		boolean value = cities.equals(cities2);
		
		//print the value 
		System.out.println("Are both the cities sets the same? " + value);
		System.out.println();
		
		
		//iterator() 
		//create an iterator 
		Iterator<City> iteratorVal = cities.iterator(); 
		System.out.println("Traversing over set using iterator: ");
		while (iteratorVal.hasNext()) { 
			System.out.println(iteratorVal.next());
		}
		System.out.println();
		
		//remove() 
		System.out.println("Cities before deleting one city: ");
		for(City c: cities){  
		    System.out.println(c.name+", "+c.country+" "); 
		} 
		System.out.println();
		
		System.out.println("Cities after deleting one city: ");
		cities.remove(c3);
		for(City c: cities){  
		    System.out.println(c.name+", "+c.country+" "); 
		} 
		System.out.println();

		//removeAll() 
		cities.add(c3);
		System.out.println("Cities before removing all cities: ");
		for(City c: cities){  
		    System.out.println(c.name+", "+c.country+" "); 
		} 
		System.out.println();
		
		System.out.println("Cities after removing all cities: ");
		cities.removeAll(cities);
		for(City c: cities){  
		    System.out.println(c.name+", "+c.country+" "); 
		} 
		System.out.println();
		
		
	
		//adding the removed back 
		cities.addAll(cities2);
		
		
		//retainAll() 
		//before applying method to all print lists 
		System.out.println("Before applying retainAll method: ");
		for(City c: cities){  
		    System.out.println(c.name+", "+c.country+" "); 
		} 
		System.out.println();
		
		cities2.remove(c2);
		cities2.retainAll(cities);
		System.out.println();
		
		
		System.out.println("After applying retainAll method: ");
		for(City c: cities2){  
		    System.out.println(c.name+", "+c.country+" "); 
		} 
		System.out.println();
		
		//size() 
		System.out.println("The size of the set is " + cities2.size());
		System.out.println();
		
		
		
		
		
		//Original hashSet 
		cities.addAll(cities);
		for(City c: cities) { 
			System.out.println(c.name + ", " + c.country);
		}
		System.out.println();
		

		//clear()
		System.out.println("Initial set: ");
		
		
		for(City c: cities){  
		    System.out.println(c.name+", "+c.country+" "); 
		} 
		System.out.println();
	
		cities.clear();
		cities2.clear();
		System.out.println("Final set: ");
		System.out.println();
		
		
		//linkedHashSet and TreeSet 
		//linkedHashSet is ordered 
		LinkedHashSet<City> linkedHash = new LinkedHashSet<City>();
		linkedHash.add(c2);
		linkedHash.add(c1);
		System.out.println("LinkedHashSet (unordered): ");
		for(City c: linkedHash) { 
			System.out.println(c.name + ", " + c.country);
		}
		System.out.println();
		
		
		//TreeSet cannot take in the City object
		TreeSet<City> newTree = new TreeSet<City>(); 
		
		newTree.add(c3);
		newTree.add(c5);
		newTree.add(c4);
		newTree.add(c2);
		newTree.add(c1);
		
		System.out.println("Tree Set (ordered): "); 
		
		
		for(City c: newTree) { 
		System.out.println(c.name + ", " + c.country);
		}
		//System.out.println("Tree Set: " + newTree);
		
		}
		
	
	
		
	}

//