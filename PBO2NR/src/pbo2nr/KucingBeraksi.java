package pbo2nr;
public class KucingBeraksi {
    public static void main(String[] args) {
        Kucing kucingKu = new Kucing();
        
        kucingKu.jenis="Anggora";
        kucingKu.jumlahKumis = 8;
        kucingKu.panjangEkor = 15.6;
        kucingKu.warna = "Jingga";
        
        kucingKu.info();
    }
}
