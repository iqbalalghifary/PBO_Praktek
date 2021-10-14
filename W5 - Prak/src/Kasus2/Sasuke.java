package Kasus2;

public class Sasuke extends Itachi {
    String Dojutsu = "Sharingan";
    void printDojutsu() {
        /* syntax super memiliki fungsi untuk memanggil
        attribute yang berada pada super class */
        super.printDojutsu();
        System.out.println(this.Dojutsu);
    }
}
