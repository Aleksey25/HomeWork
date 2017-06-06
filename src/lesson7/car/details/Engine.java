package lesson7.car.details;

public class Engine {
    private String maker;
    private int power;

    public Engine(String maker, int power) {
        this.maker = maker;
        this.power = power;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != engine.power) return false;
        return maker != null ? maker.equals(engine.maker) : engine.maker == null;
    }

    @Override
    public int hashCode() {
        int result = maker != null ? maker.hashCode() : 0;
        result = 31 * result + power;
        return result;
    }

    @Override
    public String toString() {
        return " " +
                "производитель: '" + maker + '\'' +
                ", мощность: " + power;
    }
}
