package ru.mai.is.tmp.students.example.oop.inheritance.inheritanceInterface;

/**
 * @author dbardin
 */
public class OldNokiaImpl implements IMobilePhone {


    @Override
    public void sendSMS() {
        System.out.println("sms from nokia");
    }

    @Override
    public void sendMMS() {
        System.out.println("mms from nokia");
    }

    @Override
    public void call() {
        System.out.println("call from nokia");
    }

    @Override
    public void toggleWifi() {
        System.out.println("I have no such");
    }
}

