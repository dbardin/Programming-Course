import java.util.Scanner;
public class text {
    public static void main (String args[]){

        int i,k=0;
        String st;
        String[] s=new String[9];

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово-аргумент");
        String a= scan.nextLine();

        System.out.println("Введите 9 строк");
        for (i=0; i<9; i++){
            s[i]=scan.nextLine(); }

        for (i=0; i<9;i++){
            if (s[i].contains(a)){
                System.out.println(s[i]);
                k=1;}}
            if (k==0)System.out.println("Строк со словом-аргументом нет");




    }
}
