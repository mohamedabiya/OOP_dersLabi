public class NoDuplicatePerson {
    int id;
    String firstName;
    String lastName;
    int age;
    private static int count = 1;

    NoDuplicatePerson(String firstName) {
//        this.firstName = firstName;
//        this.lastName = "";
//        this.age = 0;
//        this.id = ++count;
        this(firstName, "", 0, ++count);
    }

    NoDuplicatePerson(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = 0;
//        this.id = ++count;
        this(firstName, lastName, 0, ++count);
    }

    NoDuplicatePerson(String firstName, String lastName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.id = ++count;
        this(firstName, lastName, age, ++count);
    }

    // The goal is to reduce the amount of repetitive code that may be given during the exam.
    // All constructor functions execute only one constructor function.
    NoDuplicatePerson(String firstName, String lastName, int age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }
}