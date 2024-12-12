import java.util.ArrayList;
import java.util.List;

public class Pembeli {
    private String nama;
    private String jenisPembeli;  // "Individu" atau "Borongan"
    private List<Mobil> mobilDibeli;

    // Constructor
    public Pembeli(String nama, String jenisPembeli) {
        this.nama = nama;
        this.jenisPembeli = jenisPembeli;
        this.mobilDibeli = new ArrayList<>();
    }

    // Method untuk menambahkan mobil yang dibeli
    public void beliMobil(Mobil mobil) {
        mobilDibeli.add(mobil);
    }

    // Getter and Setter
    public String getNama() {
        return nama;
    }

    public String getJenisPembeli() {
        return jenisPembeli;
    }

    public List<Mobil> getMobilDibeli() {
        return mobilDibeli;
    }

    public double getTotalHarga() {
        double total = 0;
        for (Mobil mobil : mobilDibeli) {
            total += mobil.getHarga();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Nama Pembeli: " + nama + ", Jenis Pembeli: " + jenisPembeli + ", Total Harga: Rp " + getTotalHarga();
    }
}
