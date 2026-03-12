package P5;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemenn = agung.nextInt();

        Sum sm = new Sum(elemenn);
        for (int i = 0; i < elemenn; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = agung.nextDouble();
        }

        System.out.println("Total (Brute Force): " + sm.totalBF());
        System.out.println("Total (Divide and Conquer): " + sm.totalDC(sm.keuntungan, 0, elemenn - 1));
    }
}
