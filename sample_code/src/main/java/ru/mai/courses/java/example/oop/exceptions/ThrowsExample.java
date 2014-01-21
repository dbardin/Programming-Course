package ru.mai.is.tmp.students.example.oop.exceptions;

/**
* @author dbardin
 */
public class ThrowsExample {

        static void method() throws IllegalAccessException {

            System.out.println("call method");

            throw new IllegalAccessException("example throws");

        }

        public static void main(String args[]) {

            try {

                method();

            }catch (IllegalAccessException e) {

                System.out.println("caught " + e);

            }

        }
}
