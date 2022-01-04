package com.revature.datatypes;

public class FlowControl {
	public void flowControl() {
		boolean myBoolean = true;
		int i = 5;
		
		if(jmyBoolean) {
			//This code runif myBoolean is true
		}else if(){
			//This code runs if myBoolean is true
			
		}else {
			//This code runs if the previous if-block did not, ie the if was false
			// This is the "catch-all" block of code that runs if no other block runs
		}
		
		while (myBoolean) {
			//This code will run indefinitely, since my Boolean will remain true
			
			//unless we do 1 of 2 things
			
			myBoolean = false;
			// OR
			break; // stops and exits a loop/block
		}
		
		//DoWhile loops always run at least onec
		do {
			//Loop code here
			
		} while (myBoolean);
		
		// Loops with a numerical requirement, eg x number of iterations, require a for-loop
		String[] names = ("Jacob", "Daniel" , "Allison"); // This is called arryy initialization and allows us to create
		// an array and populate it with data.
		String[] otherNames = new String[10];  //Old array construction requires the size to be specidified (10 here)
		
		for(int itereation = 0; iteration < names.length; ++iteration ) { // for (variable initialiization; condition to continue looping ; incrament variable
			System.out.println(names[iteration]); //names[iteration] -> element of names with index equal to the value of iteration
		
		}
		//Enhanced for-loop; runs for each element in the array, collection, etc
		for(String s : names) {
			System.out.println(s);
		}
		
		//Switch statement -> think of switchboard
		String name = names[0];
		switch() {
		case "Jacob":
			System.out.println("Wow its Jacob!");
			//jacob();
			//break;
			
			//if there is no break, the switch statement will "fall through" to the next case
			
		case "Daniel":
			System.out.println("Woah its Daiel!");
			//daniels();
			break;
			
		default:
			//code for when no applicable case was found; think error handling
			//Not required
			System.out.println("Oh no, no other case was found!");
		
		}
	}

}
