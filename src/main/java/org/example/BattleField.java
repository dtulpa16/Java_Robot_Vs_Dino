package org.example;

public class BattleField {
    SlowType slowType = new SlowType();
    public void Print(String x) {
        slowType.slowPrint(x);
    }

    Herd herd = new Herd();
    Fleet fleet = new Fleet();

    public void DisplayWelcome(){
        Print("Welcome to RvD");
        Print("Hang tight while we assemble the herds & Fleets");
        Print("............");

    }
}
