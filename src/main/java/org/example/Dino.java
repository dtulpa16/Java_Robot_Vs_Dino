package org.example;

public class Dino implements Attacker{
    public String name;
    public int health;
    public int attackPower;

    public Dino(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack(Attacker target) {
//        target -= this.attackPower;

    }
}
