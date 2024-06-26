package Praktikum2;

public class Queue21 {
    Nasabah21[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue21(int n) {
        max = n;
        data = new Nasabah21[max];
        size = 0;
        front = rear = -1;
   }

   public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
        return false;
        }
   }

   public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
   }

   public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama
                    + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
   }

   public void peekRear() {
    if (!IsEmpty()) {
        System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama
                    + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
   }

   public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i].norek + " " + data[i].nama 
                              + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i +1) % max;
            }
            System.out.print(data[i].norek + " " + data[i].nama 
                              + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
   }

   public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
   }

   public void Enqueue(Nasabah21 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
   }

    public Nasabah21 Dequeue() {
        Nasabah21 dt = new Nasabah21();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

}
