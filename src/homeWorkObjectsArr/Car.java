package homeWorkObjectsArr;

public class Car {

	private String type;
	private String color;
	private double km;
	
	
	public Car(String type, String color, double km) {
		this.km = km;
		this.type = type;
		this.color = color;
	}
	

	
	

	public double getkm() {
		return this.km;
	}
	
	public String gettype() {
		return this.type;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	
	public void setkm(double km) {
		this.km = km;
	}
	
	
	public String toString() {
		return this.type + " " + this.color + " " + this.km;
	}
	
	
}
