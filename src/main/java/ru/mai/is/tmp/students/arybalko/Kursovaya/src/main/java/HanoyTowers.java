/**
 * Created with IntelliJ IDEA.
 * User: arybalko
 * Date: 16.12.15
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.arybalko.Kursovaya.src.main.java;
import java.util. Scanner;
public class HanoyTowers {
int column1=1;
int column2=2;
int column3=3;
int numOfDisks;
void hanoyTowers(){
System.out.print("Введите количество дисков-");
Scanner scan = new Scanner(System.in);
numOfDisks = scan.nextInt();
System.out.println("Количество дисков равно "+numOfDisks);
System.out.println("Описание, как переложить " + numOfDisks + " дисков(а) с первого столбца на третий столбец  через свободный второй столбец:");
System.out.println("(Нумерация дисков - сверху вниз)");}
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
}
public static void main(String[] args){
HanoyTowers ht=new HanoyTowers();
ht.hanoyTowers();
ht.move();
}
}







