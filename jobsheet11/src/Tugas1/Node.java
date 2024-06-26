package Tugas1;

public class Node {
    Mahasiswa data;
    Node next;

    public Node(Mahasiswa data, Node berikutnya) {
        this.data = data;
        this.next = berikutnya;
    }
}
