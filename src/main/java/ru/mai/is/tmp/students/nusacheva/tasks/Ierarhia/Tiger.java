package ru.mai.is.tmp.students.nusacheva.tasks.Ierarhia;
public class Tiger extends Predatory implements Animals {
    private String colorOfWool;
    public String getColorOfWool(){
        return colorOfWool;
    }
    public void setColorOfWool (String colorOfWool){
        if(colorOfWool.contains("оранжевый с полосами")){
            this.colorOfWool=colorOfWool;

        }
        else this.colorOfWool="оранжевый с полосами";

    }
    public void kindOfAnimal(){
        System.out.println("Перед вами " +getColorOfWool()+ " тигр. Среда обитания - " +getHabitat());
    }
}
