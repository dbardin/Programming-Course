package ru.mai.is.tmp.students.example.oop.inheritance.inheritanceInterface;

/**
 * @author dbardin
 */
public class IPhoneImpl implements IMobilePhone {

    boolean isWifiOn=false;

    @Override
    public void sendSMS() {
        System.out.println("sms from iphone");
    }

    @Override
    public void sendMMS() {
        System.out.println("mms from iphone");
    }

    @Override
    public void call() {
        System.out.println("call from iphone");
    }

    @Override
    public void toggleWifi() {
        isWifiOn=!isWifiOn;
        System.out.println(String.format("wifi enable %s",isWifiOn));
    }
}

