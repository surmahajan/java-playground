package exercise3;

import java.util.Arrays;

public class QueueStack1{

    private String[] queueArray;

    private int queueSize;

    private int front, end, numberOfItems = 0;

    QueueStack1(int size) {
        queueSize = size;
        queueArray = new String[size];
    }

    public void insert(String input) {
        if(numberOfItems +1 <= queueSize) {
            queueArray[end] = input;
            end++;
            numberOfItems++;
            System.out.println("Item added to the Queue - "+Arrays.toString(queueArray));
        } else {
            System.out.println("Queue is full ");
        }
    }

    public void remove() {
        if(numberOfItems >0) {
            System.out.println("Item removed");
            front++;
            numberOfItems--;
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void peek() {
        System.out.println("First element is "+ queueArray[front]);
    }

    public static void main(String str[]) {
        QueueStack1 q = new QueueStack1(10);
        q.insert("10");
        q.insert("15");
        q.insert("20");

        q.remove();
        q.peek();

    }
}