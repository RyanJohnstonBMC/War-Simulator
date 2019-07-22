

public class Armies {
	//scanner object creation
	
	
	private String armyName;
	private Long troopNumber;
	
	
	
	public void storeArmyInfo() {
		//function to store army data from receive army info function not sure if used yet
	}
	public void setArmyName(String newArmyName){
		
		
		this.armyName = newArmyName;
		
	}
	
	public void setTroopNumber (Long newTroopNumber) {
		
		this.troopNumber = newTroopNumber;
	}
	
	public String getArmyName() {
		 return armyName;
	}
	public void printArmyName() {
		System.out.println(armyName);
	}
	public void printTroopNumber() {
		System.out.println(troopNumber);
	}
	public Long getArmyTroopNumber() {
		return troopNumber;
	}
	/*
	 * 
		System.out.println("Please enter the number of troops in " + armyName);
		this.troopCount = scan.nextLong();
	 */
}
