import java.util.Scanner;

public class DosenDemo07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Dosen07[] arrayOfDosen = new Dosen07[jumlah];

        // input FOR
        for (int i = 0; i < jumlah; i++) {

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode  : ");
            String kode = input.nextLine();

            System.out.print("Nama  : ");
            String nama = input.nextLine();

            System.out.print("Jenis Kelamin (true=Pria, false=Wanita) : ");
            Boolean jk = input.nextBoolean();

            System.out.print("Usia   : ");
            int usia = input.nextInt();
            input.nextLine();

            arrayOfDosen[i] = new Dosen07(kode, nama, jk, usia);

            System.out.println("----------------------");

        }

        // tampil FOREACH
        System.out.println("\nDATA DOSEN");

        int no = 1;

        for (Dosen07 d : arrayOfDosen) {

            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode : " + d.kode);
            System.out.println("Nama : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia : " + d.usia);
            System.out.println("----------------------");

        }

        // panggil class DataDosen
        DataDosen07 data = new DataDosen07();

        data.jumlahDosenPerJenisKelamin(arrayOfDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);

    }

}