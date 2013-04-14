package main.java.ru.mai.is.tmp.students.example.data;

/**
 *@author dbardin
 */
public class Stack {
      int size;
      int[] data;
      public  Stack(int capacity) {
          data = new int [capacity];
      }

      public void push(int value) {
          data[size++] = value;
      }

      public int pop() {
           return data[--size];
      }

      public int size(){
          return size;
      }

      public static void main(String[] args){
          Stack stack=new Stack(10);
          System.out.println(stack.size);
          stack.push(115);
          System.out.println(stack.size);
          System.out.println(stack.pop());
          System.out.println(stack.size());
      }
}
