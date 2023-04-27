import java.util.Scanner;
	 
	public class Main {
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		int i=0;
		int y=0;
		int m=0;
		int t=0;
		int n=sc.nextInt();
		for(i=0;i<n;i++) {
			t=0;
			t=sc.nextInt();
			y+=((t/30)+1)*10;
			m+=((t/60)+1)*15;
		}
		String res="Y M "+y;
		if(y>m)
			res="M "+m;
		else if(y<m)
			res="Y "+y;
		System.out.println(res);
		}
	}
