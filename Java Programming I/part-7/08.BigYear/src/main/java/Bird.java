public class Bird {
    private String name;
    private String latinName;
    private int numberOfObservation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        numberOfObservation = 0;
    }

    public void newObservation() {
        numberOfObservation++;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " (" + latinName + "): " + numberOfObservation + " observations";
    }
}
