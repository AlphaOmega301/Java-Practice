package cooperation;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("Passenger of the Sub Number" + subwayNumber + "is" + passengerCount +
				"and income is" + money +".");
	}
}
