public class Ravenclaw extends Hogwarts {

    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String firstName, String lastName, int powerofMagic, int distanceOfTransgression, int smart, int wisdom, int wit, int creativity) {
        super(firstName, lastName, powerofMagic, distanceOfTransgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "fairstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", powerofMagic=" + getPowerofMagic() +
                ", distanceOfTransgression=" + getDistanceOfTransgression() +
                ", smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    public int getTotalPoints() {
        return smart + wisdom + wit + creativity;
    }

    public static void comparingStudentOfRavenclaw(Ravenclaw studentOne, Ravenclaw studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " обладает бОльшей мощностью магии, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " обладает бОльшей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Сила магии студентов равна.");
        }
    }
}
