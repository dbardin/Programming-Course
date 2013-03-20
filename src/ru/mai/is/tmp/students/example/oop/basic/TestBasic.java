package ru.mai.is.tmp.students.example.oop.basic;

/**
 * @author dbardin
 * Class for testing classes from basic package
 */
public class TestBasic {
    public static void main(String[] args){

        Person man=new Person();
        man.setName("Test");
        //My name is Test
        System.out.println(String.format("My name is %s",man.getName()));

    }
}
