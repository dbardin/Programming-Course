package ru.mai.is.tmp.students.example.unit_test;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

   Account testAccount;

    @Before
    public void init(){
        testAccount=new Account(1000);
    }

    @Test
    public void checkAccountIsOpened(){
        Assert.assertEquals(testAccount.isOpened,true);
    }

    @Test
    public void addSomeMoney(){
        testAccount.deposit(555);
        Assert.assertEquals(testAccount.balance(),1555);
    }

    @Test
    public void withdrawSomeMoney(){
        testAccount.withdraw(555);
        Assert.assertEquals(testAccount.balance(),445);
    }

    @Test
    public void closeAccount(){
        testAccount.close();
        Assert.assertEquals(testAccount.balance(),0);
        Assert.assertEquals(testAccount.isOpened,false);
    }


    @After
    public void destroy(){

    }

}