package com.company;

public class Dragon extends Beyblade{
    private String monster;
    private String secretTalent;

    public Dragon(String beybladeUser, int returnSpeed, int attackForce, String monster, String secretTalent) {
        super(beybladeUser, returnSpeed, attackForce);
        this.monster = monster;
        this.secretTalent = secretTalent;
    }

    @Override
    public void beybladeMonster() {
        super.beybladeMonster();
        System.out.println(getBeybladeUser() + " " + monster + "coming");
        System.out.println(getBeybladeUser() + " attack : ghost attack");
    }

    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println("Monster Name : " + monster);
        System.out.println("Secret Talent : " + secretTalent);
    }
}
