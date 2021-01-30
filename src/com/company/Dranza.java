package com.company;

public class Dranza extends Beyblade{
    private String monster;

    public Dranza(String beybladeUser, int returnSpeed, int attackForce, String monster){
        super(beybladeUser,returnSpeed,attackForce);
        this.monster = monster;
    }

    @Override
    public void beybladeMonster() {
        super.beybladeMonster();
        System.out.println(getBeybladeUser() + " " + monster + "coming");
        System.out.println(getBeybladeUser() + " attack : fire knife");
    }

    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println("Monster Name : " + monster);
    }
}
