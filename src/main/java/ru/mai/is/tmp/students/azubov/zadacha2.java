import java.util.Scanner;
public class zadacha2 {
     public static void main(String[] args) {
         System.out.println("������� ���������� ����� n: ");
          Scanner scan = new Scanner(System.in);
        Integer n = Integer.valueOf(scan.nextLine());
         Integer sum = (n/100) + ((n/10)-((n/100)*10)) + (n-((n/10)*10));
         System.out.println("����� ���� ����� n: " + sum);
     }
 }