
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int fullPrice = squares * princePerSquare;
        int fullPriceCompared = compared.squares * compared.princePerSquare;
        int difference = Math.abs(fullPrice - fullPriceCompared);
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int fullPrice = squares * princePerSquare;
        int fullPriceCompared = compared.squares * compared.princePerSquare;
        if (fullPrice > fullPriceCompared) {
            return true;
        }
        return false;
    }

}
