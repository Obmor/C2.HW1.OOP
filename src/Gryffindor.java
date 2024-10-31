public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int powerofMagic, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerofMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "fairstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", powerofMagic=" + getPowerofMagic() +
                ", distanceOfTransgression=" + getDistanceOfTransgression() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public int getTotalPoints() {
        return nobility + honor + bravery;
    }

    public static void comparingStudentOfGryffindor(Gryffindor studentOne, Gryffindor studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " обладает бОльшей мощностью магии, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " обладает бОльшей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Сила магии студентов равна.");
        }
    }
}
