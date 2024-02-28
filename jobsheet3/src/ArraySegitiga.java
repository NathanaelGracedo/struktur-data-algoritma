class Segitiga{
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }

    public double hitungKeliling(){
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }
}

public class ArraySegitiga {
    public static void main(String[] args) {
    Segitiga[] sgArray = new Segitiga[4];

    sgArray[0] = new Segitiga(10, 4);
    sgArray[1] = new Segitiga(20, 10);
    sgArray[2] = new Segitiga(15, 6);
    sgArray[3] = new Segitiga(25, 10);

    for(int i = 0; i < sgArray.length; i++){
        System.out.println("Luas Segitiga ke-" + i + ": " + sgArray[i].hitungLuas() + ", Keliling Segitiga ke-" + i + ": " + sgArray[i].hitungKeliling());
    }
    }
}

