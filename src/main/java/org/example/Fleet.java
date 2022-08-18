package org.example;

public class Fleet {
    Robot[] fleet = new Robot[3];

    public Fleet() {
        fleet[0] = new Robot("R2Dan2",100 , new Boomerang("Boomerang",100));
        fleet[1] = new Robot("QQ", 100, new ThrowingStar("Throwing Star", 100));
        fleet[2] = new Robot("Error2D2",100, new Boomerang("Boomerang", 100));
    }
}
