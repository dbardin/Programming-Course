/**
 * @author arybalko
 * Program that calculate first 10 Fibonacci numbers
 * Task_01 Program 5
 */
public class Task_01Num5 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int i=0;
		System.out.print ("First 10 numbers of Fibonacci's row: ");
			while(i<10){
				System.out.print(a+" "+b+" ");
				i=i+2;
				a=a+b;
				b=a+b;
			}
	}
}