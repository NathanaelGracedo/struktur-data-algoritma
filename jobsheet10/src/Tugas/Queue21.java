package Tugas;

class Queue21{
    Pembeli21[] data;
    int front, rear, size, max;

    Queue21(int n) {
        max = n;
        data = new Pembeli21[max];
        size = 0;
        front = rear = -1;
    }

    boolean isFull() {
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        }else{
            return false;
        }
     }

    void enqueue(Pembeli21 dt){
        if (isFull()){
            System.out.println("Antrian penuh");
        }else{
            if(isEmpty()){
                front = rear = 0;
            }else{
                if(rear == max - 1){
                    rear = 0;
                }else{
                    rear++;
                
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    Pembeli21 dequeue() {
        Pembeli21 dt = new Pembeli21();
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }else{
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else{
                if(front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }

        return dt;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nama);
        }else{
            System.out.println("Antrian kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }else{

            int i = front;
            while(i != rear){
                System.out.print(data[i].nama + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void clear() {
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }else{
            System.out.println("Antrian masih kosong");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[rear].nama);
        }else{
            System.out.println("Antrian kosong");
        }
    }   

    void peekPosition(String nama){
        if (!isEmpty()) {
            int i = front;
            int pos = 0;
            while(i != rear){
                if (data[i].nama.equals(nama)) {
                    System.out.println("Posisi " + nama + " ada di antrian ke-" + pos);
                    break;
                }
                i = (i + 1) % max;
                pos++;
            }
            if (data[i].nama.equals(nama)) {
                System.out.println("Posisi " + nama + " ada di antrian ke-" + pos);
            }
        }else{
            System.out.println("Antrian kosong");
        }
    }

    void daftarPembeli() {

        for(Pembeli21 n : data){
            System.out.println(n.nama);
        }
    }
}