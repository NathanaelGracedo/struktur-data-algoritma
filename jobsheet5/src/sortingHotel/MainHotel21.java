package sortingHotel;

public class MainHotel21 {
    public static void main(String[] args) {
    HotelService21 list = new HotelService21();
    Hotel21 h1 = new Hotel21("Sumber Makmur", "TulungAgung", 350000, (byte)3);
    Hotel21 h2 = new Hotel21("Kreta Kencana", "Blitar", 145000, (byte)2);
    Hotel21 h3 = new Hotel21("Gudang Garam", "Kediri", 550000, (byte)5);
    Hotel21 h4 = new Hotel21("Mekar Sari", "Probolinggo", 90000, (byte)1);
    
    list.tambahHotel(h1);
    list.tambahHotel(h2);
    list.tambahHotel(h3);
    list.tambahHotel(h4);

    System.out.println("Data Harga Hotel sebelum sorting:");
    list.tampil();

    System.out.println("Daftar Hotel Berdasarkan Bintang");
    System.out.println("Metode Bubble Sort");
    list.bubbleSortRtHotel();
    list.tampil();
    System.out.println("Metode Selection Sort");
    list.selectionSortRtHotel();;
    list.tampil();
    
    System.out.println("Daftar Hotel Berdasarkan Harga");
    System.out.println("Metode Bubble Sort");
    list.bubbleSortHrgHotel();
    list.tampil();
    System.out.println("Metode Selection Sort");
    list.selectionSortHrgHotel();
    list.tampil();
    }
}
