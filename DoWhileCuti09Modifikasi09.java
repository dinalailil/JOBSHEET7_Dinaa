import java.util.Scanner;
public class DoWhileCuti09Modifikasi09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do{
            System.out.println("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Semangat bekerja,terima kasih untuk anda yang tidak mengambil cuti");
                break; 
            }
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti-= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                }
            } else {
                System.out.println("Input tidak valid. Masukkan 'y' untuk ya atau 't' untuk tidak.");
            }
        } while (jatahCuti > 0);
    }
}

