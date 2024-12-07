import java.util.Scanner;
 public class fungsi {
    // Fungsi Rekursif
    static int fungsiRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0; 
        } else {
            return angka[n-1] + fungsiRekursif(angka, n-1);
        }
    }
    // Fungsi Iteratif
    static int fungsiIteratif (int[] angka) {
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        return total;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N):  ");
        int n = sc.nextInt();

        int [] angka = new int [n];
        for(int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[n-i] = sc.nextInt();
        }
        System.out.println(" Fungsi Rekursif = Total dari " + n + " angka yang dimasukkan adalah: " + fungsiRekursif(angka, n));
        System.out.println(" Fungsi Iteratif = Total dari " + n + " angka yang dimasukkan adalah: " + fungsiIteratif(angka));
    }
}
