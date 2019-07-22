import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		//Program startup TODO proper intro
		System.out.println("Hello welcome to war simulator");
		
	
		//creating a new object for the Armies class
		//currently only two can be implemented
		//TODO make this a for statement so that multiple armies can be created
		Armies Army1 = new Armies();
		Armies Army2 = new Armies();
		
		System.out.println("Please enter the name for army");
		Army1.setArmyName(scan.next());
		System.out.println("please enter troop number");
		Army1.setTroopNumber(scan.nextLong());
		
		System.out.println("please enter name for army 2");
		Army2.setArmyName(scan.next());
		System.out.println("please enter troop number");
		Army2.setTroopNumber(scan.nextLong());
		
		
		Army1.printArmyName();
		Army1.printTroopNumber();
		Army2.printArmyName();
		Army2.printTroopNumber();
	
	
			
		
	}
}
		


