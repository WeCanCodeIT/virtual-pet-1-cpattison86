import java.util.Random;

public class VirtualPet {

    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    public VirtualPet(String name) {
        this.name = name;
        this.hungerLevel = 50;
        this.thirstLevel = 50;
        this.boredomLevel = 50;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public void feed() {
        hungerLevel -= 10;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
    }

    public void giveWater() {
        thirstLevel -= 10;
        if (thirstLevel < 0) {
            thirstLevel = 0;
        }
    }

    public void play() {
        boredomLevel -= 10;
        if (boredomLevel < 0) {
            boredomLevel = 0;
        }
    }

    public void tick() {
        Random random = new Random();
        if (random.nextInt(100) < 20) {
            int highestNeed = Math.max(Math.max(hungerLevel, thirstLevel), boredomLevel);
            if (highestNeed == hungerLevel) {
                feed();
            } else if (highestNeed == thirstLevel) {
                giveWater();
            } else {
                play();
            }
        }

        hungerLevel += 5;
        thirstLevel += 5;
        boredomLevel += 5;

        
    }
}