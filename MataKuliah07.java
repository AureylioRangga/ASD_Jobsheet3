public class MataKuliah07 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah07 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }   

    // method untuk menambah data mata kuliah soal no 2
    void tambahData(String kd, String nm, int s) {
        kode = kd;
        nama = nm;
        sks = s;
    }

    // method untuk centak info() soal no 3
    void cetakInfo() {
         System.out.println("Kode : " + kode);
         System.out.println("Nama : " + nama);
         System.out.println("SKS : " + sks);
         System.out.println("Jumlah Jam : " + jumlahJam);
    
    }
}
