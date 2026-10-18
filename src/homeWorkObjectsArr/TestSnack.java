package homeWorkObjectsArr;
import java.util.Scanner;

public class TestSnack {
	
	
	public int[] snacksPerRank(Snack s[]) {
		
		int snacksperrank[] = new int[5];
		
		for(int i = 0; i < s.length; i++) {
			snacksperrank[s[i].getrank() - 1] ++;
		}
		return snacksperrank;
	}
	
	
	public double avgSnacksWithRanknAndWeightBetween15To20(Snack s[], int n) {
		
		double sum = 0;
		int counter = 0;
		
		for(int i = 0; i < s.length; i++) {
			if (s[i].getrank() == n) {
				if (s[i].getweight() >= 15 && s[i].getweight() <= 20) {
					sum += s[i].getprice();
					counter++;
				}
			}
		}
		
		if (counter > 0) {
			return sum / counter;
		}
		return 0;
	}
	

	public void lessThanp(Snack s[], double p) {
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].getprice() < p) {
				System.out.println(s[i].getname());
			}
		}
		
	}
	
	public void snacksWithWeightLikeSnackToCheck(Snack s[], Snack snacktocheck) {
		for(int i = 0; i < s.length; i++) {
			if (s[i].isWeightEqual(snacktocheck)) {
				System.out.println(s[i].getname());
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		Snack s[] = new Snack[200];
		
		int n = 0;
		
		System.out.println("enter a number between 1 to 5");
		n = input.nextInt();
		double p;
		Snack snackToCheck = new Snack("tenbis", 23.3, 15, 3);
		
		String name ="";
		double price = 0;
		int weight, rank = 0;
		
		for(int i = 0; i < 200; i++) {
			System.out.println("enter snack's name, price, weight, rank");
			name = input.next();
			price = input.nextDouble();
			weight = input.nextInt();
			rank = input.nextInt();
			s[i] = new Snack(name, price, weight, rank);
		}

	}

}

