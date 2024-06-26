package P13;


public class Node21 {
    int data;
    Node21 left, right;
    public Node21 next;

    public Node21() {

    }

    public Node21(Node21 left, int data, Node21 right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}