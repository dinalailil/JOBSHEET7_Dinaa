import java.util.Scanner;

public class WhileKelipatan09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0, i = 1;

        System.out.println("Masukkan bilangan kelipatan (1-10):");
        kelipatan = scan.nextInt();

        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }

        double rataRata = (double) jumlah / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}
