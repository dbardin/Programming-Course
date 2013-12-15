package grep;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Student: Клим Пономарев
 * Group: 4О-109Б
 */

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.print("Invalid parametrs for program. ");
            System.err.println("Program must have one parametr.");
            return;
        }

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String str = in.nextLine();
            Scanner s = new Scanner(str);
            for (String iterStr: args)
                if ((str.toLowerCase().indexOf(iterStr.toLowerCase()) != -1) || (s.findInLine(iterStr) != null)) {
                    System.out.println(str);
                    break;
                }
            s.close();
        }
        in.close();
    }
}
