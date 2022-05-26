import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int reward=0;
		if(a==b&&a==c)
		{
			reward=10000+a*1000;
		}
		else if(a==b||b==c||c==a) {
			if(a==b)
				reward=1000+a*100;
			else if(b==c)
				reward=1000+b*100;
			else
				reward=1000+c*100;
		}
		else
		{
			int big=a;
			if(b>big)
				big=b;
			if(c>big)
				big=c;
			reward=big*100;
		}
		System.out.println(reward);
		
	}
}
