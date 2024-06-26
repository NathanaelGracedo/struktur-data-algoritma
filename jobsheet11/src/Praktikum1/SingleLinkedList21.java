package Praktikum1;

public class SingleLinkedList21 {
    Node21 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node21 tmp = head;
        System.out.print("Isi linked list:\t");
        while (tmp != null) {
            System.out.print(tmp.data + "\t");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    void addFirst(int input) {
        Node21 ndInput = new Node21(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node21 ndInput = new Node21(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node21 ndInput = new Node21(input, null);
        Node21 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (temp == tail) {
                    tail = ndInput.next;
                }
                return;
            }
            temp = temp.next;
        } while (temp != null);
    }

    int getLength() {
        int length = 0;
        Node21 temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    void insertAt(int index, int input) {
        Node21 ndInput = new Node21(input, head);

        if (index < 0) {
            int length = getLength();
            index = length + index;

            if (index < 0) {
                System.out.println("Indeks melebihi batas");
                return;                
            }
        }

        if (index > 0 ) {
            Node21 temp = head;
            for (int i = 0; i < index; i++) {
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
}
