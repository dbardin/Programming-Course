package ru.mai.is.tmp.students.example.oop.inheritance.inheritanceAbstract;

/**
 * @author dbardin
 */
public abstract class MobilePhone{

    private boolean isWifiOn=false;

    public void sendSMS(){
        System.out.println("send sms");
    }

    public void sendMMS(){
        System.out.println("send mms");
    }

    public void call(){
        System.out.println("call someone");
    }

    public void toggleWifi(){
        isWifiOn=!isWifiOn;
        System.out.println(String.format("wifi enable %s",isWifiOn));
    }
}

