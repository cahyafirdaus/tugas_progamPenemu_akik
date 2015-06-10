/**
 * Created by Yolland on 6/10/2015.
 */
public class batu_akik {
    private String jenisAkik;
    private String warnaAkik;
    private Double hargaAkik;
    private String asalAkik;
    private penemu_akik Penemu;

    public batu_akik(String jenisAkik, String warnaAkik, Double hargaAkik, String asalAkik, penemu_akik penemu) {
        this.jenisAkik = jenisAkik;
        this.warnaAkik = warnaAkik;
        this.hargaAkik = hargaAkik;
        this.asalAkik = asalAkik;
        Penemu = penemu;
    }

    public String getJenisAkik() {
        return jenisAkik;
    }

    public void setJenisAkik(String jenisAkik) {
        this.jenisAkik = jenisAkik;
    }

    public String getWarnaAkik() {
        return warnaAkik;
    }

    public void setWarnaAkik(String warnaAkik) {
        this.warnaAkik = warnaAkik;
    }

    public Double getHargaAkik() {
        return hargaAkik;
    }

    public void setHargaAkik(Double hargaAkik) {
        this.hargaAkik = hargaAkik;
    }

    public String getAsalAkik() {
        return asalAkik;
    }

    public void setAsalAkik(String asalAkik) {
        this.asalAkik = asalAkik;
    }

    public penemu_akik getPenemu() {
        return Penemu;
    }

    public void setPenemu(penemu_akik penemu) {
        Penemu = penemu;
    }

    @Override
    public String toString() {
        return "batu_akik{" +
                "jenisAkik='" + jenisAkik + '\'' +
                ", warnaAkik='" + warnaAkik + '\'' +
                ", hargaAkik=" + hargaAkik +
                ", asalAkik='" + asalAkik + '\'' +
                ", Penemu=" + Penemu +
                '}';
    }
}
