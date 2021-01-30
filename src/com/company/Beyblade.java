package com.company;

public class Beyblade {
    private String beybladeUser;
    private int returnSpeed;
    private int attackForce;

    public Beyblade(String beybladeUser, int returnSpeed, int attackForce) {
        this.beybladeUser = beybladeUser;
        this.returnSpeed = returnSpeed;
        this.attackForce = attackForce;
    }

    public void attack(){
        System.out.println(getBeybladeUser() + " " + attackForce + " ve " + returnSpeed + "with attacking...");
    }
    public void beybladeMonster(){
        System.out.println("coming the monster");
    }
    public void showInformations(){
        System.out.println("Beyblade User : " + beybladeUser);
        System.out.println("Attack Force : " + attackForce);
        System.out.println("Return Speed : " + returnSpeed);
    }

    public String getBeybladeUser() {
        return beybladeUser;
    }

    public void setBeybladeUser(String beybladeUser) {
        this.beybladeUser = beybladeUser;
    }

    public int getReturnSpeed() {
        return returnSpeed;
    }

    public void setReturnSpeed(int returnSpeed) {
        this.returnSpeed = returnSpeed;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }
}
