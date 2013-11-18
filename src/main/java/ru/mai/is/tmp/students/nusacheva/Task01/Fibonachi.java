
public class Fibonachi {
    public static void main (String args[]) {
        int p,p1=1,p2=1;
        System.out.println(p1);
        System.out.println(p2);
        for (int i=3; i<11; i++){
            p=p1+p2;
            System.out.println(p);
            p1=p2;
            p2=p;}

    }
}
