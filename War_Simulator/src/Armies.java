

public class Armies {
	//scanner object creation
	
	
	private String armyName;
	private int troopNumber;
	Armies [] armyArray = new Armies [100];
	
	
	public void storeArmyInfo() {
		//function to store army data from receive army info function not sure if used yet
	}
	public void setArmyName(String newArmyName){
		
		
		this.armyName = newArmyName;
		
	}
	
	public void setTroopNumber (int newTroopNumber) {
		
		this.troopNumber = newTroopNumber;
	}
	
	public String getArmyName() {
		 return armyName;
	}

	public int getArmyTroopNumber() {
		return troopNumber;
	}
	
	void combat (Armies Army1, Armies Army2)
	{
		getArmyName();
		getArmyTroopNumber();
		 if(Army1.troopNumber > Army2.troopNumber) {
			 
			 System.out.println("The victor is " + Army1.getArmyName());
			 
		 }
		 else {
			 System.out.println("The victor is " + Army2.getArmyName());
		 }
	}
	
}
