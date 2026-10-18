package homeWorkObjectsArr;

public class Soldier {

	private String name;
	private double height;
	
	public Soldier(String name,double height)
	{
		this.name = name;
		this.height = height;
	}
	
	public String getname() {
		return name;
	}
	
	public double getheight() {
		return height;
	}
	
	public String tostring() {
		return "Soldier [Name: " + name + " height: " + height + "]";
	}
	
	
}