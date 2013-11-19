/**
 * @author arybalko
 * Programma, vichityvayushcaya pervie 10 chisel Fibonacci
 * Task_01 Zadanie 5
 */
public class Task5 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int i=0;
		System.out.print ("Pervie 10 chisel ryada Fibonacci: ");
			while(i<10){
				System.out.print(a+" "+b+" ");
				i=i+2;
				a=a+b;
				b=a+b;
			}
	}
}