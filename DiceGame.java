
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ogiltligtNummer = "Vänligen ange ett giltigt antal rundor: (nummer)";
        String ogiltligtSidor = "Vänligen ange ett giltigt antal sidor: (nummer)";
        
        System.out.println("Välkommen till tärningsspelet!");

        System.out.print("Vad heter du? ");
        String name = scanner.nextLine();
        // skapa en ny spelare med det angivna namnet, ETT objekt av klassen Player
        Player player = new Player(name);

        System.out.print("Hur många rundor vill du spela? ");
        // kolla om det är en int, om inte låt användare skriva in igen
        // så länge som det inte är en int, skriv ut ogiltligtNummer och ta bort ogiltlig inmatning
        while (!scanner.hasNextInt()) {
            System.out.print(ogiltligtNummer);
            scanner.next();
        }
        int rounds = scanner.nextInt();

        System.out.print("Hur många sidor ska tärningen ha? ");
        // kolla om det är en int, om inte låt användare skriva in igen
        while (!scanner.hasNextInt()) {
            System.out.print(ogiltligtSidor);
            scanner.next(); // ta bort ogiltlig inmatning
        }
        int numberOfSides = scanner.nextInt();

        player.addDie(numberOfSides);
        // for loop stoppar när det är lika med rounds, och ökar i med 1 varje gång
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRunda " + i);

            System.out.print("Gissa vilket nummer tärningen visar: ");
            int guess = scanner.nextInt();

            player.rollDice();

            int result = player.getDieValue();

            System.out.println("Tärningen visar: " + result);

            if (guess == result) {
                System.out.println("Rätt gissat!");
                player.increaseScore();
            } else {
                System.out.println("Tyvärr, fel gissat!");
            }

            System.out.println("Dina poäng: " + player.getScore());
        }

        System.out.println("\nSpelet är slut!");
        System.out.println("Spelare: " + player.getName());
        System.out.println("Slutpoäng: " + player.getScore());

        scanner.close();
    }

}
