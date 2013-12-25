package ru.mai.is.tmp.students.e_teplinskala.dom_rabota.Task02;
abstract public class Stones extends Berry_grade{
    private String existence_of_stones;
    public String getExistence_of_stones() {
        return existence_of_stones;
    }
    public void setExistence_of_stones(String existence_of_stones){
        if (existence_of_stones.contains("есть")) {
            this.existence_of_stones=existence_of_stones;
        }
        else this.existence_of_stones=("есть");
    }
}


