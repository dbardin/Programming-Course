package ru.mai.is.tmp.students.nusacheva.tasks.Ierarhia;
public class Dolphin extends Cetacea implements Animals{
    private int length;
    public int getLength(){
        return length;
    }
    public void setLength (int length){
        if(length<400){
            this.length=length;

        }
        else this.length=400;

    }
    public void kindOfAnimal(){
        System.out.println("Перед вами дельфин длиной " +getLength()+ " см. Среда обитания - " +getHabitat());
    }
}
