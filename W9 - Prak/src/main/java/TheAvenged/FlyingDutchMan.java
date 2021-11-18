package TheAvenged;

public class FlyingDutchMan extends SuperHero{
    public FlyingDutchMan(String name, int powerLevel) {
        super(name, powerLevel);        //memanggil constructor TheAvenged.SuperHero
        addPower(new Flying());
        addPower(new LaserEye());
    }

    //Menampilkan identitas super hero
    public void identity(){
        System.out.println("It's " + this.getName() + ", the TheAvenged.FlyingDutchMan! It has the power level of " + this.getPowerLevel());
    }
}