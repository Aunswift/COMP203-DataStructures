package h_labEight;

class Node<E>{
    E data;
    Node<E> next, prev;
    public Node(E data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLL<E> {
    Node<E> head;
    public DLL() {
        head = null;
    }

    public Node<E> addFirst(E e){
        Node<E> newNode = new Node<E>(e);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        return newNode;
    }

    public Node<E> addLast(E e){
        Node<E> newNode = new Node<E>(e);
        if(head == null){
            head = newNode;
        }
        else{
            Node<E> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        return newNode;
    }

    public Node<E> addAfter(E e, Node<E> position){
        Node<E> newNode= new Node<E>(e);
        if(head == null){
            throw new IllegalStateException("Bos liste");
        }else{
            Node<E> temp = head;
            while(temp != position){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        return newNode;
    }

    public Node<E> addBefore(E e, Node<E> position){
        Node<E> newNode = new Node<E>(e);
        if(head == null){
            throw new IllegalStateException("Bos liste");
        }else{
            Node<E> temp = head;
            while(temp.next != position){
                temp = temp.next;
            }
            Node<E> nextNode = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            nextNode.prev = newNode;
            newNode.next = nextNode;
        }
        return newNode;
    }

    public Node<E> First(){
        if(head == null){
            throw new IllegalStateException("Bos liste");
        }else{
            return head;
        }
    }

    public Node<E> Last(){
        if(head == null){
            throw new IllegalStateException("Bos liste");
        }
        else{
            Node<E> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            return temp;
        }
    }

    public E remove(Node<E> position){
        E temp = null;
        if(head == null){
            throw new IllegalStateException("Bos liste");
        }else{
            Node<E> current = head;
            while(current.next != position && current.next != null){
                if(current == position){
                    break;
                }
                current = current.next;
            }
            if(current.next == position) {
                if (current.next.next == null) {
                    temp = current.next.data;
                    current.next = null;
                } else {
                    temp = current.next.data;
                    current.next = current.next.next;
                }
            }else{
                temp = current.data;
                head = head.next;
            }
        }
        return temp;
    }

    public E set(Node<E> position,E e){
        Node<E> current = head;
        while(current != position){
            current = current.next;
        }
        E temp = current.data;
        current.data = e;
        return temp;
    }

    public void printList(){
        Node<E> current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


}

public class DLLPositionalList {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addLast(40);
        dll.printList();

        System.out.println("Remove last: " + dll.remove(dll.Last()));
        dll.printList();
        System.out.println("Remove first: " + dll.remove(dll.First()));

        dll.printList();

        System.out.println("Position of First Node: " + dll.First());
        System.out.println("Position of Last Node: " + dll.Last());

    }
}
