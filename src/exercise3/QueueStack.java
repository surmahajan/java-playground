package exercise3;

import java.util.Arrays;

// Create Queue from Array
public class QueueStack {
    
    private String[] stackArray;

    private int stackSize;

    private int topOfStack = -1;


    QueueStack(int size) {
        stackSize = size;
        stackArray = new String[size];
    }

    public void push(String input) {
        if(topOfStack + 1 <stackSize){
            topOfStack++;
            stackArray[topOfStack] = input;
            System.out.println(Arrays.toString(stackArray));
        }
        else{
            System.out.println("No enough room ");
        }
    }

    public String pop() {
        if(topOfStack >=0) {
            System.out.println("Pop "+ stackArray[topOfStack--]);
            return stackArray[topOfStack--];
        } else 
        {
            return "-1";
        }
    }      

    public String peek() {
        System.out.println(stackArray[topOfStack]+ " is at the top of the stack");
        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues) {
        String[] temp = multipleValues.split(" ");
        for(int i=0; i<temp.length; i++) {
            push(temp[i]);
        }
    }

    public static void main(String str[]) {
        QueueStack stack = new QueueStack(10);
        stack.push("P");
        stack.pushMany("1 2 3 4 5");
        stack.pushMany("15 16 17 19 20");
        stack.pop();
        stack.peek();
    }
   
}