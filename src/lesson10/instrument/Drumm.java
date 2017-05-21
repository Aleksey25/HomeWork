package lesson10.instrument;


public class Drumm implements Instrument {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Бьет барабан");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drumm drumm = (Drumm) o;

        return size != null ? size.equals(drumm.size) : drumm.size == null;
    }

    @Override
    public int hashCode() {
        return size != null ? size.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Drumm{" +
                "size='" + size + '\'' +
                '}';
    }
}
