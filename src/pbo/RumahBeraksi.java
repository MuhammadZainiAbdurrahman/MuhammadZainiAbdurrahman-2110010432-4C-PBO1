package pbo;

import java.util.Scanner;
//inheritance
public class RumahBeraksi {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Input Jumlah Rumah
            System.out.print("Masukkan jumlah rumah: ");
            int jumlahRumah = Integer.parseInt(scanner.nextLine());

            Rumah[] rumahArray = new Rumah[jumlahRumah];

            // Perulangan untuk Input Data Rumah
            for (int i = 0; i < rumahArray.length; i++) {
                System.out.println("Masukkan data rumah ke-" + (i + 1));
                System.out.print("Jenis Rumah: ");
                String jenis = scanner.nextLine();
                System.out.print("Luas Rumah: ");
                int luas = Integer.parseInt(scanner.nextLine());
                System.out.print("Alamat Rumah: ");
                String alamat = scanner.nextLine();

                rumahArray[i] = new RumahDetail(jenis, luas, alamat);
            }

            // Output Informasi Rumah
            System.out.println("Data Rumah:");
            for (Rumah rumah : rumahArray) {
                System.out.println("==================");
                rumah.displayInfo();
                System.out.println("Fasilitas: " + rumah.getFasilitas());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}
