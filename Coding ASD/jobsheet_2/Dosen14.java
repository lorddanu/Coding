package jobsheet_2;
public class Dosen14 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen14() {
    }

    public Dosen14(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilkanInformasi() {
        System.out.println("\nID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("------------------------------");
    }

    public void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    public int hitungMasaKerja(int thnSekarang) {
        return thnSekarang - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
