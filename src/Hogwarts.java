import java.util.Objects;

public class Hogwarts {

    private final String firstName;
    private final String lastName;
    private int powerOfMagic;
    private int distanceOfTransgression;

    public Hogwarts(String firstName, String lastName, int powerofMagic, int distanceOfTransgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerOfMagic = powerofMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPowerofMagic() {
        return powerOfMagic;
    }

    public void setPowerofMagic(int powerofMagic) {
        this.powerOfMagic = powerofMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "fairstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerofMagic=" + powerOfMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return powerOfMagic == hogwarts.powerOfMagic && distanceOfTransgression == hogwarts.distanceOfTransgression && Objects.equals(firstName, hogwarts.firstName) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, powerOfMagic, distanceOfTransgression);
    }

    public int getTotalPoints() {
        return powerOfMagic + distanceOfTransgression;
    }

    public static void comparingStudent(Hogwarts studentOne, Hogwarts studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " обладает бОльшей мощностью магии, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " обладает бОльшей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Сила магии студентов равна.");
        }
    }
}
