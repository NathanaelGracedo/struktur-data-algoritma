package Praktikum1;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        try {
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("=============================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("=============================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("=============================");
            dll.clear();
            dll.print();
            System.out.println("Size: " + dll.size());
            dll.addLast(50);
            dll.addLast(40);
            dll.addLast(10);
            dll.addLast(20);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("=============================");
            dll.removeFirst();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("=============================");
            dll.removeLast();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("=============================");
            dll.remove(1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("=============================");
            dll.clear();

            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size: " + dll.size());
            dll.add(40, 1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("=============================");
            System.out.println("Data awal pada linked list adalah:" + dll.getFirst());
            System.out.println("Data akhirr pada linked list adalah:" + dll.getLast());
            System.out.println("Data indeks ke-1 pada linked list adalah:" + dll.get(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
