package oceantrader;

public class Player {

    private String name;
    private Difficulty difficulty;
    private Region region;
    private int currency;

    private int pilotPoints;
    private int fighterPoints;
    private int traderPoints;
    private int engineerPoints;

    public Player(String name, int pilotPoints, int fighterPoints,
                  int traderPoints, int engineerPoints, Difficulty difficulty) {

        this.name = name;
        this.pilotPoints = pilotPoints;
        this.fighterPoints = fighterPoints;
        this.traderPoints = traderPoints;
        this.engineerPoints = engineerPoints;

        switch (difficulty) {
        case EASY:
            currency = 1000;
            this.difficulty = Difficulty.EASY;
            break;
        case MEDIUM:
            currency = 500;
            this.difficulty = Difficulty.MEDIUM;
            break;
        case HARD:
            currency = 100;
            this.difficulty = Difficulty.HARD;
            break;
        default:
            break;
        }
    }

    public Player(String name, int pilotPoints, int fighterPoints,
                            int traderPoints, int engineerPoints) {

        this(name, pilotPoints, fighterPoints, traderPoints,
                            engineerPoints, Difficulty.HARD);
    }

    public Player(String name) {
        this(name, 0, 0, 0, 0, Difficulty.HARD);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public int getCurrency() {
        return currency;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public int getSkillLevel(String skill) {
        switch (skill) {
        case "Pilot" :
            return pilotPoints;
        case "Fighter" :
            return fighterPoints;
        case "Trader" :
            return traderPoints;
        case "Engineer" :
            return engineerPoints;
        default:
            throw new IllegalArgumentException("Skill not found.");
        }
    }

    public int getTotalSkill() {
        return pilotPoints + fighterPoints + traderPoints + engineerPoints;
    }

    @Override
    public String toString() {
        return name + ":"
                + "\n\tSeamanship: " + this.pilotPoints
                + "\n\tBattle Ability: " + this.fighterPoints
                + "\n\tTradesmanship: " + this.traderPoints
                + "\n\tWorkmanship: " + this.engineerPoints
                + "\n\tDifficulty: " + this.difficulty;
    }
}