package carfactory;

public class Car {
	
	public static int serialNum = 1000;
	public int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}