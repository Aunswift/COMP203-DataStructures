package j_labTen;

class Node{
     int data;
     Node left;
     Node right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node insert(Node node, int data) {
        Node newNode = new Node(data);
        if (node == null) {
            node = newNode;
            return node;
        }
        else {
            if(data <  node.data){
                node.left = insert(node.left, data);
            }else if(data > node.data){
                node.right = insert(node.right, data);
            }
        }
        return node;
    }
    public Node delete(Node node, int data) {
        if(node == null) return root;

        if(data < node.data) {
            node.left = delete(node.left, data);
        }
        else if(data > node.data) {
            node.right = delete(node.right, data);
        } else{
            if(node.left == null || node.right == null){
                Node temp = null;
                temp = node.left == null ? node.right : node.left;

                if(temp == null){
                    return null;
                }
                else{
                    return temp;
                }
            }else{
                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right, successor.data);
                return node;
            }
        }
        return node;
    }

    public Node getSuccessor(Node node) {
        if(node == null) return null;

        Node temp = node.right;

        while(temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public boolean isBST(Node root) {
        if(root == null) return true;
        boolean left = true;
        boolean right = true;
        if(root.left != null && root.left.data < root.data) {
            left = isBST(root.left);
        }
        if(root.right != null && root.right.data > root.data) {
            right = isBST(root.right);
        }
        return left && right;
    }

    public void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void setRoot(int data){
        root = new Node(data);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.setRoot(40);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 25);
        tree.insert(tree.root, 35);
        tree.insert(tree.root, 50);
        tree.insert(tree.root, 45);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 28);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 27);
        tree.insert(tree.root, 29);
        tree.insert(tree.root, 15);
        tree.inOrder(tree.root);
        System.out.println("\n");
        tree.delete(tree.root, 50);
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println(tree.isBST(tree.root));
    }
}