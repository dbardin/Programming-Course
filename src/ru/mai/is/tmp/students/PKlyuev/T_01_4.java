import java.util.Random;


public class T_01_4 {

	public static void main(String[] args) {

		int n = new Random(System.currentTimeMillis()).nextInt(1001 - 0) + 0;
		if ((n<555) && (n>5)) {
			System.out.print("Число " + n + " принадлежит интервалу (5;555).");
		} else {
			System.out.print("Число " + n + " не принадлежит интервалу (5;555).");
		}
	}

}
