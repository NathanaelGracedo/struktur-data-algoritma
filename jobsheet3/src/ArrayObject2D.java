class Buah {
    public String nama;
    public String warna;
  }
  
  public class ArrayObject2D {
    public static void main(String[] args) {
      Buah[][] buahArray2D = new Buah[2][2];

      buahArray2D[0][0] = new Buah();
      buahArray2D[0][0].nama = "Apel";
      buahArray2D[0][0].warna = "Merah";
  
      
      buahArray2D[1][1] = new Buah();
      buahArray2D[1][1].nama = "Pisang";
      buahArray2D[1][1].warna = "Kuning";
  
      System.out.println("Nama elemen (0, 0): " + buahArray2D[0][0].nama);
      System.out.println("Warna elemen (0, 0): " + buahArray2D[0][0].warna);
    }
  }
  