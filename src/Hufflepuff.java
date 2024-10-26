public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honestly;

    public Hufflepuff(String firstName, String lastName, int powerofMagic, int distanceOfTransgression, int diligence, int loyalty, int honestly) {
        super(firstName, lastName, powerofMagic, distanceOfTransgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honestly = honestly;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonestly() {
        return honestly;
    }

    public void setHonestly(int honestly) {
        this.honestly = honestly;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "fairstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", powerofMagic=" + getPowerofMagic() +
                ", distanceOfTransgression=" + getDistanceOfTransgression() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honestly=" + honestly +
                '}';
    }

    public int getTotalPoints() {
        return diligence + loyalty + honestly;
    }

    public static void comparingStudentOfHufflepuff (Hufflepuff studentOne, Hufflepuff studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " обладает бОльшей мощностью магии, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " обладает бОльшей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Сила магии студентов равна.");
        }
    }
}
