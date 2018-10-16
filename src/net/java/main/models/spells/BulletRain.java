package net.java.main.models.spells;

public class BulletRain extends SpellImpl {
 
	private final int ENERGY_COAST = 10;
	
	protected BulletRain(int energyCost) {
		super( energyCost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getEnergyCoast() {
		// TODO Auto-generated method stub
		return this.ENERGY_COAST;
	}

	
}
