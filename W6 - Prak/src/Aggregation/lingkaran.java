package Aggregation;

public class lingkaran {
    private float jari;
    private Titik TitikPusat;
    public  lingkaran(Titik T, float j)
    {
        jari = j;
        TitikPusat = T;
    }

    public void cetakLingkaran()
    {
        System.out.printf("Posisi Titik    : ");
        TitikPusat.posisiTitik();
        System.out.println("Jari-Jari       : " + jari);
    }
}
