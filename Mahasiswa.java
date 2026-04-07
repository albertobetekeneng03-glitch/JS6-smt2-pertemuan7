class Mahasiswa03 {
    public static void main(String[]args){
        MahasiswaBerprestasi03 mhs = new MahasiswaBerprestasi03();
        mhs.tambah(new Mahasiswa03("210001", "Andi", "TI-1A", 3.5));
        mhs.tambah(new Mahasiswa03("210002", "Budi", "TI-1B", 3.8));
        mhs.tambah(new Mahasiswa03("210003", "Citra", "TI-1C", 3.2));
        mhs.tambah(new Mahasiswa03("210004", "Dewi", "TI-1D", 3.9));
        mhs.tambah(new Mahasiswa03("210005", "Eka", "TI-1E", 3.6));

        System.out.println("Data sebelum diurutkan:");
        mhs.tampil();

        mhs.bubbleSort();

        System.out.println("Data setelah diurutkan berdasarkan IPK:");
        mhs.tampil();
    }

    
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor kosong
    Mahasiswa03() {
    }

    // Konstruktor dengan parameter
    Mahasiswa03(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}

class MahasiswaBerprestasi03 {
    Mahasiswa03[] lisMhs = new Mahasiswa03[5];
    int idx;

    void tambah(Mahasiswa03 m) {
        if (idx < lisMhs.length) {
            lisMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa03 m : lisMhs) {
            if (m != null) {
                System.out.println("NIM   : " + m.nim);
                System.out.println("Nama  : " + m.nama);
                System.out.println("IPK   : " + m.ipk);
                System.out.println("-------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (lisMhs[j].ipk < lisMhs[j + 1].ipk) {
                    Mahasiswa03 tmp = lisMhs[j];
                    lisMhs[j] = lisMhs[j + 1];
                    lisMhs[j + 1] = tmp;

                
                }
            }
        }
    }
}