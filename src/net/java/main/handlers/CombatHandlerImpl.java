package net.java.main.handlers;

import net.java.main.interfaces.CombatHandler;
import net.java.main.models.units.BaseUnit;

public abstract class CombatHandlerImpl implements CombatHandler{
    private BaseUnit unit;

    protected CombatHandlerImpl() {
    }

    @Override
    public void setUnit(BaseUnit unit) {
        this.unit = unit;
    }

    protected BaseUnit getUnit() {
        return this.unit;
    }
}
