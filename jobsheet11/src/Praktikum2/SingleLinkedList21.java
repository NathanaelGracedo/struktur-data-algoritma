package Praktikum2;

class SingleLinkedList21 {
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
                    tail = ndInput;
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
        Node21 ndInput = new Node21(input, null);

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

    int getData(int index) {
        if (isEmpty()) {
            return -1;
        }
        
        if (index < 0) {
            int length = getLength();
            index = length + index;

            if (index < 0) {
                return -1;
            }
        }

        Node21 temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return -1;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return -1;
        }
        return temp.data;
    }

    int indexOf(int key) {
        Node21 temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        } else {
            System.out.println("List kosong, tidak bisa menghapus!");
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node21 temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        } else {
            System.out.println("List kosong, tidak bisa menghapus!");
        }
    }

    void remove(int key) {
        if (!isEmpty()) {
            if (head.data == key) {
                removeFirst();
            } else if (tail.data == key) {
                removeLast();
            } else {
                Node21 temp = head;
                while (temp.next != null) {
                    if (temp.next.data == key) {
                        temp.next = temp.next.next;
                        return;
                    }
                    temp = temp.next;
                }
                System.out.println("Key " + key + " tidak ditemukan!");
            }
        } else {
            System.out.println("List kosong, tidak bisa menghapus!");
        }
    }

    public void removeAt(int index) {
        if (!isEmpty()) {
            if (index < 0) {
                int length = getLength();
                index = length + index;

                if (index < 0) {
                    System.out.println("Indeks melebihi batas");
                    return;
                }
            }

            if (index == 0) {
                removeFirst();
            } else {
                Node21 temp = head;
                for (int i = 0; i < index - 1; i++) {
                    if (temp == null) {
                        System.out.println("Indeks melebihi batas");
                        return;
                    }
                    temp = temp.next;
                }
                if (temp == null || temp.next == null) {
                    System.out.println("Indeks melebihi batas");
                    return;
                }
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        } else {
            System.out.println("List kosong, tidak bisa menghapus!");
        }
    }
}