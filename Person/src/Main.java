public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Rohan");
        //person.setLastName("Kale");
        person.setLastName("");
        person.setAge(27);
        System.out.println(person.getFullName());
        System.out.println("Is the first name empty " + person.getFirstName().isEmpty());
        System.out.println("Is the last name empty " + person.getLastName().isEmpty());
        System.out.println("Is this person teen " + person.isTeen());
        System.out.println(" Name: " + person.getFirstName() + " Surname: " + person.getLastName());
        System.out.println("His age is "+ person.getAge());
    }
}