public class Cube {
    private int length;
    private int volume;

    public Cube(int edgeLength) {
        length = edgeLength;
    }

    public int volume() {
        volume = length * length * length;
        return volume;
    }

    public String toString() {
        return "The length of the edge is " + length + " and the volume " + volume();
    }

}
