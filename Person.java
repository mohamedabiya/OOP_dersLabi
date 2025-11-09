public class Person {
    int id;
    String firstName;
    String lastName;
    int age;
    private static int count = 1;

    // Below are four different constructor classes.
    // There is code duplication here. How can we resolve this?
    // @NoDuplicatePerson class shows the solution.

    Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "";
        this.age = 0;
        this.id = ++count;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.id = ++count;
    }

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = ++count;
    }

    Person(String firstName, String lastName, int age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }
}