class Balok{
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public Balok(int p){
        panjang = p;
        lebar = 25;
        tinggi = 10;
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}



public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] blArray = new Balok[4];

        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);
        blArray[3] = new Balok(45);

        for(int i = 0; i < blArray.length; i++) {
        System.out.println("Volume balok ke-"+ i + ": " + blArray[i].hitungVolume());
        }
    }
}