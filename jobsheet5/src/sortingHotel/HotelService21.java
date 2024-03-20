package sortingHotel;

public class HotelService21 {
    Hotel21 listRoom[] = new Hotel21[4];
    int idx;

    void tambahHotel(Hotel21 h){
        if(idx < listRoom.length){
            listRoom[idx] = h;
            idx++;
        }else{
            System.out.println("Data sudah Penuh");
        }
    }

    void tampil(){
        for(Hotel21 h : listRoom){
            h.tampil();
            System.out.println("----------------");
        }
    }

    void bubbleSortHrgHotel(){
        for (int i = 0; i < listRoom.length; i++) {
            for (int j = 1; j < listRoom.length - i; j++) {
                if(listRoom[j].harga < listRoom[j - 1].harga) {
                    Hotel21 tmp = listRoom[j];
                    listRoom[j] = listRoom[j - 1];
                    listRoom[j - 1] = tmp;
                }
            }
        }
    }

    void bubbleSortRtHotel(){
        for (int i = 0; i < listRoom.length; i++) {
            for (int j = 1; j < listRoom.length - i; j++) {
                if(listRoom[j].bintang < listRoom[j - 1].bintang) {
                    Hotel21 tmp = listRoom[j];
                    listRoom[j] = listRoom[j - 1];
                    listRoom[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSortHrgHotel(){
        for (int i = 0; i < listRoom.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listRoom.length; j++) {
                if(listRoom[j].harga < listRoom[idxMin].harga) {
                    idxMin = j;
            }
        }
        Hotel21 tmp = listRoom[idxMin];
        listRoom[idxMin] = listRoom[i];
        listRoom[i] = tmp;
        }
    }

    void selectionSortRtHotel(){
        for (int i = 0; i < listRoom.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listRoom.length; j++) {
                if(listRoom[j].bintang > listRoom[idxMin].bintang) {
                    idxMin = j;
            }
        }
        Hotel21 tmp = listRoom[idxMin];
        listRoom[idxMin] = listRoom[i];
        listRoom[i] = tmp;
        }
    }
}
