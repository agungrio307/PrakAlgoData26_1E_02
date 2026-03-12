package P5;

public class DaftarNilaiMHS {
    public static class Nilai {
        int uts[];
        int uas[];

        Nilai(int el) {
            uts = new int[el];
            uas = new int[el];
        }
        
        int maxUTS(int arr[], int l, int r) {
            if (l == r) {
                return arr[l];
            }
            int mid = (l + r) / 2;
            int kiri = maxUTS(arr, l, mid);
            int kanan = maxUTS(arr, mid + 1, r);
            
            if (kiri > kanan) {
                return kiri;
            } else {
                return kanan;
            }
        }
        
        int minUTS(int arr[], int l, int r) {
            if (l == r) {
                return arr[l];
            }
            int mid = (l + r) / 2;
            int kiri = minUTS(arr, l, mid);
            int kanan = minUTS(arr, mid + 1, r);
            
            if (kiri < kanan) {
                return kiri;
            } else {
                return kanan;
            }
        }

        double rataRataUTS() {
            double total = 0;
            for (int i = 0; i < uas.length; i++) {
                total += uas[i];
            }
            return total / uas.length;
        }
    }
}
