public class Slytherin extends Hogwarts {

    private int cunning;
    private int attentiveness;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String firstName, String lastName, int powerofMagic, int distanceOfTransgression, int cunning,
                     int attentiveness, int ambition, int resourcefulness, int thirstForPower) {
        super(firstName, lastName, powerofMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.attentiveness = attentiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAttentiveness() {
        return attentiveness;
    }

    public void setAttentiveness(int attentiveness) {
        this.attentiveness = attentiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "fairstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", powerofMagic=" + getPowerofMagic() +
                ", distanceOfTransgression=" + getDistanceOfTransgression() +
                ", cunning=" + cunning +
                ", attentiveness=" + attentiveness +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    public int getTotalPoints() {
        return cunning + ambition + attentiveness + resourcefulness + thirstForPower;
    }

    public static void comparingStudentOfSlytherin(Slytherin studentOne,Slytherin studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " обладает бОльшей мощностью магии, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " обладает бОльшей мощностью магии, чем " + studentOne);
        } else {
            System.out.println("Сила магии студентов равна.");
        }
    }
}
