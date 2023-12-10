import java.util.Scanner;

public class VirtualPetApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Virtual Pet Game!");
        System.out.print("Enter a name for your pet: ");
        String petName = scanner.nextLine();

        VirtualPet pet = new VirtualPet(petName);

        while (true) {
            displayPetStatus(pet);

            System.out.println("Options:");
            System.out.println("1. Feed the pet");
            System.out.println("2. Give water to the pet");
            System.out.println("3. Play with the pet");
            System.out.println("4. Quit");

            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.giveWater();
                    break;
                case 3:
                    pet.play();
                    break;
                case 4:
                    System.out.println("Thanks for playing! Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

            pet.tick();
        }
    }

    private static void displayPetStatus(VirtualPet pet) {
        System.out.println("\n" + pet.getName() + "'s Status:");
        System.out.println("Hunger: " + pet.getHungerLevel());
        System.out.println("Thirst: " + pet.getThirstLevel());
        System.out.println("Boredom: " + pet.getBoredomLevel());

        
    }
    
}

