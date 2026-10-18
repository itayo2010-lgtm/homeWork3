package homeWorkObjectsArr;


import java.util.Scanner;

public class TestSoldier {
	
	public static void soldiersWhoAreStaying(Soldier [] s) {
		if (s[0].getheight() < s[1].getheight())
		{
			System.out.println(s[0].getname());
		}
		
		if (s[s.length -1].getheight() < s[s.length - 2].getheight())
		{
			System.out.println(s[s.length - 1].getname());
		}
		
		for(int i = 1; i < s.length - 1;i++)
		{
			if(s[i].getheight() < s[i-1].getheight() && s[i].getheight() < s[i+1].getheight())
			{
				System.out.println(s[i].getname());
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Soldier [] s = new Soldier[20];
		double height = 0;
		String name = "";
		for (int i = 0; i < s.length;i++)
		{
			System.out.println("enter soldier's name and height");
			name = input.next();
			height = input.nextDouble();
			s[i] = new Soldier(name,height);
		}
		input.close();
		
		soldiersWhoAreStaying(s);

	}

}