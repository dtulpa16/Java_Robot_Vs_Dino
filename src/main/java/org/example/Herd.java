package org.example;

public class Herd {
    Dino[] herd = new Dino[3];

    public Herd() {
        herd[0] = new Dino("Chad",100 );
        herd[1] = new Dino("Mr. T-Rex", 100);
        herd[2] = new Dino("Thad",100);
    }
}
