import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Rumus Menghitung Permutasi");
        System.out.println("2. Rumus Menghitung massa jenis");
        System.out.print("Input Pilihan : ");
        int pilihan = input.nextInt();

        if (pilihan == 1){
            System.out.println("Syarat n > r");
            System.out.print("Masukkan nilai n: ");
            int n = input.nextInt();
            System.out.print("Masukkan nilai r: ");
            int r = input.nextInt();
            if (n >= r){
                Rumus perm = new Rumus(n, r);
                System.out.println("Permutasi dari " + n + " dan " + r + " adalah " + perm.permutasi(n, r));
            } else if (n < r) {
                System.out.println("Maaf Permutasi tidak dapat dihitung");
            }
        } else if (pilihan == 2){
            System.out.print("Masukkan nilai massa (dalam kg) : ");
            double m = input.nextDouble();
            System.out.print("Masukkan nilai volume (dalam m^3) : ");
            double v = input.nextDouble();
            Rumus massajenis = new Rumus(m, v);
            System.out.println("Nilai massa jenisnya adalah " + massajenis.rho(m,v));
        }
        else {
            System.out.println("Input yang Dimasukkan Salah");
            System.exit(0);
        }
    }
}