package pbo;

public class Rumah {
    // Atribut dan Encapsulation
    private String jenis;
    private int luas;
    private String alamat;

    // Constructor
    public Rumah(String jenis, int luas, String alamat) {
        this.jenis = jenis;
        this.luas = luas;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method untuk menampilkan informasi rumah
    public void displayInfo() {
        System.out.println("Jenis Rumah: " + jenis);
        System.out.println("Luas Rumah: " + luas + " m2");
        System.out.println("Alamat Rumah: " + alamat);
    }
    
    // Method untuk mendapatkan fasilitas
    public String getFasilitas() {
        return "Tidak ada fasilitas khusus";
    }
}
