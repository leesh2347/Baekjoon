import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int[] arr=null;
		String temp=s.nextLine();
		int n=Integer.parseInt(temp.split(" ")[0]);
		int x=Integer.parseInt(temp.split(" ")[1]);
		arr=new int[n];
		int i=0;
		for(i=0;i<n;i++)
			arr[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]<x)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
