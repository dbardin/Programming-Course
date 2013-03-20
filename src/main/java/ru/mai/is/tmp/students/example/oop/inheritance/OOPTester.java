package ru.mai.is.tmp.students.example.oop.inheritance;

import ru.mai.is.tmp.students.example.oop.inheritance.inheritanceAbstract.*;
import ru.mai.is.tmp.students.example.oop.inheritance.inheritanceInterface.*;
/**
*  @author dbardin
* Class for testing classes from inheritanceAbstract and inheritanceInterface packages
*/
public class OOPTester {

    public static void main(String[] args){
        MobilePhone iphone=new IPhone();
        MobilePhone oldNokia=new OldNokia();

        iphone.sendMMS();
        oldNokia.sendMMS();

        iphone.sendSMS();
        oldNokia.sendSMS();

        iphone.call();
        oldNokia.call();

        iphone.toggleWifi();
        oldNokia.toggleWifi();

        // test real nokia
        MobilePhone oldNokiaReal=new OldNokiaReal();
        oldNokiaReal.toggleWifi();
        oldNokiaReal.sendMMS();

        System.out.println("------------");

        //test implementations interface IMobilePhone
        IMobilePhone iphoneImpl=new IPhoneImpl();
        IMobilePhone oldNokiaImpl=new OldNokiaImpl();

        iphoneImpl.sendMMS();
        oldNokiaImpl.sendMMS();

        iphoneImpl.sendSMS();
        oldNokiaImpl.sendSMS();

        iphoneImpl.call();
        oldNokiaImpl.call();

        iphoneImpl.toggleWifi();
        oldNokiaImpl.toggleWifi();

    }
}
