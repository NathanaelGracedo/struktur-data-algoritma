package Vaksin;

class DLL {
    Node head, tail;
    int size;

    DLL() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addLast(Orang data) {
        Node newNode = new Node(tail, data, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Penerima Vaksin " + data.nama + " telah ditambahkan");
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada data yang bisa dihapus");
        } else {
            System.out.println("Penerima Vaksin " + head.data.nama + " telah divaksinasi dan dihapus dari antrian");
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data.no + " " + current.data.nama);
                current = current.next;
            }
            System.out.println("Jumlah antrian tersisa: " + size);
        }
    }

    int size() {
        return size;
    }
}