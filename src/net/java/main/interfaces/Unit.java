package net.java.main.interfaces;

public interface Unit {

	String getName();
	int getRange();
	Position getPosition();
	void setPosition();
	int getHealthPoints();
	void  setHealthPoint();
	int getEnergyPoints();
	void  setEnergyPoint();
	int getAttackPoints();
	int getDeffencePoint();
	CombatHandler getCombatHandler();
	
}
