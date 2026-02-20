package jobsheet_2;

public class DosenMain14 {
    public static void main(String[] args) {
        Dosen14 dsn1 = new Dosen14();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Algoritma";

        dsn1.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Struktur Data");
        dsn1.setStatusAktif(false);
        dsn1.tampilkanInformasi();

        Dosen14 dsn2 = new Dosen14("D002", "Siti Aminah", true, 2018, "Basis Data");
        dsn2.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");

        Dosen14 dsn3 = new Dosen14("HL01", "Raka Abimata", true, 2021, "Aljabar Linear");
        dsn3.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dsn3.hitungMasaKerja(2026) + " tahun");
    }
}
