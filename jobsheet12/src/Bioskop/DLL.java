package Bioskop;

class DoubleLinkedList {
    Node head, tail;
    int size;

    DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Film data) {
        Node newNode = new Node(null, data, head);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(Film data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node newNode = new Node(tail, data, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    void add(Film data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, data, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    void remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    void print() {
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                System.out.println("ID: " + current.data.id + ", Judul: " + current.data.judul + ", Rating: " + current.data.rating);
                current = current.next;
            }
            System.out.println();
        } else {
            System.out.println("List is empty");
        }
    }

    void searchByID(int id) {
        Node current = head;
        while (current != null) {
            if (current.data.id == id) {
                System.out.println("ID: " + current.data.id + ", Judul: " + current.data.judul + ", Rating: " + current.data.rating);
                return;
            }
            current = current.next;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan");
    }

    void sortDescending() {
        if (size > 1) {
            Node current = head;
            boolean wasChanged;

            do {
                wasChanged = false;
                current = head;

                while (current.next != null) {
                    if (current.data.rating < current.next.data.rating) {
                        Film temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                        wasChanged = true;
                    }
                    current = current.next;
                }
            } while (wasChanged);
        }
    }

    int size() {
        return size;
    }
}