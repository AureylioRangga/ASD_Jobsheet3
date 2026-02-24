import java.util.Scanner;
public class MataKuliahDemo07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MataKuliah07[] arrayMataKuliah = new MataKuliah07[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i<3; i++){
            System.out.println("Masukkan Data Mata Kuliah Ke-" + (i+1) + " : ");
            System.out.print("Kode       :  ");
            kode = sc.nextLine();
            System.out.print("Nama       :  ");
            nama = sc.nextLine();
            System.out.print("SKS        :  ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam :  ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------");  

            arrayMataKuliah[i] = new MataKuliah07(kode, nama, sks, jumlahJam);
        }

        // menambah data mata kuliah soal no 2
        for (int i=0; i<3; i++){
            System.out.println("Masukkan Data Mata Kuliah Ke-" + (i+1) + " : ");
            System.out.print("Kode       :  ");
            kode = sc.nextLine();
            System.out.print("Nama       :  ");
            nama = sc.nextLine();
            System.out.print("SKS        :  ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            arrayMataKuliah[i].tambahData(kode, nama, sks);
            System.out.println("-------------------------------------");  
        }

        // mencetak info mata kuliah soal no 3
        for (int i=0; i<3; i++){
            System.out.println("Data Mata Kuliah Ke-" + (i+1) + " : ");
            arrayMataKuliah[i].cetakInfo();
            System.out.println("-------------------------------------");  
        }

        for (int j=0; j<3; j++){
            System.out.println("Data Mata Kuliah Ke-" + (j+1) + " : ");
            System.out.println("Kode       : " + arrayMataKuliah[j].kode);
            System.out.println("Nama       : " + arrayMataKuliah[j].nama);
            System.out.println("SKS        : " + arrayMataKuliah[j].sks);
            System.out.println("Jumlah Jam : " + arrayMataKuliah[j].jumlahJam);
            System.out.println("-------------------------------------");  
        }
    }
}