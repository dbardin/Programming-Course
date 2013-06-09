package ru.mai.is.tmp.students.example.unit_test;

/**
 * @author dbardin
 */
public class Account {

        private int value;
        boolean isOpened;

        public Account(int v){
            value = v;
            isOpened=true;
        }

        public void deposit(int money){
            value=value+money;
        }

        public void withdraw(int money){
            if(value>=money)
                value=value-money;
            else
                throw new RuntimeException("not enough money in the account");
        }

        public int balance(){
            return value;
        }

        public void close(){
            value=0;
            isOpened=false;
        }

}
