package ru.mai.is.tmp.students.nusacheva.tasks.Ierarhia;
abstract public class Cetacea extends Mammals {
    private String habitat;
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat (String habitat){
        if(habitat.contains("море")){
            this.habitat=habitat;
        }
        else this.habitat="море";

    }
}
