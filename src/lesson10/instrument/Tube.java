package lesson10.instrument;


public class Tube implements Instrument {
    private int diameter;

    @Override
    public void play() {
        System.out.println("Играет труба");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tube tube = (Tube) o;

        return diameter == tube.diameter;
    }

    @Override
    public int hashCode() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "diameter=" + diameter +
                '}';
    }
}
