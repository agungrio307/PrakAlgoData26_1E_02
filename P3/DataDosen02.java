package P3;

public class DataDosen02 {
    public void dataSemuaDosen(Dosen02[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i].tampilData();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totalUsiaPria += arrayOfDosen[i].usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += arrayOfDosen[i].usia;
                jumlahWanita++;
            }
        }

        double rerataUsiaPria = (jumlahPria > 0) ? (double) totalUsiaPria / jumlahPria : 0;
        double rerataUsiaWanita = (jumlahWanita > 0) ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria   : " + rerataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rerataUsiaWanita);
    }
    
    public void infoDosenPalingTua(Dosen02[] arrayOfDosen) {
        Dosen02 dosenTua = arrayOfDosen[0];

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenTua.usia) {
                dosenTua = arrayOfDosen[i];
            }
        }

        System.out.println("=== DOSEN PALING TUA ===");
        dosenTua.tampilData();
    }

    public void infoDosenPalingMuda(Dosen02[] arrayOfDosen) {
        Dosen02 dosenMuda = arrayOfDosen[0];

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenMuda.usia) {
                dosenMuda = arrayOfDosen[i];
            }
        }

        System.out.println("==== DOSEN PALING MUDA ====");
        dosenMuda.tampilData();
    }
}
