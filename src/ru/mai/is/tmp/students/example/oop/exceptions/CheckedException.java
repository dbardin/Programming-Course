package ru.mai.is.tmp.students.example.oop.exceptions;

/**
 * @author dbardin
 */
class CheckedException {
    public static void main(String[] args) {
        int number = 5;
        try {
            System.out.println(number/0);
        } catch (ArithmeticException e) {
            System.out.println("Illegal arithmetic operation");
        }
    }
}
