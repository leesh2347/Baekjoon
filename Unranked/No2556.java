import java.util.Scanner;

public class Main {	
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String t="";
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				t=t+"*";
			t=t+"\n";
		}
		System.out.println(t);
	}
}
