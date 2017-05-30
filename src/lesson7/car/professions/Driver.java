package lesson7.car.professions;


import lesson7.Person;

public class Driver extends Person {
    private int experience;

    public Driver(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + experience;
        return result;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                '}';
    }

}
