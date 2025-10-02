

public class Uberweisung {
    private String from;
    private String to;
    private double amount;

    public Uberweisung(String from, String to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return from + " -> " + to + " " + amount;
    }
}
