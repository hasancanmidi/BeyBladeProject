package com.company;

public class BeybladeFactory {
    public Beyblade beybladeProduce(String beybladeType) {
        if (beybladeType.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "Blue dragon", "Takao is talking with the monster");
        }
        else if (beybladeType.equals("Dranza")) {
            return new Dranza("Kai", 600, 400, "red phoenix");
        }
        else if (beybladeType.equals("Drayga")) {
            return new Drayga("Rei", 800, 250, "White tiger");
        }
        else if (beybladeType.equals("Draciel")) {
            return new Draciel("Max", 400, 1000, "Black turtle");
        }
        else{
            return null;
        }
    }
}
