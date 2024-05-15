public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();

        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        dll.addLast(2);
        dll.addLast(5);
        dll.print();
        dll.printFromTail();

        //lanjutkan dengan memanggil method merge, split
        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.addFirst(8);
        dll2.addFirst(78);
        dll2.addFirst(56);
        System.out.print("list 1 sebelum di merge: ");
        dll.print();
        System.out.print("List 2 sebelum di merge: ");
        dll2.print();
        
        DoubleLinkedList.merge(dll, dll2);
        System.out.print("List setelah di merge:");
        dll.print();
    }
    //No. 3 Kode Ganjil
    
    // //No. 3 Kode Genap
    // public static void split(DoubleLinkedList dll){
    //     //ex: 2,3,4,34,2,3,45,4 (original list)
    //     //list 1-> 2,3,4,34
    //     //list 2-> 2,3,45,4
    // }
}
