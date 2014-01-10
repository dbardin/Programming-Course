
import java.util.*;
public class HanoyTowers {
    int column1=1;
    int column2=2;
    int column3=3;
    int numOfDisks;
    //List<Integer> arr1,arr2,arr3;
    List<List<Integer> > arr;
    int hanoyTowers(int NewNumOfDisks){
        numOfDisks=NewNumOfDisks;
        int numOfMove=(int)((Math.pow(2, numOfDisks))-1);
        System.out.println("Количество дисков равно "+numOfDisks);
        System.out.println("Количество ходов "+numOfMove);
        System.out.println("Описание, как переложить " + numOfDisks + " дисков(а) с первого столбца на третий столбец  через свободный второй столбец:");
        System.out.println("(Нумерация дисков - сверху вниз)");
        arr=new ArrayList<List<Integer> >();
        arr.add(new ArrayList<Integer>());
        arr.add(new ArrayList<Integer>());
        arr.add(new ArrayList<Integer>());
	/*arr1 = new ArrayList<Integer>();
	arr2=  new ArrayList<Integer>();
	arr3= new ArrayList<Integer>();*/
        for(int i=0; i<numOfDisks;i++){
            arr.get(0).add(numOfDisks-i);
        }
        return numOfDisks;
    }

    void hanoyTowers(){
        System.out.print("Введите количество дисков-");
        Scanner scan = new Scanner(System.in);
        int NewNumOfDisks = scan.nextInt();
        hanoyTowers(NewNumOfDisks);
        scan.close();
    }
    public void move(){
        MoveDisk(numOfDisks,column1,column3,column2);
    }
    private void MoveDisk(int n, int from, int to,int buff){
        if(n==1){
            moveOneDisk( from, to);
        }
        else{
            MoveDisk(n-1, from,buff,to);
            moveOneDisk(from,to);
            MoveDisk(n-1,buff,to,from);
        }
    }
    private void moveOneDisk(int from, int to){
        System.out.println("Переложить диск с "+ from+ " столбца на "+to+" столбец");

        {
            arr.get(to-1).add(//добавляется элемент на целевой столбец
                    arr.get(from-1).get//берётся последний элемент из списка
                            (
                                    arr.get(from-1).size()-1)//номер последнего элемента(диска) на столбце источнике(1 столбец)
            );
            arr.get(from-1).remove(arr.get(from-1).size()-1);//
        }

        System.out.println("На первом столбце: "+arr.get(0).size()+" дисков(а)");
        System.out.println("На втором столбце: "+arr.get(1).size()+" дисков(а)");
        System.out.println("На третьем столбце: "+arr.get(2).size()+" дисков(а)");
    }
    public static void main(String[] args){
        HanoyTowers ht=new HanoyTowers();
        ht.hanoyTowers();
        ht.move();
    }
}