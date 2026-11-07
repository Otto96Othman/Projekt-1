
import java.util.Random;

public class Die {

    private int value;
    private int numberOfSides;
    private Random random;

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
        this.value = 1;
    }

    public int getValue() {
        return value;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void roll() {
        value = random.nextInt(numberOfSides) + 1;
    }
}
