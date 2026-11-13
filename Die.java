
import java.util.Random;

public class Die {

    private int value;
    private final int numberOfSides;
    private final Random randomGenerator;

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.randomGenerator = new Random();
        this.value = 1;
    }

    public int getValue() {
        return value;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void roll() {
        value = randomGenerator.nextInt(numberOfSides) + 1;
    }
}
