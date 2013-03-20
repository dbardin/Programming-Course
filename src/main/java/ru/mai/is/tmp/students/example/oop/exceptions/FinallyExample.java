package ru.mai.is.tmp.students.example.oop.exceptions;

/**
* @author dbardin
 */
public class FinallyExample {

        private static void methodA() {

            try {

                System.out.println("inside methodA");

                throw new RuntimeException("example finally");

            }
            finally {

                System.out.println("methodA finally");

            }
        }

        private static void methodB() {

            try {

                System.out.println("inside methodB");

                return;

            }
            finally {

                System.out.println("methodB finally");

            }
        }

        public static void main(String args[]) {

            try {

                methodA();

            }catch (Exception e) {
                  System.out.println(String.format("caught exception ?",e.getMessage()));
            }
            methodB();

        }

}
