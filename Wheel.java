//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 6 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken
//import random class 
import java.util.Random;

//Wheel Class contains Wheel constructor and spin method
public class Wheel {
	
	//simple attributes
	private Random rand = new Random();
	private String[] values = new String[4];
	
	//Wheel constructor contains a String Array of all 4 possible names
	Wheel() {
		values[0] = ("Mickey");
		values[1] = ("Minnie");
		values[2] = ("Donald");
		values[3] = ("Daisy");
		
	}//end wheel constructor
	
	// public method Spin returns one of the 4 Strings in Wheels using random number of 0-4
	public String spin() {
		return values[rand.nextInt(4)];
		
	}//end spin
	

}//end wheel class
