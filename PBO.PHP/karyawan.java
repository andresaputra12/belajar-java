public class Karyawan {
    private String nama;
    private double keuntungan;

    // Constructor
    public Karyawan(String nama) {
        this.nama = nama;
        this.keuntungan = 0;
    }

    // Method untuk menghitung keuntungan dari transaksi
    public void hitungKeuntungan(double totalHarga) {
        keuntungan += totalHarga * 0.1; // 10% keuntungan
    }

    // Getter
    public double getKeuntungan() {
        return keuntungan;
    }

    @Override
    public String toString() {
        return "Nama Karyawan: " + nama + ", Keuntungan: Rp " + keuntungan;
    }
}
