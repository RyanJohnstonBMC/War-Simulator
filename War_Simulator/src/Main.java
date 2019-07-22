

public class Main {

	public static void main(String[] args) {
		
		//Program startup TODO proper intro
		System.out.println("Hello welcome to war simulator");
		
		Armies obj1 = new Armies();
		//creating a new object for the Armies class
		//TODO make this a for statement so that multiple armies can be created
		obj1.receiveArmyInfo();
		System.out.println(obj1.sendArmyName());
		System.out.println(obj1.sendArmyTroopCount());
	
	
			
		
	}
}
		


