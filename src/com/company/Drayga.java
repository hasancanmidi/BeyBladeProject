package com.company;

public class Drayga extends Beyblade{
    private String monster;
    public Drayga(String beybladeUser, int returnSpeed, int attackForce, String monster) {
        super(beybladeUser, returnSpeed, attackForce);
        this.monster = monster;
    }

    @Override
    public void beybladeMonster() {
        super.beybladeMonster();
        System.out.println(getBeybladeUser() + " " + monster + "coming");
        System.out.println(getBeybladeUser() + " attack : Tiger Claw");
    }

    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println("Monster Name : " + monster);
    }
}
