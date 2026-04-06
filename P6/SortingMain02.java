package P6;

public class SortingMain02 {
    int a[] = {20, 10, 2, 7, 12};

    Sorting02 dataurut1 = new Sorting02(a, a.length);

    public static void main(String[] args) {
        SortingMain02 main = new SortingMain02();
    }
    
    SortingMain02() {
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }

}
