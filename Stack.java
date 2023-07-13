package Stack;

public class Stack {
    int[] stack = new int[5];
    int top = 0;
    public void push(int data){
        stack[top] = data;
        top++;
    }
    public int pop() {
        int data = 0 ;
        if (IsEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }
    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    public int size(){
        return top;
    }

    public boolean IsEmpty(){
        return top<=0;
    }
    public void show(){
    for(int n : stack){
        System.out.print(n + " ");
    }
        System.out.println();
    }
}
