package Tugas1;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node tmp = head;
        System.out.print("Isi linked list:\t");
        while (tmp != null) {
            System.out.print("[" + tmp.data.nim + " " + tmp.data.nama + "]\t");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    void addFirst(Mahasiswa input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, Mahasiswa input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (temp == tail) {
                    tail = ndInput;
                }
                return;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, Mahasiswa input) {
        Node ndInput = new Node(input, head);

        if (index < 0) {
            int length = getLength();
            index = length + index;

            if (index < 0) {
                System.out.println("Indeks melebihi batas");
                return;
            }
        }

        if (index > 0) {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Indeks melebihi batas");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Indeks melebihi batas");
                return;
            }
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (temp == tail) {
                tail = ndInput;
            }
        } else if (index == 0) {
            addFirst(input);
        }
    }

    int getLength() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
}
