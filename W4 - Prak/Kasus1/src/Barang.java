public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok; //sebelumnya tidak menggunakan modifier private sehingga bisa diakses/diubah oleh siapapun
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok += stok;  //tidak bisa dilakukan operasi kecuali penambahan
    }
}

/*
Pada line ke 4, saya mengubah stok menjadi modifier private dengan
tujuan agar stok tidak bisa diubah oleh siapapun dan saya membungkus
nya dengan teknik encapsulation
*/
