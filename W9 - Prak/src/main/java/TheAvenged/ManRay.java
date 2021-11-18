package TheAvenged;

public class ManRay extends SuperHero{
    
    public ManRay(String name, int powerLevel) {
        super(name, powerLevel);        //Call TheAvenged.SuperHero constructor
        addPower(new LaserEye());
        addPower(new Strength());
    }

    //Menampilkan identitas superhero
    public void identity(){
        System.out.println("It's " + this.getName() + ", the TheAvenged.ManRay! It has the power level of " + this.getPowerLevel());
    }
}