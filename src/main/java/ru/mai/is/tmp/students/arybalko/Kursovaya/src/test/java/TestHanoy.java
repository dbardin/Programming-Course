/**
 * Created by arybalko on 22.12.15.
 */
package ru.mai.is.tmp.students.arybalko.Kursovaya.src.test.java;
import org.junit.After;
import org.junit.Test;

public class TestHanoy {
    @Test
    public void hanoyTowers(){
        System.out.println("Введите количество дисков:");
        int numOfDisks = 1;
        System.out.println("Количество дисков равно "+numOfDisks);
        System.out.println("Описание, как переложить " + numOfDisks + " дисков(а) с первого столбца на третий столбец  через свободный второй столбец:");
        System.out.println("(Нумерация дисков - сверху вниз)");}
    int from =1;
    int to =3;
    @After
    public void moveOneDisk(){
        System.out.println("Переложить диск с "+ from+ " столбца на "+to+" столбец");
    }
}