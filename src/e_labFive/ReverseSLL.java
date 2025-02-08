package e_labFive;

class Node {
    int data;
    Node next;

    // Constructor for Node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseSLL {

    // Recursive function to reverse the linked list
    public static Node reverseList(Node current, Node prev) {
        if (current == null) { // Base case: if the end of the list is reached
            return prev;
        }
        Node nextNode = current.next; // Save the next node
        current.next = prev; // Reverse the current node's pointer
        return reverseList(nextNode, current); // Recursive call
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating the linked list: 4 -> 6 -> 8 -> 10 -> 12 -> null
        Node head = new Node(4);
        head.next = new Node(6);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(12);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverseList(head, null);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
