public class Person {

    static String attr;
    static String groupName;
    private String name;
    private int age;
    private String gender;

    //default constructor

    public Person() {
    }

    //constructor

    public Person(String name, int age, String gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {

        return this.name;
    }

    public int getAge() {

        return this.age;
    }

    public String getGender() {

        return this.gender;
    }

    // toString getter

    public String toString() {

        return ("Name: " + this.name + "\nGender: " + this.gender + "\nAge: " + this.age);

    }
}
