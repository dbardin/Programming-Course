
public class Fib {
	public static void main (String[] args) {
		int n=1, a=1, b=1;
		while (n<6) {
			System.out.print(a+", "+b+", ");
			a=a+b;
			b=b+a;
			n=n+1;
		}
	}

}
