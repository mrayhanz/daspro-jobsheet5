import java.util.Scanner;

public class PemilihanHariDenganIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte dayName;

        System.out.print("Input number: ");
        dayName = sc.nextByte();

        if (dayName >= 1 && dayName <= 5) {
            System.out.println("Weekday");
        } else if (dayName == 6 || dayName == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}