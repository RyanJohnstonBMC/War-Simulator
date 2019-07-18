import java.util.Scanner;

public class Armies {
	//scanner object creation
	Scanner scan = new Scanner(System.in);
	
	String armyName;
	Long troopCount;
	
	public void storeArmyInfo() {
		//function to store army data from receive army info function not sure if used yet
	}
	public void receiveArmyInfo(){
		System.out.println("Please enter the name for army");
		armyName = scan.nextLine();
		System.out.println("Please enter the number of troops in " + armyName);
		troopCount = scan.nextLong();
	}
	public String sendArmyName() {
		 return armyName;
	}
	public Long sendArmyTroopCount() {
		return troopCount;
	}
}
