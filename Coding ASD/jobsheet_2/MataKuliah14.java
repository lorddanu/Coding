package jobsheet_2;
public class MataKuliah14 {

    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah14() {
    }

    public MataKuliah14 (String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks ;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("\nKode MK   : " + kodeMK);
        System.out.println("Nama MK   : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("---------------------------");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambah menjadi " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi menjadi " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal. Jam tidak mencukupi.");
        }
    }
}
