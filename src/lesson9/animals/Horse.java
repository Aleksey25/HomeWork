package lesson9.animals;

public class Horse extends Animal {
    private String color;
    private static final int SLEEP_TIME = 8;

    public Horse(String animalType, String food, String location, String noise, String color) {
        super(animalType, food, location, noise);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getSleepTime() {
        return SLEEP_TIME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return color != null ? color.equals(horse.color) : horse.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
