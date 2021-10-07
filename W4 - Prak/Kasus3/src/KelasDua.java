public class KelasDua {
    {
        System.out.println(5);
    }
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.println(6);
        KelasSatu satu = new KelasSatu();
        KelasSatu dua = new KelasSatu(10);
    }
}

/*
pada saat suatu kelas diinstansiasi terjadi hal-hal seperti berikut:
block yang diberi label static dieksekusi pertama dan sekali saja
(bila terjadi instansiasi pada yang kedua kalinya atau lebih, tidak dieksekusi lagi),
kemudian statement yang berada pada initialization block dieksekusi selanjutnya,
lalu yang terakhir statement yang ada pada constructor nya sesuai dengan parameter yang dikirimkan.
*/


