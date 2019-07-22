

public class Main {

	public static void main(String[] args) {
		
		//Program startup TODO proper intro
		System.out.println("Hello welcome to war simulator");
		
		Armies Army1 = new Armies();
		Armies Army2 = new Armies();
		//creating a new object for the Armies class
		//currently only two can be implemented
		//TODO make this a for statement so that multiple armies can be created
		Army1.receiveArmyInfo();
		Army2.receiveArmyInfo();
		System.out.println(Army1.sendArmyName());
		System.out.println(Army1.sendArmyTroopCount());
		System.out.println(Army2.sendArmyName());
		System.out.println(Army2.sendArmyTroopCount());
	
	
			
		
	}
}
		


