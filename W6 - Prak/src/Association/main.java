package Association;

public class main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Ikbal");
        MataKuliah mk1 = new MataKuliah("PBO");
        MataKuliah mk2 = new MataKuliah("Matematika Diskrit");

        dosen.tambahMK(mk1);
        dosen.tambahMK(mk2);
        dosen.printInfo();
    }
}
