package c_labThree;
class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList<T> {
    Node<T> header,trailer;
    public DoublyLinkedList() {
        header = null;
        trailer = null;
    }

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (header == null) {
            header = newNode;
            trailer = newNode;
            return;
        } else {
            trailer.next = newNode;
            newNode.prev = trailer;
            trailer = newNode;
        }
    }
    public void delete(T data){
        Node<T> current = header;
        while(current.data != data){
            current = current.next;
        }
        if(current.next == null){
            trailer = current;
        }else if(current.next != null){
            current.next.prev = current.prev;
            current.prev.next= current.next;
        }
    }

    public void display(){
        System.out.print("header <-> ");
        Node<T> current = header;
        while(current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.print("trailer");
        System.out.println();
    }


    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        list.append("hello");
        list.append("from");
        list.append("the earth");
        list.display();
        list.delete("from");
        list.display();
        System.out.println("\n");

        DoublyLinkedList<Integer> list2 = new DoublyLinkedList<Integer>();
        list2.append(4);
        list2.append(8);
        list2.append(15);
        list2.append(16);
        list2.display();
        list2.delete(8);
        list2.display();
    }
}
