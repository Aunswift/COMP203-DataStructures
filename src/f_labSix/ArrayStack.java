package f_labSix;

public class ArrayStack {
    int capacity;
    int size;
    int[] stack;
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        size = 0;
    }
    public int pop() {
        int temp = stack[size - 1];
        stack[size - 1] = 0;
        size--;
        return temp;
    }
    public void push(int data){
        stack[size] = data;
        size++;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void printStack(){
        for(int i = 0; i < size; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(6);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.size();
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
