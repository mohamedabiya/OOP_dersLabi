public class PersonExample {
    public static void main(String[] args) {
        // we can create NoDuplicatePerson objects using different constructors
        // but all of them will execute the primary constructor logic to avoid code duplication
        // Check Person and NoDuplicatePerson classes for more details
        NoDuplicatePerson p1 = new NoDuplicatePerson("firstname");
        NoDuplicatePerson p2 = new NoDuplicatePerson("firstname", "lastname");
        NoDuplicatePerson p3 = new NoDuplicatePerson("firstname", "lastname", 25);
        NoDuplicatePerson p4 = new NoDuplicatePerson("firstname", "lastname", 25,  5);

        System.out.println(p1.id);
        System.out.println(p2.id);
        System.out.println(p3.id);
        System.out.println(p4.id);
    }
}
