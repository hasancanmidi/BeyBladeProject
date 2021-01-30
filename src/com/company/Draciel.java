package com.company;

public class Draciel extends Beyblade{
    private String monster;
    public Draciel(String beybladeUser, int returnSpeed, int attackForce,String monster) {
        super(beybladeUser, returnSpeed, attackForce);
        this.monster = monster;
    }

    @Override
    public void beybladeMonster() {
        super.beybladeMonster();
        System.out.println(getBeybladeUser() + " " + monster + "coming");
        System.out.println(getBeybladeUser() + " defance : castle defense");
    }

    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println("Monster Name : " + monster);
    }
}
