package com.isep.rpg;
import java.util.LinkedList;
import java.util.List;

public abstract class Hero {
    private int lifePoints;
    private int armor;
    private int weaponDamage;
    private List<Potion> potions;
    private List<Food> foods;

    public Hero(int lifePoints, int armor, int weaponDamage) {
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.weaponDamage = weaponDamage;
        this.potions = new LinkedList<>();
        this.foods = new LinkedList<>();
    }

    void attack(){};
    void defend(){};
    void useConsumable(Consumable consumable){};


    public int getLifePoints(){
        return lifePoints;
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getArmor(){
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getWeaponDamage(){
        return weaponDamage;
    }
    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public List<Potion> getPotions() {
        return potions;
    }
    public void setPotions(List<Potion> potions) {
        this.potions = potions;
    }

    public List<Food> getFoods() {
        return foods;
    }
    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}