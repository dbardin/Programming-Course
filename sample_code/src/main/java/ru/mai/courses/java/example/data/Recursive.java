package main.java.ru.mai.is.tmp.students.example.data;


/**
 * @author dbardin
 */
public class Recursive {


    public static void recursive(int n)
    {
        System.out.println(n);
        if (n > 0);
            recursive(n-1);
    }

    public static void main(String[] args){
          recursive(5);
    }
}
