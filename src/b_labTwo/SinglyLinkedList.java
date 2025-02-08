package b_labTwo;

class Node<E>{
    E data;
    Node<E> next;
    public Node(E data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList<E>{
    Node<E> head;
    public SinglyLinkedList(){
        this.head = null;
    }

    public void append(E data){
        Node<E> newNode = new Node<>(data);

        if(this.head == null){
            this.head = newNode;
        }else{
            Node<E> current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void delete(E data){
        if(this.head == null){
            throw new IllegalArgumentException("List is empty");
        }
        if(this.head.data == data){
            this.head = this.head.next;
        }
        else{
            Node<E> current = this.head;
            while(current.next.data != data){
                current = current.next;
            }
            if(current.next.next == null){
                current.next = null;
            }else{
                current.next = current.next.next;
            }
        }
    }

    public void display(){
        if(this.head == null){
            throw new IllegalArgumentException("List is empty");
        }
        else{
            Node<E> current = this.head;
            System.out.print("header -> ");
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> IntSLL = new SinglyLinkedList<>();
        IntSLL.append(1);
        IntSLL.append(2);
        IntSLL.append(3);
        IntSLL.display();
        IntSLL.delete(2);
        IntSLL.display();

        System.out.println("\n");

        SinglyLinkedList<String> StrSLL = new SinglyLinkedList<>();
        StrSLL.append("Apple");
        StrSLL.append("Banana");
        StrSLL.append("Cherry");
        StrSLL.display();
    }


}