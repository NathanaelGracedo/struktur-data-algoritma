package P14;

public class Node21 {
    int data;
    Node21 prev, next;
    int jarak;

    Node21(Node21 prev, int data, int jarak, Node21 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
