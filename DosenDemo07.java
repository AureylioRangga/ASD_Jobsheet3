import java.util.Scanner;

public class DosenDemo07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();   
        input.nextLine();

        // membuat array of object Dosen sebanyak jumlah yang diinput
        Dosen07[] arrayOfDosen = new Dosen07[jumlah];

        // looping FOR untuk input data dosen
        for (int i = 0; i < jumlah; i++) {

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode           : ");
            String kode = input.nextLine();

            System.out.print("Nama           : ");
            String nama = input.nextLine();

            System.out.print("Jenis Kelamin  : ");
            String jkInput = input.nextLine();

            System.out.print("Usia           : ");
            int usia = input.nextInt();
            input.nextLine(); 

            // membuat variabel Boolean untuk jenis kelamin
            Boolean jk;

            if (jkInput.equalsIgnoreCase("Laki-laki")) {

                jk = true; 

            } else {

                jk = false;

            }

            // membuat object Dosen dan menyimpannya ke array
            arrayOfDosen[i] = new Dosen07(kode, nama, jk, usia);

            System.out.println("-------------------------------");

        }

        System.out.println("\nDATA DOSEN");

        int no = 1; // nomor urutan dosen

        // looping ForEach untuk menampilkan data
        for (Dosen07 d : arrayOfDosen) {

            System.out.println("Data Dosen ke-" + no++);

            System.out.println("Kode           : " + d.kode);
            System.out.println("Nama           : " + d.nama);
            System.out.println("Jenis Kelamin  : " + (d.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia           : " + d.usia);

            System.out.println("--------------------------------");

        }

    }

}