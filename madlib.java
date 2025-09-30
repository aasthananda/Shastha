import java.util.Scanner;

public class madlib {
    public static void main(String[] args) {
        Scanner suppy = new Scanner(System.in);

        System.out.println("Enter a noun to be noun:");
        String noun = suppy.nextLine();
        System.out.println("Enter a noun to be noun1:");
        String noun1 = suppy.nextLine();
        System.out.println("Enter a noun to be noun2:");
        String noun2 = suppy.nextLine();
        System.out.println("Enter a noun to be noun3:");
        String noun3 = suppy.nextLine();
        System.out.println("Enter a noun to be noun4:");
        String noun4 = suppy.nextLine();
        System.out.println("Enter a noun to be noun5:");
        String noun5 = suppy.nextLine();
        System.out.println("Enter a verb ending in ing:");
        String verb = suppy.nextLine();
        System.out.println("Enter a verb ending in ing:");
        String verb1 = suppy.nextLine();
        System.out.println("Enter a verb ending in ing:");
        String verb2 = suppy.nextLine();
        System.out.println("Enter a verb in present personal (run, hide, jump):");
        String verb3 = suppy.nextLine();
        System.out.println("Enter a verb ending in ing:");
        String verb4 = suppy.nextLine();
        System.out.println("Enter a verb in present personal (run, hide, jump):");
        String verb5 = suppy.nextLine();
        System.out.println("Enter a verb ending in ed:");
        String verb6 = suppy.nextLine();
        System.out.println("Enter a verb ending in ed:");
        String verb7 = suppy.nextLine();
        System.out.println("Enter a verb ending in ing:");
        String verb8 = suppy.nextLine();
        System.out.println("Enter an adjective to be adjective:");
        String adjective = suppy.nextLine();
        System.out.println("Enter an adjective to be adjective1:");
        String adjective1 = suppy.nextLine();
        System.out.println("Enter an adjective to be adjective2:");
        String adjective2 = suppy.nextLine();
        System.out.println("Enter an adjective to be adjective3:");
        String adjective3 = suppy.nextLine();
        System.out.println("Enter an adjective to be adjective4:");
        String adjective4 = suppy.nextLine();

        System.out.println("\n--- Your Madlib Story ---\n");
        System.out.println("Once upon a time, there was a " + noun + " with a shell of " + noun1 + ".");
        System.out.println("The creature lived on a planet called " + noun2 + ", filled with " + noun3 + ".");
        System.out.println(noun + " enjoyed " + verb + ", " + verb1 + ", and " + verb2 + ".");
        System.out.println("Whenever the " + noun + " found apples, it would " + verb3 + ".");
        System.out.println("The " + noun + " wanted a beautiful outfit. However, " + noun2 + " had no clothing stores.");
        System.out.println("This made " + noun + " very " + adjective + ".");
        System.out.println("The " + noun + " was already " + adjective1 + " and " + adjective2 + ", coming into the situation.");
        System.out.println(noun + " had a huge business meeting. It needed " + adjective3 + " clothing by tomorrow.");
        System.out.println("Frantically, " + noun + " was " + verb4 + " to " + noun4 + " at the next planet.");
        System.out.println(noun + " then meets " + noun5 + ", " + noun + "'s ex-girlfriend.");
        System.out.println(noun + " was " + adjective4 + " and had to do something about it.");
        System.out.println(noun + " decided to " + verb5 + " to cope by shopping.");
        System.out.println("There " + noun + " saw the perfect outfit!");
        System.out.println(noun + " put on a " + noun5 + " draped like a beautiful coat.");
        System.out.println("Then, " + noun + " " + verb6 + " along the river.");
        System.out.println(noun + " forgot all about his problems and " + verb7 + " into the horizon, " + verb8 + " " + noun + ".");

        suppy.close();
    }
}
