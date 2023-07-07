//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 6 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken
//MoneyHandler class contains MoneyHandler constructor as well as methods add, deduct, getBalance, setBalance, dispense, and toString
public class MoneyHandler {
	
	private double balance;

	//constructor initializes balance to 0
	public MoneyHandler(){
		balance = 0; 
		
	}//end money Handler
	
	// add method adds the double parameter passed in to the value of balance
	public void add(double d){
		balance += d;
		
	}//end add
	
	// deduct method subtract the double parameter passed in to the value of balance
	public void deduct(double d) {
		balance -= d;
	}//end deduct
	
	//getBalance method returns the current balance 
	public double getBalance() {
		return balance;
	}//end getBalance
	
	//setBalance method sets the current balance
	public void setBalance(double d){
		balance = d;	
	}//end setBalance
	
	//dispense method prints out all the balance and then sets the balance variable to 0
	public void dispense() {
		System.out.println("Dispensed $  " + balance);
		balance = 0;
	}
	
	//toString method returns the String containing the current Balance
	public String toString() {
		return "You have a $ " + balance + " balance";
	}//end toString
}//endMoneyHandler Class
