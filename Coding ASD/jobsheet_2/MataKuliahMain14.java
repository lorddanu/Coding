package jobsheet_2;

public class MataKuliahMain14 {
    public static void main(String[] args) {
        MataKuliah14 mk1 = new MataKuliah14();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();

        MataKuliah14 mk2 = new MataKuliah14("IF202", "Basis Data", 3, 4);
        mk2.tampilkanInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(10); //hitungan yang salah sehingga tidak bisa mengurangi jam
        mk2.tampilkanInformasi();
    }
}
