import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: упс
 * Date: 20.11.13
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class hm01_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        if (args.length == 0)
        {
            System.err.print("Ошибка!");
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            String str = in.nextLine();
            Scanner stroka = new Scanner(str);
            for (String iterStr: args)
                if ((str.toLowerCase().indexOf(iterStr.toLowerCase()) != -1) ||
                        (stroka.findInLine(iterStr) != null))
                {
                    System.out.println(str);
                    break;
                }
            stroka.close();

        }
        in.close();
    }
}
