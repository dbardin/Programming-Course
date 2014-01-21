package main.java.ru.mai.is.tmp.students.example.data;

/**
 * @author dbardin
 */
public class DoubleRecursive {

    public static void doubleRecursive(int n)
    {
        System.out.println(n);
        if (n > 0){
            doubleRecursive(n-1);
            doubleRecursive(n-1);
        }
    }

    public static void main(String[] args){
        doubleRecursive(4);

    }
}
