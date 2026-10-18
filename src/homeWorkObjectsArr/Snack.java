package homeWorkObjectsArr;

public class Snack {

	private String name;
	private double price;
	private int weight, rank;
	
	
	public Snack(String name, double price, int weight, int rank) {
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.rank = rank;
	}
	
	
	public String getname() {
		return this.name;
	}
	
	public double getprice() {
		return this.price;
	}
	
	public int getweight() {
		return this.weight;
	}
	
	public int getrank() {
		return this.rank;
	}
	
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public void setweight(int weight) {
		this.weight = weight;
	}
	
	public void setrank(int rank) {
		this.rank = rank;
	}
	
	
	
	public String toString() {
		return this.name + " " + this.price + " " + this.weight + " " + this.rank;
	}
	
	
	public boolean isWeightEqual(Snack other) {
		return this.weight ==  other.weight;
	}
	
	
		
	
}
