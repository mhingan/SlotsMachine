package example;

public class Symbol {
    private final char value;
    private final int weight;
    private final double multiplier;

    public Symbol(char value, int weight, double multiplier) {
        this.value = value;
        this.weight = weight;
        this.multiplier = multiplier;
    }

    public char getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    public double getMultiplier() {
        return multiplier;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
