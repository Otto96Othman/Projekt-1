
public class DiceGame {

    public static void main(String[] args) {

        Player player = new Player("Sara");

        player.addDie(6);

        System.out.println("Spelare: " + player.getName());

        player.rollDice();

        System.out.println("Tärningen visar: "
                + player.getDieValue());

        player.increaseScore();

        System.out.println("Poäng: " + player.getScore());
    }
}
