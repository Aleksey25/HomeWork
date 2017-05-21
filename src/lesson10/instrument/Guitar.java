package lesson10.instrument;


public class Guitar implements Instrument {
    private int cords;

    @Override
    public void play() {
        System.out.println("Играет гитара");
    }

    public int getCords() {
        return cords;
    }

    public void setCords(int cords) {
        this.cords = cords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return cords == guitar.cords;
    }

    @Override
    public int hashCode() {
        return cords;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "cords=" + cords +
                '}';
    }
}
