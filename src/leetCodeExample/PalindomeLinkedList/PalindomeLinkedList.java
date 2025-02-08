package leetCodeExample.PalindomeLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next,prev;
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class PalindomeLinkedList {
    Node head;
    Node tail;
    public PalindomeLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        return newNode;
    }

    public static boolean isPalindome(Node head, Node tail) {
        boolean isPalindome;
        if(head == null){
            isPalindome = true;
        }else if(head.data == tail.data){
            isPalindome = true;
            isPalindome(head.next, tail.prev);
        }
        else{
            isPalindome = false;
        }
        return isPalindome;
    }

    public static  void display(Node head) {
        Node current = head;
        System.out.print("head -> ");
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(" NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        PalindomeLinkedList list = new PalindomeLinkedList();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the data: \nEnter 0000 to exit: ");
            int data = sc.nextInt();
            if(data == 0000){
                break;
            }
            list.insert(data);
        }
        System.out.println("Your list: ");
        display(list.head);
        sc.close();
        System.out.println("Is your list palindome? \n" + isPalindome(list.head, list.tail));
    }
}
