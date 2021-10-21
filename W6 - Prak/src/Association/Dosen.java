package Association;
import java.util.Scanner;
public class Dosen
{
    String Nama;
    MataKuliah MK[];
    int jum;

    Dosen(String n){
        MK = new MataKuliah[2];
        jum = 0;
    }

    public void tambahMK(MataKuliah mk)
    {
        MK[jum]=mk;
        jum++;
    }

    public void printInfo()
    {
        System.out.println(Nama);
        for (int i= 0; 1<jum; i++)
            MK[i].tampilkanMK();
    }
}
