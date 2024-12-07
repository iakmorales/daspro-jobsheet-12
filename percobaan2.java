import java.util.Scanner;
public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("x");
            System.out.print("1");
            return (1);
        } else {
            System.out.print(x);
            if (y > 1) {
                System.out.print("x");
            }
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}
