package package007;

import java.util.*;

/**
 * Name: Jason Salazar
 * Date: October 24, 2021 
 * Subject: CS 216 Data Structures & Algorithms 
 *
 */
public class CaveStackDemo {

	
	public static void main(String[] args) {
	    String NameCave; String LongitudeCave; String LatitudeCave;
		String Add; String Remove; String List;
		Scanner scan = new Scanner(System.in);
		
		
		
		CaveStack<Cave> CaveEntrys = new CaveStack<Cave>();
		boolean tofChecker = true; 
		while(tofChecker) {
		System.out.println("Type the name of the cave being added.");
		NameCave = scan.next();
			
		System.out.println("Type the longitude of the cave being added.");
		LongitudeCave = scan.next();
		
		System.out.println("Type the latitude of the cave being added.");
		LatitudeCave = scan.next();
		
		Cave cave = new Cave(NameCave, LongitudeCave, LatitudeCave);
		CaveAdded(CaveEntrys, cave);
		
		System.out.println("Do you want to add another cave? " + " \nEnter Yes or No: ");
		Add = scan.next();
		
		if (!Add.equalsIgnoreCase("Yes")) {
			tofChecker = false;
			boolean move = true;
			while (move){
				System.out.println("Do you want to remove this cave from the stack?" + "\nEnter Yes or No: ");
				Remove = scan.next();
				if (Remove.equalsIgnoreCase("Yes")) {
				CaveRemoved(CaveEntrys, cave);
				
				} else {
				move = false;
		}
		}
		}	
		}
		
		
System.out.println(" Do you want a list of the caves? " + "\nEnter Yes or No: ");
	List = scan.next();
	if (List.equalsIgnoreCase("Yes")) {
		System.out.println(" ");
		CaveList(CaveEntrys);
	}
	scan.close();
	}

	public static void CaveAdded(CaveStack CaveEntrys, Cave cave) {
		boolean tofChecker;
		tofChecker = CaveEntrys.push(cave, cave.getGPS());

		if (tofChecker) {
			System.out.println(cave.getName() + " is added to the cave stack.");		} 
	}
	
public static void CaveRemoved(CaveStack CaveEntrys, Cave cave) {
	if (CaveEntrys.isEmpty()) {
		System.out.println("Cave stack is empty. There is nothing to delete.");
	} else {
		CaveEntrys.pop();
		System.out.println("The last entry of the stack was removed.");		
}
}

public static void CaveList(CaveStack CaveEntrys) {
	if (CaveEntrys.isEmpty()) {
		System.out.println("The cave system is empty.");
	}
	while (!CaveEntrys.isEmpty()) {
		Cave caves = (Cave) CaveEntrys.pop();
		System.out.println("Name: " + caves.getName());
		System.out.println("Latitide: " + caves.getLatitude());
		System.out.println("Longitude: " + caves.getLongitude());

}
}
}