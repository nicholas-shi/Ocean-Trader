package oceantrader;

import java.util.ArrayList;

public class Ship {

    private ShipType type;
    private ArrayList cargoList;
    private int cargoSpace;
    private int fuelCapacity;
    private int health;

    private int maxCargoSpace;
    private int maxFuelCapacity;
    private int maxHealth;

    public Ship(ShipType type, int cargoSpace, int fuelCapacity,
                   int health) {
        this.type = type;
        this.cargoList = new ArrayList();
        this.cargoSpace = cargoSpace;
        this.fuelCapacity = fuelCapacity;
        this.health = health;
        this.maxCargoSpace = cargoSpace;
        this.maxFuelCapacity = fuelCapacity;
        this.maxHealth = health;
    }

    public static Ship newShip(ShipType type) {
        switch(type) {
            case WARSHIP:
                return new Ship(ShipType.WARSHIP, 5, 300, 2000);
            case MERCHANT:
                return new Ship(ShipType.MERCHANT, 45, 650, 1250);
            case EXPLORER:
                return new Ship(ShipType.EXPLORER, 15, 1000, 600);
            default:
                return new Ship(ShipType.DEFAULT, 5, 500, 1000);
        }
    }

    public ShipType getType() {
        return type;
    }

    public int getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(int cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxCargoSpace() {
        return maxCargoSpace;
    }

    public void setMaxCargoSpace(int maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }

    public int getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public void setMaxFuelCapacity(int maxFuelCapacity) {
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
}