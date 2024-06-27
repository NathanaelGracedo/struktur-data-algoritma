package P14;
 
public class DoubleLinkedLists {
    Node21 head;
    int size;
 
    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }
 
    public boolean isEmpty() {
        return head == null;
    }
 
    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node21(null, item, jarak, null);
        } else {
            Node21 newNode = new Node21(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
 
    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node21 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node21 newNode = new Node21(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }
 
    public void add(int item, int index, int jarak) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeeks di luar batas");
        } else {
            if (index == 0) {
                addFirst(item, jarak);
            } else {
                Node21 current = head;
                int i = 0;
                while (i < index - 1) {
                    current = current.next;
                    i++;
                }
                if (current.next == null) {
                    Node21 newNode = new Node21(current, item, jarak, null);
                    current.next = newNode;
                } else {
                    Node21 newNode = new Node21(current, item, jarak, current.next);
                    newNode.next.prev = newNode;
                    current.next = newNode;
                }
                size++;
            }
        }
    }
 
    public int size() {
        return size;
    }
 
    public void clear() {
        head = null;
        size = 0;
    }
 
    public void print() {
        if (!isEmpty()) {
            Node21 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists kosong");
        }
    }
 
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }
        if (size == 1) {
            this.removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
 
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }
 
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
 
        Node21 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
 
        current.next = null;
        size--;
    }
 
    public void remove(int index) throws Exception {
        Node21 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    this.removeFirst();
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }
 
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
 
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node21 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
 
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node21 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
 
    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node21 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
}
