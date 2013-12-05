
public class SChislo {
	public static void main (String[] args) {
		int n = 487, x, y, z, s;
		x=n/100;
		y=(n-x*100)/10;
		z=n-(x*100+y*10);
		s=x+y+z;
		System.out.print(s);
	}

}
