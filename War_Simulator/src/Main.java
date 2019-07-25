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
		
		System.out.println("Please enter the name for army 1");
		Army1.setArmyName(scan.nextLine());
		System.out.println("please enter troop number");
		Army1.setTroopNumber(scan.nextInt());
		System.out.println("----------------------------------------");
		System.out.println("please enter name for army 2");
		Army2.setArmyName(scan.nextLine());
		System.out.println("please enter troop number");
		Army2.setTroopNumber(scan.nextInt());
		
		
		System.out.println(Army1.getArmyName());
		System.out.println(Army1.getArmyTroopNumber());
		System.out.println(Army2.getArmyName());
		System.out.println(Army2.getArmyName());
		
		Armies test1 = new Armies();
		test1.combat(Army1, Army2);
	}

	
	
		
		
	
	
			
		
}

		


