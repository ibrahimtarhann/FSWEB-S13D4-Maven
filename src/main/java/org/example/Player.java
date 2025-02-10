package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }

    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage > 100 ? 100 : Math.max(healthPercentage, 0);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Player(String name, int healthPercentage, Weapon weapon){
        this.name=name;
        this.healthPercentage=healthPercentage;
        this.weapon = weapon;
    }


    public int healthRemaining() {
        return getHealthPercentage();
    }

    public void loseHealth(int damage) {
        if(getHealthPercentage() - damage <= 0){
            setHealthPercentage(0);
            System.out.println(getName() + " player has been knocked out of game");
        }else {
            setHealthPercentage(getHealthPercentage() - damage);
        }
    }

    public void restoreHealth(int healthPotion) {
        setHealthPercentage(getHealthPercentage() + healthPotion);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}