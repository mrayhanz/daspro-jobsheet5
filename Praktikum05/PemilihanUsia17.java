import java.util.Scanner;

public class PemilihanUsia17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usia;

        System.out.print("Masukkan Usia : ");
        usia = sc.nextInt();

        if (usia>0) {
            if (usia<=12) {
                System.out.println("Kategori Usia Anda Adalah Anak");
            }else if (usia<=19) {
                System.out.println("Kategori Usia Anda Adalah Remaja");
            }else if (usia<=64) {
                System.out.println(" Kategori Usia Anda Adalah Dewasa");
            }else if (usia > 64) {
                System.out.println(" Kategori Usia Anda Adalah Lansia");
            }
        }else{
            System.out.println("Usia yang anda masukkan tidak valid");
        }
    }
}

