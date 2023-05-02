import java.util.Scanner;
	 
	public class Main {
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
	      int i=0;
	      int a=0;
	      int b=0;
	      int[][] arr= {{10,10,10,10},{1,1,1,1},{2,4,8,6},{3,9,7,1},{4,6,4,6},{5,5,5,5},{6,6,6,6},{7,9,3,1},{8,4,2,6},{9,1,9,1}};
	      String res="";
	      int n=sc.nextInt();
	      for(i=0;i<n;i++)
	      {
	         a=sc.nextInt();
	         b=sc.nextInt();
	         a=a%10;
	         b=(b-1)%4;
	         res=res+arr[a][b]+"\n";
	      }
	      
	      System.out.print(res);
		}
	}
