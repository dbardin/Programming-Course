package ru.mai.is.tmp.students.nusacheva.tasks.Ierarhia;
public class Wolf extends Predatory implements Animals{
    private String colorOfWool;
    public String getColorOfWool(){
        return colorOfWool;
    }
    public void setColorOfWool (String colorOfWool){
        if(colorOfWool.contains("cерый")){
            this.colorOfWool=colorOfWool;
        }
        else this.colorOfWool="cерый";

    }
    public void kindOfAnimal(){
        System.out.println("Перед вами " +getColorOfWool()+ " волк. Среда обитания - " +getHabitat());
    }
}
