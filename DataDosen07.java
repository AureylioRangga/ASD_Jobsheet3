public class DataDosen07 {

    // a. tampil semua dosen
    void dataSemuaDosen(Dosen07[] arrayOfDosen) {

        int no = 1;

        for (Dosen07 d : arrayOfDosen) {

            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode : " + d.kode);
            System.out.println("Nama : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia : " + d.usia);
            System.out.println("----------------------");

        }

    }

    // b. jumlah dosen per jenis kelamin
    void jumlahDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {

        int pria = 0;
        int wanita = 0;

        for (Dosen07 d : arrayOfDosen) {

            if (d.jenisKelamin == true)
                pria++;
            else
                wanita++;
        }

        System.out.println("Jumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);

    }

    // c. rata-rata usia
    void rerataUsiaDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {

        int totalPria = 0, totalWanita = 0;
        int pria = 0, wanita = 0;

        for (Dosen07 d : arrayOfDosen) {
            if (d.jenisKelamin == true) {
                totalPria += d.usia;
                pria++;
            } else {
                totalWanita += d.usia;
                wanita++;

            }

        }

        System.out.println("Rata-rata usia pria : " + (totalPria / pria));
        System.out.println("Rata-rata usia wanita : " + (totalWanita / wanita));

    }

    // d. dosen paling tua
    void infoDosenPalingTua(Dosen07[] arrayOfDosen) {

        Dosen07 palingTua = arrayOfDosen[0];

        for (Dosen07 d : arrayOfDosen) {
            if (d.usia > palingTua.usia) {
                palingTua = d;
            }

        }

        System.out.println("Dosen Paling Tua");
        System.out.println("Kode : " + palingTua.kode);
        System.out.println("Nama : " + palingTua.nama);
        System.out.println("Jenis Kelamin : " + (palingTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia : " + palingTua.usia);

    }

    // e. dosen paling muda
    void infoDosenPalingMuda(Dosen07[] arrayOfDosen) {

        Dosen07 palingMuda = arrayOfDosen[0];

        for (Dosen07 d : arrayOfDosen) {

            if (d.usia < palingMuda.usia) {

                palingMuda = d;

            }

        }

        System.out.println("Dosen Paling Muda");
        System.out.println("Kode : " + palingMuda.kode);
        System.out.println("Nama : " + palingMuda.nama);
        System.out.println("Jenis Kelamin : " + (palingMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia : " + palingMuda.usia);

    }

}