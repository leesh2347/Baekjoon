import java.util.Scanner;

public class Main {	
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=0;
		a=s.nextInt();
		String rank="";
		if(a<=100&&a>=90)
			rank="A";
		else if(a<=89&&a>=80)
			rank="B";
		else if(a<=79&&a>=70)
			rank="C";
		else if(a<=69&&a>=60)
			rank="D";
		else
			rank="F";
		System.out.println(rank);
	}
}
