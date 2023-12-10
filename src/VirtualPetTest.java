public class VirtualPetTest {

    public static void main(String[] args) {
        testFeed();
        testGiveWater();
        testPlay();
        testTick();
    }

    private static void testFeed() {
        VirtualPet pet = new VirtualPet("TestPet");
        int initialHunger = pet.getHungerLevel();
        pet.feed();
        int newHunger = pet.getHungerLevel();

        assert newHunger == (initialHunger - 10) : "Feed test failed";
        System.out.println("Feed test passed");
    }

    private static void testGiveWater() {
        VirtualPet pet = new VirtualPet("TestPet");
        int initialThirst = pet.getThirstLevel();
        pet.giveWater();
        int newThirst = pet.getThirstLevel();

        assert newThirst == (initialThirst - 10) : "GiveWater test failed";
        System.out.println("GiveWater test passed");
    }

    private static void testPlay() {
        VirtualPet pet = new VirtualPet("TestPet");
        int initialBoredom = pet.getBoredomLevel();
        pet.play();
        int newBoredom = pet.getBoredomLevel();

        assert newBoredom == (initialBoredom - 10) : "Play test failed";
        System.out.println("Play test passed");
    }

    private static void testTick() {
        VirtualPet pet = new VirtualPet("TestPet");
        int initialHunger = pet.getHungerLevel();
        int initialThirst = pet.getThirstLevel();
        int initialBoredom = pet.getBoredomLevel();

        pet.tick();

        assert pet.getHungerLevel() == (initialHunger + 5) : "Tick test failed for hunger";
        assert pet.getThirstLevel() == (initialThirst + 5) : "Tick test failed for thirst";
        assert pet.getBoredomLevel() == (initialBoredom + 5) : "Tick test failed for boredom";
        System.out.println("Tick test passed");
    }
}
