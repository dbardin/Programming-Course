/**
 * Created with IntelliJ IDEA.
 * Student: Клим Пономарев
 * Group: 4О-109Б
 * Date: 30.11.13
 * Time: 18:13
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
