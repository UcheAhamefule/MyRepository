package com.revature.datatypes;

public class Driver {
	public static void main(String[] args) {
		
		// instanciating a new DataTypes object.
		DataTypes dt = new DataTypes(); //Reference variable
		// The new keyword requests a block memory of DataTypes size to store the object in, and returns the memory address. 
		//This address is stored 
		// The final word, DataTypes(), says to run the constructor immediately on creation
		
		System.out.println(dt.add(1, 2));
		
		int answer = dt.add(1,  2); //Primitive variable
		System.out.println(answer);
		
		Dog felix = new Dog(), henry = new Dog(), patty = new Dog();
		
		felix.name= "Felix";
		felix.age = 2;
		felix.weight = 106.5;
		felix.breed = "German Shephard";
		
		dt.printDogName(felix);
	}

}
