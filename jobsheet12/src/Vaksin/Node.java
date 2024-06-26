package Vaksin;

public class Node {
    Orang data;
    Node next, prev;

    public Node(Node prev, Orang data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
