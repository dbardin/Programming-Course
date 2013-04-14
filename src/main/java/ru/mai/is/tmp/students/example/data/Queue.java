package main.java.ru.mai.is.tmp.students.example.data;

/**
 * @author dbardin
 */
public class Queue {
    int size;
    int head;
    int tail;
    int[] data;
    public Queue(int size) {
        data = new int [this.size = size];
    }
    public void add(int value) {
        if (++tail == size)
            tail = 0;
        data[tail] = value;
    }
    public int extract() {
        if (++head == size)
            head = 0;
        return data[head];
    }
    public boolean isEmpty() {
        return head == tail;
    }
    public int size(){
        return size;
    }
    public static void main(String[] args){
        Queue queue=new Queue(10);
        queue.add(115);
        System.out.println(queue.extract());
    }
}
