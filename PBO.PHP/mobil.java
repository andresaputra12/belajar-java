public class Mobil {
    private String tipe;
    private double harga;

    // Constructor
    public Mobil(String tipe, double harga) {
        this.tipe = tipe;
        this.harga = harga;
    }

    // Getter and Setter
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Tipe Mobil: " + tipe + ", Harga: Rp " + harga;
    }
}
