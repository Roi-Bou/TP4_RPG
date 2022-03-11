package com.isep.rpg;

public class SpellCaster extends Hero{
    private int manaPoints;

    public SpellCaster(int lifePoints, int armor, int weaponDamage) {
        super(lifePoints, armor, weaponDamage);
    }

    public int getManaPoints() {
        return manaPoints;
    }
    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }
}
