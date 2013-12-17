package ru.mai.is.tmp.students.kponomarev.Task01.n2.src;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Student: Клим Пономарев
 * Group: 4О-109Б
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите трёхзначное число n: ");
        Scanner scan = new Scanner(System.in);
        Integer n = Integer.valueOf(scan.nextLine());
        Integer sum = (n/100) + ((n/10)-((n/100)*10)) + (n-((n/10)*10));
        System.out.println("Сумма цифр числа n: " + sum);
    }
}
