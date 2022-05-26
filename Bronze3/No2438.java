import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String res="";
		int j=0;
		for(int i=0;i<n;i++)
		{
		for(j=0;j<=i;j++)
		{
			res=res+"*";
		}
		res=res+"\n";
		}
		System.out.println(res);
	}
}
