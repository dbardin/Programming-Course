package ru.mai.is.tmp.students.nusacheva.tasks.Ierarhia;
public class Whale extends Cetacea implements Animals{
    private int length;
    public int getLength(){
        return length;
    }
    public void setLength (int length){
        if(length>1000){
            this.length=length;
        }
        else this.length=1000;

    }
    public void kindOfAnimal(){
        System.out.println("Перед вами кит длиной " +getLength()+ " см. Среда обитания - " +getHabitat());
    }
}
