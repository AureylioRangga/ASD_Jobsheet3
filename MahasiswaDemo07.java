public class MahasiswaDemo07 {
    public static void main(String[]args) {
        Mahasiswa07[] arrayOfMahasiswa = new Mahasiswa07[3];

        arrayOfMahasiswa[0] = new Mahasiswa07();
        arrayOfMahasiswa[0]. nim = "2441070600033";
        arrayOfMahasiswa[0]. nama = "AGNEZ TITANIA KINANTI";
        arrayOfMahasiswa[0]. kelas = "SIB 1-E";
        arrayOfMahasiswa[0]. ipk = (float)3.75;

        arrayOfMahasiswa[1] = new Mahasiswa07();
        arrayOfMahasiswa[1]. nim = "2341720172";
        arrayOfMahasiswa[1]. nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1]. kelas = "TI - 2A";
        arrayOfMahasiswa[1]. ipk = (float)3.36;

        arrayOfMahasiswa[2] = new Mahasiswa07();
        arrayOfMahasiswa[2]. nim = "2341720172";
        arrayOfMahasiswa[2]. nama = "DHIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2]. kelas = "TI - 2A";
        arrayOfMahasiswa[2]. ipk = (float)3.8;

        for(int i = 0; i < arrayOfMahasiswa.length; i++) {

            System.out.println("NIM : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK : " + arrayOfMahasiswa[i].ipk);
            System.out.println("-----------------------");
        }
    }
}