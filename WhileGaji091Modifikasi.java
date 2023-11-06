import java.util.Scanner;
public class WhileGaji091Modifikasi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            jabatan = scan.next();

            if (jabatan.equalsIgnoreCase("direktur") || jabatan.equalsIgnoreCase("manajer") || jabatan.equalsIgnoreCase("karyawan")) {
                System.out.print("Masukkan jumlah jam lembur: ");
                jumlahJamLembur = scan.nextInt();

                if (jabatan.equalsIgnoreCase("manajer")) {
                    gajiLembur = jumlahJamLembur * 100000;
                } else if (jabatan.equalsIgnoreCase("karyawan")) {
                    gajiLembur = jumlahJamLembur * 75000;
                }

                totalGajiLembur += gajiLembur;
                i++;
            } else {
                System.out.println("Jabatan tidak valid. Silakan masukkan jabatan yang valid.");
               
            }
        }
            System.out.print("Total gaji lembur: " + totalGajiLembur);
    }
        
}