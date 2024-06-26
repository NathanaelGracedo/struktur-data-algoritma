package Tugas2;

public class Queue {
    Node head, tail;

    public Queue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(Mahasiswa data) {
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Mahasiswa data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return data;
        }
    }

    public Mahasiswa peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return head.data;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println("NIM: " + current.data.nim + ", Nama: " + current.data.nama);
                current = current.next;
            }
        }
    }
}
