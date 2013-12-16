package ru.mai.is.tmp.students.nusacheva.tasks.Ierarhia;
public class Test {
    public static void main (String[]args){
        Wolf w1=new Wolf();
        w1.setColorOfWool("красный");
        w1.setHabitat("река");
        w1.kindOfAnimal();

        Tiger t1=new Tiger();
        t1.setColorOfWool("фиолетовый");
        t1.setHabitat("океан");
        t1.kindOfAnimal();

        Dolphin d1=new Dolphin();
        d1.setLength(2000);
        d1.setHabitat("поле");
        d1.kindOfAnimal();

        Whale wh1=new Whale();
        wh1.setLength(300);
        wh1.setHabitat("земля");
        wh1.kindOfAnimal();
    }
}
