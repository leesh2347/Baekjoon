import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		int wx=0;
		int yh=0;
		if(x>(w/2))
			wx=(w-x);
		else
			wx=x;
		if(y>(h/2))
			yh=(h-y);
		else
			yh=y;
		if(wx>yh)
			System.out.println(yh);
		else
			System.out.println(wx);
		}
}
