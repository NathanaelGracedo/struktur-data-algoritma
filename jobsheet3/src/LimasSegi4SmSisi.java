class LimasSegi4SmSisi{
    public int tinggi;
    public int sisiAlas;

    public LimasSegi4SmSisi(int t, int sa){
        tinggi = t;
        sisiAlas = sa;
    }
    
    double hitungVolume(){
        return (1.0 / 3.0) * sisiAlas * tinggi;
    }

    double hitunglpLim(){
        double luasAlas = sisiAlas * sisiAlas;
        double luasSisi = (sisiAlas * tinggi) / 2;
        return luasAlas + 4 * luasSisi;
    }
}