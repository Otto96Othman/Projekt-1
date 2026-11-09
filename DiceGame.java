
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen till tärningsspelet!");

        System.out.print("Hur många rundor vill du spela? ");
        int rounds = scanner.nextInt();

        System.out.print("Hur många sidor ska tärningen ha? ");
        int numberOfSides = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Vad heter du? ");
        String name = scanner.nextLine();

        Player player = new Player(name);
        player.addDie(numberOfSides);

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
