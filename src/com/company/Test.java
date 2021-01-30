package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Beyblade programming welcome...");
        System.out.println("press 'q' for exit");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Which beyblade do you want to select ? : ");
            String options = scanner.nextLine();
            if(options.equals("q")){
                System.out.println("exiting the program");
                break;
            }
            else {
                BeybladeFactory beybladeFactory = new BeybladeFactory();
                Beyblade beyblade = beybladeFactory.beybladeProduce(options);

                if (beyblade == null){
                    System.out.print("Select a beyblade please : ");
                }
                else{
                    beyblade.showInformations();
                    beyblade.attack();
                    beyblade.beybladeMonster();
                }
            }
        }
    }
}
