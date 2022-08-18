package org.example;

public class Robot implements Attacker{
    public String name;
    public int health;
    public Weapon weapon;

    public Robot(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    @Override
    public void Attack() {

    }
}
