package pbo;


public class RumahDetail extends Rumah {
    // Atribut
    private String fasilitas;

    // Constructor
    public RumahDetail(String jenis, int luas, String alamat) {
        super(jenis, luas, alamat);
        this.fasilitas = getFasilitas(jenis);
    }

    // Override method untuk menampilkan informasi rumah
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fasilitas: " + fasilitas);
    }

    //swicth
    private String getFasilitas(String jenis) {
        switch (jenis.toLowerCase()) {
            case "type a":
                return "Kolam Renang";
            case "type b":
                return "Taman Bermain";
            default:
                return "Tidak ada fasilitas khusus";
        }
    }
}
