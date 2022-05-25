public class Main {	
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=0;
		int b=0;
		a=s.nextInt();
		b=s.nextInt();
		int quadrant=0;
		if(a<0) {
			if(b<0)
				quadrant=3;
			else
				quadrant=2;
		}
		else {
			if(b<0)
				quadrant=4;
			else
				quadrant=1;
		}
		System.out.println(quadrant);
	}
}
