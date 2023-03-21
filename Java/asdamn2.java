
class Node {
    int data;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

    Node left;
    Node right;

}

class Tree {
    Node root;

    boolean isEmpty() {
        return root == null;
    }

    void insert(Node newNode) {
        if (isEmpty()) {
            root = newNode;
            return;

        }
    }

    void insertRec(Node currentNode, Node newNode) {
        if (currentNode == null) {
            currentNode = newNode;
            return;
        }
        if (newNode.data < currentNode.data) {
            if(currentNode.left == null){
                currentNode.left = newNode;
            } else
            insertRec(currentNode.left, newNode);
        }
        if (newNode.data > currentNode.data) {
            if(currentNode.right == null){
                currentNode.right = newNode;
            }else
            insertRec(currentNode.right, newNode);
        }
       }

    void preOrder(Node current) {
        if (current == null) {
            return;
        }
        System.out.println(current.data);
        preOrder(current.left);
        preOrder(current.right);

    }

}

public class asdamn2 {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(new Node(10));
        t.insert(new Node(9));
        t.insert(new Node(30));
        t.insert(new Node(1));
        t.insert(new Node(100));
        t.preOrder(t.root);
    }
}