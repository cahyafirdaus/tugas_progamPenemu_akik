/**
 * Created by Yolland on 6/10/2015.
 */
public class penemu_akik {
    private String namaPenemu;
    private String kotaAsal;
    private String alamat;
    private char jenisKelamin;
    private String agama;

    public penemu_akik(String namaPenemu, String kotaAsal, String alamat, char jenisKelamin, String agama) {
        this.namaPenemu = namaPenemu;
        this.kotaAsal = kotaAsal;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
    }

    public String getNamaPenemu() {
        return namaPenemu;
    }

    public void setNamaPenemu(String namaPenemu) {
        this.namaPenemu = namaPenemu;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    @Override
    public String toString() {
        return "penemu_akik{" +
                "namaPenemu='" + namaPenemu + '\'' +
                ", kotaAsal='" + kotaAsal + '\'' +
                ", alamat='" + alamat + '\'' +
                ", jenisKelamin=" + jenisKelamin +
                ", agama='" + agama + '\'' +
                '}';
    }
}
