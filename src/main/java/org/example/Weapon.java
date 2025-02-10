package org.example;

public enum Weapon {
    SWORD(20, 1.5),
    AXE(10, 1.0),
    BOW(15, 1.25);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.attackSpeed = attackSpeed;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
