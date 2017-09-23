package pbo2nr;
public class main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.Nama = "Adul";
        m1.NPM = "13639999";
        m1.Alamat = "Sungai Besar";
        
        Mahasiswa m2 = new Mahasiswa();
        m2.Nama = "Bejo";
        m2.NPM = "13639998";
        m2.Alamat = "Sungai Ulin";
        
        m1.info();
        m2.info();
    }
}
