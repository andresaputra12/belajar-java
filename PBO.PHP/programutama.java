import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar mobil yang tersedia
        List<Mobil> mobilList = new ArrayList<>();
        mobilList.add(new Mobil("Sedan", 200000000));
        mobilList.add(new Mobil("Minibus", 300000000));
        mobilList.add(new Mobil("Bus", 500000000));

        // Daftar karyawan
        Karyawan karyawan = new Karyawan("Joko");

        // Pendaftaran pembeli
        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();
        System.out.print("Jenis pembeli (Individu/Borongan): ");
        String jenisPembeli = scanner.nextLine();

        Pembeli pembeli = new Pembeli(namaPembeli, jenisPembeli);

        // Pembeli memilih mobil untuk dibeli
        System.out.println("\nDaftar mobil yang tersedia:");
        for (int i = 0; i < mobilList.size(); i++) {
            System.out.println((i + 1) + ". " + mobilList.get(i));
        }

        System.out.print("Pilih tipe mobil yang akan dibeli (1/2/3): ");
        int pilihanMobil = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Mobil mobilYangDipilih = mobilList.get(pilihanMobil - 1);
        pembeli.beliMobil(mobilYangDipilih);

        // Transaksi
        Transaksi transaksi = new Transaksi(pembeli, pembeli.getMobilDibeli());
        transaksi.tampilkanTransaksi();

        // Karyawan mendapatkan keuntungan
        karyawan.hitungKeuntungan(pembeli.getTotalHarga());

        System.out.println("\nKeuntungan Karyawan: Rp " + karyawan.getKeuntungan());
    }
}
