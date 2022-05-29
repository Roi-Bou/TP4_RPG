package com.isep.rpg;

public class SpellCaster extends Hero{
    private int manaPoints;

    public SpellCaster(int lifePoints, int currentHP, int armor, int weaponDamage, int manaPoints) {
        super(lifePoints, currentHP, armor, weaponDamage);
        this.manaPoints = manaPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }
    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }
}
