package ru.mai.is.tmp.students.kponomarev.Task01.n5.src;

/**
 * Created with IntelliJ IDEA.
 * Student: Клим Пономарев
 * Group: 4О-109Б
 */

public class Main {
    static int fibonacci(int n)
    {
        return (n<=2 ? 1 : fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String[] args)
    {
        for (int n=1; n<=10; n++)
            System.out.print(fibonacci(n)+", ");
        System.out.println("...");
    }
}
