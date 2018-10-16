package net.java.main.models.spells;

import net.java.main.interfaces.Spell;

public abstract class SpellImpl implements Spell {
    private final int DAMAGE = 15;
	
	
	private int damage;
    private int energyCost;

    protected SpellImpl( int energyCost) {
        this.damage = this.DAMAGE;
        this.energyCost = energyCost;
    }

    public int getDamage() {
        return this.damage;
    }

   
    public int getEnergyCoast() {
        return this.energyCost;
    }
}
