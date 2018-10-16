package net.java.main.models.units;

import net.java.main.interfaces.CombatHandler;
import net.java.main.interfaces.Position;

public class Marine extends BaseUnit {

	protected Marine(String name, int range, Position position, int healthPoints, int energyPoints, int attackPoints,
			int defencePoints, CombatHandler combatHandler) {
		super(name, range, position, healthPoints, energyPoints, attackPoints, defencePoints, combatHandler);
		// TODO Auto-generated constructor stub
	}


}
