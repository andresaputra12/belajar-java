import java.util.List;

public class Transaksi {
    private Pembeli pembeli;
    private List<Mobil> mobilDibeli;

    // Constructor
    public Transaksi(Pembeli pembeli, List<Mobil> mobilDibeli) {
        this.pembeli = pembeli;
        this.mobilDibeli = mobilDibeli;
    }

    // Menampilkan detail transaksi
    public void tampilkanTransaksi() {
        System.out.println("Transaksi Pembelian oleh: " + pembeli.getNama());
        for (Mobil mobil : mobilDibeli) {
            System.out.println(mobil);
        }
        System.out.println("Total Harga: Rp " + pembeli.getTotalHarga());
    }
}
