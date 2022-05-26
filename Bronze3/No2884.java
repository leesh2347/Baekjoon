import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int hour=0;
		int minute=0;
		hour=s.nextInt();
		minute=s.nextInt();
		minute=minute-45;
		if(minute<0)
		{
			minute=minute+60;
			hour--;
			if(hour<0)
				hour=hour+24;
		}
		System.out.println(hour+" "+minute);
		
	}
}
