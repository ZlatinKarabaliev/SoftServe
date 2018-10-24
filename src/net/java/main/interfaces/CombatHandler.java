package net.java.main.interfaces;

import java.util.List;

import net.java.main.exceptions.NotEnoughEnergyException;

public interface CombatHandler {

	  void setUnit(Unit unit);

	    Unit pickNextTarget(List<Unit> targetCandidates);

	    Spell generateAttack() throws NotEnoughEnergyException;
}
