package com.isep.rpg;

public class Hunter extends Hero {
    private int arrows;

    public Hunter(int lifePoints, int armor, int weaponDamage) {
        super(lifePoints, armor, weaponDamage);
    }

    public int getArrows() {
        return arrows;
    }
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
}
