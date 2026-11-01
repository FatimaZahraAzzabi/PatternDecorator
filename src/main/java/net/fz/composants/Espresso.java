package net.fz.composants;

public class Espresso extends Boisson{


    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cout(){
        return 7;
    }
}
