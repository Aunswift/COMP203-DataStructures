package i_labNine;

class Node<E>{
    E data;
    Node<E> left,right;

    public Node(E data){
        this.data = data;
        left = right = null;
    }
}
public class BinaryTree<E> {
    Node<E> root;
    public BinaryTree(){
        root = null;
    }

    public void PreOrderTraversal(Node<E> root){
        if (root != null) {
            System.out.print(root.data + " ");
            PreOrderTraversal(root.left);
            PreOrderTraversal(root.right);
        }
    }

    public void PostOrderTraversal(Node<E> root){
        if (root != null) {
            PostOrderTraversal(root.left);
            PostOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public int height(Node<E> root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public boolean find(Node<E> root,E element){
        if(root == null){
            return false;
        }
        if(root.data == element){
            return true;
        }
        if(find(root.left,element) || find(root.right,element)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.root = new Node<Integer>(1);
        tree.root.left = new Node<Integer>(2);
        tree.root.left.left = new Node<Integer>(4);
        tree.root.left.right = new Node<Integer>(5);
        tree.root.left.right.left = new Node<Integer>(8);
        tree.root.left.right.right = new Node<Integer>(9);
        tree.root.right = new Node<Integer>(3);
        tree.root.right.left = new Node<Integer>(6);
        tree.root.right.right = new Node<Integer>(7);

        tree.PostOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Is 6 included: " + tree.find(tree.root,6));
        System.out.println("\nHeight of tree: " + tree.height(tree.root));
        System.out.println("\nIs 13 included: " + tree.find(tree.root,13));
    }
}
