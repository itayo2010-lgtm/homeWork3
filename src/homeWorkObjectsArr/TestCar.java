package homeWorkObjectsArr;

import java.util.Scanner;

public class TestCar {
	
	
	public void lesskm(Car [] carArr) {
		double min = carArr[0].getkm();
		
		for(int i = 1; i < 30; i++) {
			if (carArr[i].getkm() < min) {
				min = carArr[i].getkm();
			}
		}
		
		for (int i = 0; i < 30; i++) {
			if(carArr[i].getkm() == min) {
				System.out.println(carArr[i].toString());
			}
		}
	}
	
	public double findAvg(Car [] carArr) {
		double sum = 0;
		for (int i = 0; i < 30; i++) {
			sum += carArr[i].getkm();
		}
		return sum/30;
	}
	
	public int redCars(Car[] carArr) {
		int redcars = 0;
		for (int i = 0; i < 30; i++){
			if (carArr[i].getcolor().equals("red")) {
				redcars ++;
			}
		}
		return redcars;
	}
	
	public void cars20000To400000(Car [] carArr) {
		for (int i = 0; i < 30; i++) {
			if (carArr[i].getkm() >= 20000 && carArr[i].getkm() <= 40000) {
				System.out.println(carArr[i].toString());
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Car [] carArr = new Car[30];
		
		String type = "";
		String color = "";
		double km = 0;
		
		
		for (int i = 0; i < 30; i++) {
			System.out.println("enter car's type, color and km");
			type = input.next();
			color = input.next();
			km = input.nextDouble();
			input.nextLine();
			carArr[i] = new Car(type, color, km);
		}
		input.close();
	}

}
