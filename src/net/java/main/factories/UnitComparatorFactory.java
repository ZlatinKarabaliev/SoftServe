package net.java.main.factories;

import java.util.Comparator;

import net.java.main.comparators.UnitComparatorByHealthPoints;
import net.java.main.comparators.UnitComparatorByName;
import net.java.main.interfaces.Unit;

public final class UnitComparatorFactory {

    private UnitComparatorFactory() {
    }

    public static Comparator<Unit> createComparatorByHealthPoints() {
        return new UnitComparatorByHealthPoints();
    }

    public static Comparator<Unit> createComparatorByName() {
        return new UnitComparatorByName();
    }
}