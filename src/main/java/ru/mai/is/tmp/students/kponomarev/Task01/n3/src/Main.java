package ru.mai.is.tmp.students.kponomarev.Task01.n3.src;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Student: Клим Пономарев
 * Group: 4О-109Б
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner scan = new Scanner(System.in);
        Integer n = Integer.valueOf(scan.nextLine());
        System.out.print("Число n - ");
        if (n%2==0) {
            System.out.print("четное!");
        } else {
            System.out.print("нечетное!");
        }
    }
}
