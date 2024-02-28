class Kerucut{
    public int r;
    public int sisiMiring;

    public Kerucut(int jr, int sm) {
        r = jr;
        sisiMiring = sm;
    }

    double hitungVolume(){
        return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * sisiMiring;
    }

    double luasPermukaanKrc(){
        double garisPelukis = Math.sqrt(Math.pow(sisiMiring, 2) + Math.pow(r, 2));
        return Math.PI * r * garisPelukis + Math.PI * Math.pow(r, 2);
    }
}