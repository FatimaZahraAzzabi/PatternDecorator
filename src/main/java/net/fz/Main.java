package net.fz;


import net.fz.composants.Boisson;
import net.fz.composants.Espresso;

public class Main {
    public static void main(String[] args) {

        Boisson boisson ;
        boisson=new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

    }
}