package Kasus2;

public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;
    private  String senjutsu = super.Senjutsu;
    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai);
    }
    void printDojutsu() {
        System.out.println(this.Dojutsu);
        setDojutsu();
        System.out.println(this.Dojutsu);
        setSenjutsu();
        System.out.println(this.Senjutsu);
    }
    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
    private void setSenjutsu(){
        this.Senjutsu = "katak loncat";
    }
}
