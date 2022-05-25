import java.util.Scanner;

public class Main {	
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=0;
		int b=0;
		a=s.nextInt();
		b=s.nextInt();
		int line3=b-((b/10)*10);
		int line4=(b-((b/100)*100+line3))/10;
		int line5=(b/100);
		System.out.println(a*line3+"\n"+a*line4+"\n"+a*line5+"\n"+a*b);
	}
}
