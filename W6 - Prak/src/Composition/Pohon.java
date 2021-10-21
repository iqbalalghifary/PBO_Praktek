package Composition;

public class Pohon {
    String nama;
    Daun daun1;

    public Pohon(String n, int jmlruas)
    {
        nama = n;
        daun1 = new Daun(jmlruas); //pembuatan objek didalam constructor
    }

    public void tampilPohon()
    {
        System.out.println("Pohon               : " + nama);
        //method kelas penyusun bisa dipanggil di kelas komposit
        System.out.println("Jumlah Ruas Daun 1  : " + daun1.getJumlahruas());
    }
}
