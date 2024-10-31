public class Main {
    public static void main(String[] args) {

        Gryffindor one = new Gryffindor("Harry", "Potter", 1, 1,
                1, 1, 1);
        Gryffindor two = new Gryffindor("Hermione", "Granger", 2, 2,
                2, 2, 2);
        Gryffindor three = new Gryffindor("Ron", "Weasly", 3, 3,
                3, 3, 3);


        Ravenclaw four = new Ravenclaw("Chang", "Zhou", 4, 4, 4,
                4, 4, 4);
        Ravenclaw five = new Ravenclaw("Tong", "Po", 5, 5, 5,
                5, 5, 5);
        Ravenclaw six = new Ravenclaw("Jebediah", "Springfield", 6, 6,
                6, 6, 6, 6);


        Hufflepuff seven = new Hufflepuff("Zaharia", "Smith", 7, 7,
                7, 7, 7);
        Hufflepuff eight = new Hufflepuff("Otto", "BeSmart", 8, 8,
                8, 8, 8);
        Hufflepuff nine = new Hufflepuff("MC", "Vspishkin", 9, 9,
                9, 9, 9);


        Slytherin ten = new Slytherin("Draco", "Malfoy", 10, 10,
                10, 10, 10, 10, 10);
        Slytherin eleven = new Slytherin("GiGi", "Augustino", 11, 11,
                11, 11, 11, 11, 11);
        Slytherin twelve = new Slytherin("OnePunch", "Man", 12, 12,
                12, 12, 12, 12, 12);


        Gryffindor.comparingStudentOfGryffindor(two, three);
        Ravenclaw.comparingStudentOfRavenclaw(four, five);
        Hufflepuff.comparingStudentOfHufflepuff(seven, eight);
        Slytherin.comparingStudentOfSlytherin(ten, eleven);

        Hogwarts.comparingStudent(one, twelve);
    }
}