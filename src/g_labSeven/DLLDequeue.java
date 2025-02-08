package g_labSeven;

class Node<E>{
    E data;
    Node<E> next, prev;
    public Node(E data){
        this.data = data;
        this.next =  this.prev = null;
    }
}
public class DLLDequeue<E> {
    Node<E> head;
    public int size = 0;

    public DLLDequeue(int capacity){
        head  = null;
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<E>(e);
        if(head == null){
            head = newNode;
            size++;
            return;
        }else{
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void addLast(E e){
        Node<E> newNode = new Node<E>(e);
        if(head == null){
            head = newNode;
            size++;
        }else{
            Node<E> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            size++;
        }
    }

    public E removeFirst(){
        if(head == null){
            throw new IllegalStateException("Yohammına");
        }
        else{
            E data = head.data;
            head = head.next;
            size--;
            return data;
        }
    }

    public E removeLast() {
        E data = null;
        if (head == null) {
            return data;
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            data = temp.data;
            temp.prev.next = null;
        }
        size--;
        return data;
    }

    public E First(){
        if(head == null){
            return null;
        }
        return head.data;
    }

    public E Last(){
        if(head == null){
            return null;
        }else{
            Node<E> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void printDequeue(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLLDequeue<Integer> dll = new DLLDequeue<Integer>(15);
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addLast(40);
        dll.printDequeue();
        dll.removeFirst();
        dll.removeLast();
        dll.printDequeue();
        System.out.println("First: " + dll.First());
        System.out.println("Last: " + dll.Last());
        System.out.println("Size: " + dll.size());
        System.out.println("isEmpty: " + dll.isEmpty());
    }

}
