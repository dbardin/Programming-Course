package ru.mai.is.tmp.students.example.oop.inheritance.inheritanceAbstract;

/**
* @author dbardin
*/
public class OldNokiaReal extends MobilePhone {
    @Override
    public void sendMMS(){
        System.out.println("can not");
    }

    @Override
    public void toggleWifi(){
        System.out.println("I have no such");
    }
}
