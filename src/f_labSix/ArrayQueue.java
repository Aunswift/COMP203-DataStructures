package f_labSix;


//FIRST IN FIRST OUT
public class ArrayQueue {
    int capacity;
    int front;
    int rear;
    int size;
    String[] queue;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(String S){
        queue[rear+1%capacity] = S;
        rear = (rear+1)%capacity;
        size++;
    }

    public String dequeue(){
        String S = queue[front];
        queue[front]=null;
        front = (front+1)%capacity;
        size--;
        for(int i = 0; i<size; i++){
            queue[i] = queue[i+1];
        }
        return S;
    }


    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public void printQueue(){
        for(int i = 0; i<size; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(15);
        queue.enqueue("10");
        queue.enqueue("20");
        queue.enqueue("30");
        queue.enqueue("40");
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        System.out.println("Size: " + queue.size());
        System.out.print("Is empty? "+queue.isEmpty());
    }
}
