package ru.mai.is.tmp.students.example.oop.exceptions;
/**
   @author dbardin
 */

class UncheckedException {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number/0);
    }
}

//Exception in thread "main" java.lang.ArithmeticException: / by zero
