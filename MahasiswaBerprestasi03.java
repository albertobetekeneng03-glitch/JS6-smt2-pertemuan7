public class MahasiswaBerprestasi03 {
    Mahasiswa03 [] lisMhs = new Mahasiswa03[5];
    int idx;

    void tambah(Mahasiswa03 m){
        if(idx < lisMhs.length){
            lisMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(Mahasiswa03 m : lisMhs){
            m.tampil();
            System.out.println("-------------------");
        }
    }

    // Sequential Search
    int sequentialSearch(double cari) {
        int posisi = -1;
        for (int i = 0; i < idx; i++) {
            if (lisMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            lisMhs[pos].tampil();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    // Binary Search (ASC)
    int findBinarySearch(double cari, int left, int right) {
        int mid;

        if (right >= left) {
            mid = (left + right) / 2;

            if (lisMhs[mid].ipk == cari) {
                return mid;
            } else if (lisMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    // Sort ASC (binary search)
    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lisMhs[j].ipk > lisMhs[j + 1].ipk) {
                    Mahasiswa03 tmp = lisMhs[j];
                    lisMhs[j] = lisMhs[j + 1];
                    lisMhs[j + 1] = tmp;
                }
            }
        }
    }
}


