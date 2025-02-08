package d_labFour;

class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    // Constructor
    public Node(T data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class CDoublyLinkedList<T> {
    private Node<T> header;

    // Constructor
    public CDoublyLinkedList() {
        this.header = null;
    }

    // Append function
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (header == null) {
            header = newNode;
            header.next = header;
            header.prev = header;
        } else {
            Node<T> tail = header.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = header;
            header.prev = newNode;
        }
    }

    // Delete function
    public void delete(T data) {
        if (header == null) {
            System.out.println("List is empty.");
            return;
        }

        Node<T> current = header;
        do {
            if (current.data.equals(data)) {
                if (current == header && current.next == header) {
                    // Only one node in the list
                    header = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    if (current == header) {
                        header = current.next;
                    }
                }
                return;
            }
            current = current.next;
        } while (current != header);

        System.out.println("Data not found in the list.");
    }

    // Display function
    public void display() {
        if (header == null) {
            System.out.println("List is empty.");
            return;
        }

        Node<T> current = header;
        System.out.print("header <-> ");
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != header);
        System.out.println("header");
    }



    public static void main(String[] args) {
        // String type CDLL
        CDoublyLinkedList<String> StrCDLL = new CDoublyLinkedList<>();
        StrCDLL.append("hello");
        StrCDLL.append("from");
        StrCDLL.append("the earth");
        StrCDLL.display(); // Output: header <->"hello" <-> "from" <->"the earth" <-> header
        StrCDLL.delete("from");
        StrCDLL.display(); // Output: header <->"hello" <-> "the earth" <-> header

        // Integer type CDLL
        CDoublyLinkedList<Integer> IntCDLL = new CDoublyLinkedList<>();
        IntCDLL.append(4);
        IntCDLL.append(8);
        IntCDLL.append(15);
        IntCDLL.append(16);
        IntCDLL.display(); // Output: header <-> 4 <->  8 <->  15 <-> 16 <-> header
        IntCDLL.delete(8);
        IntCDLL.display(); // Output: header <-> 4 <->  15 <-> 16 <-> header
    }
}
