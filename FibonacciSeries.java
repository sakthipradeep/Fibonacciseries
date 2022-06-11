package week1.day1.assignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range=8;
		int firstnum=0;
		int secnum=1;
		System.out.println(firstnum);
		System.out.println(secnum);
		for(int i=2;i<range;i++) {
			int sum=firstnum+secnum;
			System.out.println(sum);
			firstnum=secnum;
			secnum=sum;
		}

	}
}