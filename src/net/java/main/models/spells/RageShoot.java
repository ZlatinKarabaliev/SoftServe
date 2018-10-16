package net.java.main.models.spells;

public class RageShoot  extends SpellImpl{

	private final int ENERGY_COAST = 10;
	
	protected RageShoot(int energyCost) {
		super(energyCost);
	
	}

	@Override
	public int getEnergyCoast() {
		
		return this.ENERGY_COAST;
	}

	


}
