import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String temp="";
		temp=s.nextLine();
		int a=Integer.parseInt(temp.split(" ")[0]);
		int b=Integer.parseInt(temp.split(" ")[1]);
		int c=s.nextInt();
		b=b+c;
		if(b>59)
		{
			int d=b/60;
			b=b%60;
			a=a+d;
			if(a>23)
				a=a-24;
		}
		System.out.println(a+" "+b);
		
	}
}
