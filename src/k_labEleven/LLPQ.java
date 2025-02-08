package k_labEleven;

class Node{
    char addedChar;
    int priority;
    Node next;

    public Node(char addedChar, int priority){
        this.addedChar = addedChar;
        this.priority = priority;
        this.next = null;
    }
}

public class LLPQ {
    int capacity;
    int size;
    Node head;
    public LLPQ(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.head = null;
    }

    public void insert(char addedData, int priority){
        Node newNode = new Node(addedData, priority);
        if(head == null && size < capacity){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null && priority > current.priority){
                current = current.next;
            }
            if(current.next == null) {
                current.next = newNode;
            }else{
                current.next = newNode;
                newNode.next = current.next.next;
            }
        }
        size++;
    }

    public char removeMin(){
        char temp;
        if(head == null){
            throw new IllegalStateException("LLQ is empty");
        }else{
            if(head.next != null){
                temp = head.addedChar;
                head = head.next;
            }else{
                temp = head.addedChar;
                head = null;
            }
            size--;
            return temp;
        }
    }

    public char Min(){
        if(head == null){
            throw new IllegalStateException("LLQ is empty");
        }else{
            return head.addedChar;
        }
    }

    public int size(){
        return size;
    }

    public void printQueue(){
        Node current = head;
        System.out.print("head -> ");
        while(current != null){
            System.out.print("(" + current.addedChar + "," + current.priority + ") - > ");
            current = current.next;
        }
        System.out.println("NULL\n");
    }

    public static void main(String[] args) {
        LLPQ queue = new LLPQ(10);
        queue.insert('A', 1);
        queue.insert('G', 2);
        queue.insert('U', 3);
        queue.insert('C', 4);
        queue.insert('E', 5);

        System.out.println("Size: " + queue.size());
        queue.printQueue();
        queue.removeMin();
        queue.printQueue();
        System.out.println(queue.Min());
    }






}
