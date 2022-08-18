package org.example;

import java.util.Scanner;

public abstract class Weapon {
    public String name;
    public int attackPower;

    public Weapon(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }
}
