package net.java.main.interfaces;

import net.java.main.models.spells.SpellImpl;
import net.java.main.models.units.BaseUnit;

import java.util.List;

public interface CombatHandler {

    void setUnit(BaseUnit unit);

    BaseUnit pickNextTarget(List<BaseUnit> targetCandidates);

    SpellImpl generateAttack();
}
